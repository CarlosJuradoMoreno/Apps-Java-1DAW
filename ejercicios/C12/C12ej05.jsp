<%--Realiza un conversor de euros a pesetas.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
</head>
<body>
	<form method="get" action="C12ej05.jsp">                                                                                                    
		<input type="text" name="n1" /> Pesetas
		
		<input type="submit" value="Convertir" />
		
	</form>
	<%
		
		if((request.getParameter("n1")!=null)){
			double pesetas;
			double euros;
			euros= Double.parseDouble(request.getParameter("n1"));
			pesetas=euros*166.386;
			
			out.print(euros+" euros son "+pesetas+" Pesetas");
		}
	%>
	
	<br>
	
</body>

</html>