<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%int n = Integer.parseInt(request.getParameter("numero"));%>
		<h1>Tabla del <%=n%></h1>
		<table border = "1">
			<%for (int i = 1; i <= 10; i++){%>
				<tr>
					<td><%= n+"X"+i%></td><td><%= n * i %></td>
				</tr>
			<%}%>
		</table>
	</center>
	<a href = "datos.html">Volver</a>
</body>
</html>