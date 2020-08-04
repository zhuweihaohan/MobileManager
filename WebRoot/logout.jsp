<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'logout.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    <%
  session.removeAttribute("username");
    session.removeAttribute("isadmin");
   session.invalidate();
    Cookie[] cookies=request.getCookies();
if(cookies!=null)
{
for(int i=0;i<cookies.length;i++){
String sp = cookies[i].getName();
if(sp.equals("username"))
{
cookies[i].setMaxAge(0);
response.addCookie(cookies[i]);
}
if(sp.equals("password"))
{
cookies[i].setMaxAge(0);
response.addCookie(cookies[i]);
}
}
   response.sendRedirect("index.jsp");
  
}
    %>
  </body>
</html>
