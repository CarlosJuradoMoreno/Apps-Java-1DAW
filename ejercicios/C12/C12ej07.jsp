<%--Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
	<style>
	li.alineado{
		float:left;
	}

	</style>
</head>
<body>
	<form method="get" action="C12ej07.jsp">                                                                                                    
		<ul style="list-style-type:none">
		<li class="alineado"><input type="text" name="n1" /> Euros </li>
		<li >
			<ul style="list-style-type:none">
				<li><input type="radio" name="valor" value="1" checked/>Euros a pesetas</li>
				<li><input type="radio" name="valor" value="2"/>Pesetas a Euros</li>
			</ul>
		</li>
		<ul>

		<input type="submit" value="Convertir" />

		
	</form>
	<%
		
		if((request.getParameter("n1")!=null)){
			if(Integer.parseInt(request.getParameter("valor"))==1){
				double pesetas;
				double euros;
				euros= Double.parseDouble(request.getParameter("n1"));
				pesetas=euros*166.386;
			
			out.print(euros+" euros son "+pesetas+" Pesetas");
			}else{
				double pesetas;
				double euros;
				pesetas= Double.parseDouble(request.getParameter("n1"));
				euros=pesetas/166.386;
			
				out.print(pesetas+" Pesetas son "+euros+" euros");
			}
		}
	%>
	
	<br>
	
</body>

</html>