<%-- 
    Document   : baja
    Created on : 23-may-2016, 14:05:54
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
      <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
            Statement s = conexion.createStatement();

            s.execute ("DELETE FROM personal WHERE codigo=" + request.getParameter("codigo"));
        %>  
       <script>document.location = "index.jsp"</script> 
    </body>
</html>