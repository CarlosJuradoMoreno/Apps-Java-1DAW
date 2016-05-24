<%-- 
    Document   : index
    Author     : carlo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <title><i>Airsoft World</i></title>
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

        
        %>
     
      
        <div id="fondo">
            <h1 class="text-center">Airsoft World</h1>
             
        
        <%
        ResultSet listado = s.executeQuery ("SELECT * FROM campos");
        while(listado.next()){
            
        
    %>
     
    <form action="persona.jsp">
       <table class="table text-center" >  
                 
        <tr>
             <td><h3 ><%=listado.getString("nombre") %></h3>
             <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
             <button class="btn btn-default" type="submit">Entrar</button>
             </td>
        </tr>
       
     </form>  
              </table>
    <%
        }
      conexion.close();
    %>
    </div>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    
      </body>
</html>