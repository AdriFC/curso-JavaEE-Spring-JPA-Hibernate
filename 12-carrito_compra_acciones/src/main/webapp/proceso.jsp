<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="item" class="beans.Item" scope="request"/>
	<jsp:setProperty property="*" name="item"/>
	<jsp:forward page="Comprar"/>
</body>
</html> 