<%--Realiza una aplicación que pinte una pirámide. La altura se pedirá en un formulario. La
pirámide estará hecha de bolitas, ladrillos o cualquier otra imagen.--%>
<%@page contentType="Text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="Text/html; charset=UTF-8">
	<style type="text/css">
		form{
			text-align: center;
		}
		#pepe{

		}
	</style>
</head>
<body>
	<form method="get" action="C12ej09.jsp">                                                                                                    
		Inserte el tamaño de la piramide
		<input type="text" name="n1" required autocomplete="off"/>
		<br>
		Inserte el valor de la piramide
		<input type="text" name="ladrillo" value="*"/>
		<br>
		<input type="submit" value="Crear" />
		<br>
		<br>
	</form>
	<br>
	
	<%
		if(request.getParameter("n1")!=null){
		String linea="";
		int altura=Integer.parseInt(request.getParameter("n1"));
		String caracter=request.getParameter("ladrillo");
    
	    for(int i=0;i<altura;i++){
	      //dibujo linea
	      for (int j=0;j<(altura)-i;j++){
	        linea+=caracter;
	      }
	      linea+="<br>";
	      //dibujo espacios
	      for (int e=0;e<=i;e++){
	        linea+="&nbsp;";					//Espacio
	      }
	    }
	   
	     out.println("<div id=\"pepe\">"+linea+"</div>");
    
	}
	%>
</body>

</html>