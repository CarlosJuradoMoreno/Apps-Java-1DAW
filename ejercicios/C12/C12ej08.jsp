<%--Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
ese número. El resultado se debe mostrar en una tabla (<table> en HTML).--%>
<%--Realiza un conversor de euros a pesetas.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
	<style type="text/css">
		form{
			text-align: center;
		}
		table, td, tr{
			border-collapse: collapse;
			border: 1px solid black;
			padding: 5px
		}
		table{
			text-align:center;
			margin:auto;
		}
	</style>
</head>
<body>
	<form method="get" action="C12ej08.jsp">                                                                                                    
		Inserte el numero del que necesite su tabla<br>
		<input type="text" name="n1" value="1"/>
		<input type="submit" value="Crear" />
		<br>
		<br>
	</form>
	<br>
	
	<%
		if(request.getParameter("n1")!=null){
			int numero=Integer.parseInt(request.getParameter("n1"));
			out.print("<table>");
			for(int i=0;i<=10;i++){
				out.print("<tr>");
				out.print("<td>");
				out.print(i+"*"+numero);
				out.print("</td>");
				out.print("<td>");
				out.print(i*numero);
				out.print("</td>");
				out.print("</tr>");
			}


			out.print("</table>");
	}
	%>
</body>

</html>