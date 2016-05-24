<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        
             
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
   
  
    </head>
    <body>

         <%  
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");
        String codigo=request.getParameter("codigo");
        ResultSet listado= s.executeQuery("SELECT * from personal where personal.campo=\""+codigo+
        "\"");
        
        %>
        <h1 class="center"><i>AIRSOFT WORLD</i></h1>
            <table class="table table-striped">
              <thead><th>Código</th><th>Nombre</th><th>Apellido</th><th>Replica</th><th>Campo</th><th>Sanciones</th><th></th></thead>
              <%
                while (listado.next()) {
              %>
                  <tr>
                    <td><%=listado.getString("codigo") %></td>
                    <td><%=listado.getString("nombre") %></td>
                    <td><%=listado.getString("apellido") %></td>
                    <td><%=listado.getString("replica") %></td>
                    <td><%=listado.getString("campo") %></td>
                    <td><%=listado.getString("sancion") %></td>
                    <form method="post" action="Modificar.jsp">
                      <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                      <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                      <input type="hidden" name="apellido" value="<%=listado.getString("apellido") %>">
                      <input type="hidden" name="replica" value="<%=listado.getString("replica") %>">
                      <input type="hidden" name="campo" value="<%=listado.getString("campo") %>">
                      <input type="hidden" name="sancion" value="<%=listado.getString("sancion") %>">
                      <td>
                      <button class="btn btn-default" type="submit" name="editar">
                        Editar
                      </button>
                      </td>
                    </form>
                    <form method="post" action="baja.jsp">
                        <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                      <td>
                      <button class="btn btn-default" type="submit" name="borrar">
                        Borrar
                      </button>
                      </td>
                    </form>
                  </tr>      
        <%
              }
%>
            </table>
            <form method="post" action="alta.jsp">
                      <td>
                      <button class="btn btn-default" type="submit" name="alta">
                        <input type="hidden" name="codigo" value="<%=codigo%>">
                        Apuntarse
                        
                      </button>
                      </td>
                    </form>
                      
                       <form method="post" action="index.jsp">
                      <td>
                      <button class="btn btn-default"    type="submit" name="campos">
                        Campos
                      </button>
                      </td>
                    </form>
<%
      conexion.close();
        %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
         <script src="js/bootstrap.min.js"></script>
         
    </body>
</html>
