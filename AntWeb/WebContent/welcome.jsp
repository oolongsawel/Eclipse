<%@page import="com.multicampus.biz.user.UserDAO"%>
<%@page import="com.multicampus.biz.user.UserServiceImpl"%>
<%@page import="com.multicampus.biz.user.UserService"%>
<%@page import="com.multicampus.biz.user.UserVO"%>
<%@page language="java" contentType="text/html; charset=EUC-KR"%>

<%

String id = request.getParameter("id");
String password = request.getParameter("password");
UserVO vo = new UserVO();
vo.setId(id);
vo.setPassword(password);
UserService userService = new UserServiceImpl(new UserDAO());
UserVO user = userService.getUser(vo);

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<% if(user != null){%>
<h1><font color = "red"><%= user.getName() %></font> 님 환영합니다</h1>
<% } else {%>
<h1><font color ="red"><%= vo.getId() %></font>님 로그인실패</h1>
<% } %>
</center>
</body>
</html>