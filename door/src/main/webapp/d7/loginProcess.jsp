<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
username: <%= request.getParameter("username") %>
<br>
password: <%= request.getParameter("password") %>
// DB 값하고 비교
</body>
</html>