<%--Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
independientes para CSS para no mezclarlo con HTML).--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
</head>
<body>
	<form>
		Inserte nombre:<br>
		<input type="text" name="nombre"></input>
		<input type="submit"></input>
	</form>
	<br>
	<h4><% out.print("Hola "+request.getParameter("nombre"));%></h4>
</body>

</html>