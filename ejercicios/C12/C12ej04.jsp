<%--Realiza una aplicación que calcule la media de tres notas.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
</head>
<body>
	<form method="get" action="C12ej04.jsp">
		Inserte notas:<br>                                                                                                     
		<input type="text" name="n1" />
		<input type="text" name="n2" />
		<input type="text" name="n3" />
		<input type="submit" value="Media" />
		
	</form>
	<%
		
		if((request.getParameter("n1")!=null)&&(request.getParameter("n2"))!=null&&(request.getParameter("n3")!=null)){
			int nota1;
			int nota2; 
			int nota3;
			int media=0;
			nota1=Integer.parseInt(request.getParameter("n1"));
			nota2=Integer.parseInt(request.getParameter("n2"));
			nota3=Integer.parseInt(request.getParameter("n3"));
			media=(nota1+nota2+nota3)/3;

			out.print("Media: "+ media);
		}
	%>
	
	<br>
	
</body>

</html>