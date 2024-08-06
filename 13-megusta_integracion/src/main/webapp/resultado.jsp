<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int contador = application .getAttribute("megusta")!=null?(Integer)application.getAttribute("megusta"):0;%>
	<center>
		<h1>El valor de megusta es: <%=contador%></h1>
		<a href='opciones.html'>Volver</a>
	</center>
</body>
</html>