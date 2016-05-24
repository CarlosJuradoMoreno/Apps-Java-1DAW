<%-- 
    Document   : crear
    Created on : 24-may-2016, 2:56:50
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
        <title>Crea</title>
    </head>
    <body>
         <%
           Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

        // Inserta los datos en la base de datos No comprueba codigo porque es autoincremental, tmb suponemos 
        String insercion = "INSERT INTO personal (nombre, apellido, replica, campo, sancion) VALUES ('" + request.getParameter("nombre")
                  + "', '" + request.getParameter("apellido")
                  + "', '" + request.getParameter("replica")
                  + "', '" + request.getParameter("codigo")+ 
                    "', '" + Integer.parseInt(request.getParameter("sancion"))+
                "')";
        out.print(insercion);
        s.execute(insercion);         
        conexion.close();
      
        %>
        <script>document.location = "index.jsp"</script>
    </body>
</html>
