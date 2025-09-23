<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
    Map<String, Object> user = (Map<String, Object>) request.getAttribute("user");
%>
<b>YOUR INFORMATION:</b>
<ul>
    <li>Fullname: <%= user.get("fullname") %></li>
    <li>Gender: <%= user.get("gender") %></li>
    <li>Country: <%= user.get("country") %></li>
</ul>
</body>
</html>