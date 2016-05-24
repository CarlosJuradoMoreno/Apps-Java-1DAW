    <%-- 
    Document   : Guarda
    Created on : 24-may-2016, 3:46:53
    Author     : carlo
--%>

<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      s.execute("UPDATE personal SET nombre='" + request.getParameter("nombre") + "', apellido='" + request.getParameter("apellido") + "', replica='" + request.getParameter("replica") +  "', campo='" + Integer.parseInt(request.getParameter("campo")) +"', sancion='" + request.getParameter("sancion") + "' WHERE codigo=" + request.getParameter("codigo"));
      conexion.close();
    %>
    <script>document.location = "index.jsp"</script>
  </body>
</html>
