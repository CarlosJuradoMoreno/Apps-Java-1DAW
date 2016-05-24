<%-- 
    Document   : Modificar
    Created on : 23-may-2016, 14:06:20
    Author     : carlo
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
   
  </head>
  <body>
     <%
        // carga la base de datos con este accedemos a la base de datos
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root", "");
        Statement s = conexion.createStatement();
        
        request.setCharacterEncoding("UTF-8");
        
        //mete el resultado de la consulta en la variable CodigoEscu
         ResultSet campo = s.executeQuery ("SELECT codigo, nombre FROM campos");
        %>
    <div>
      
      
          <h1 class="center">Datos de la persona</h1>
          
          <form method="post" action="Guarda.jsp">
              <table class="table striped-tabled">
                 <tr>
                     <td>
               <label for="codigo">código</label>
               <br>
              <input type="number" name="codigo" id="codigo" value="<%=request.getParameter("codigo") %>" readonly>
                     </td>
                    
                     <td>
               <label for="nombre">nombre</label>
               <br>
              <input type="text" name="nombre" id="nombre" value="<%=request.getParameter("nombre") %>" required>
            
                     </td>
                     <td>
                          <label for="apellido">Apellido</label>
                         <br>
              <input type="text" name="apellido" id="apellido" value="<%=request.getParameter("apellido") %>" required>
             
                     </td>
                     <td>
                         <label for="replica">replica</label>
                         <br>
              <input type="text" name="replica" id="campo" value="<%=request.getParameter("replica") %>" required>
              
                     </td>
                     <td>
                         <label for="campo">campo</label>
                         <br>

                          <select name ="campo" class="browser-default" required >   
                            <option selected value="0" disabled >Seleccione el campo</option>
                            <%
                            
                            while (campo.next()) {
                            %>
                            <option value="<%=campo.getString("codigo")%>"><%=campo.getString("nombre")%></option>
                            <%
                            }
                            %>
                            </select>
                     </td> 
                     <td>
                         <label for="campo">sancion</label>
                  <br>
              <input type="text" name="sancion" id="sancion" value="<%=request.getParameter("sancion") %>" required>
              
                     </td>
                 </tr>
      </table>
            
            <p class="center">
              <button class="btn btn-default" type="submit" name="aceptar">
              Aceptar
              <i class="mdi-action-check-circle"></i>
              </button>
              <a href="index.jsp" class="btn waves-effect waves-light center red">
              Cancelar
              <i class="fa fa-times"></i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
   
  </body>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
         <script src="js/bootstrap.min.js"></script>
</html>
