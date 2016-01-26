<%--Realiza un conversor de pesetas.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
</head>
<body>
	<form method="get" action="C12ej06.jsp">                                                                                                    
		<input type="text" name="n1" /> Euros 
		
		<input type="submit" value="Convertir" />
		
	</form>
	<%
		
		if((request.getParameter("n1")!=null)){
			double pesetas;
			double euros;
			pesetas= Double.parseDouble(request.getParameter("n1"));
			euros=pesetas/166.386;
			
			out.print(pesetas+" Pesetas son "+euros+" euros");
		}
	%>
	
	<br>
	
</body>

</html>