<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="vo.*" %>
<%@ page import="dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<%
  		request.setCharacterEncoding("UTF-8");
  		response.setCharacterEncoding("UTF-8");
  		//获取request中的属性
  		String error = (String)request.getAttribute("error");
  		if(error==null){
  			error="";
  		}
  		Cookie[] cookies=request.getCookies();
    String username1="";
    String lpass="";
    if(cookies!=null)
    {
    for(Cookie c:cookies)
    {
    
    if(c.getName().equals("username")) 
    {username1=c.getValue();}
    else if(c.getName().equals("password"))
     { lpass=c.getValue();}
    
    }
if(!username1.equals("")&&!lpass.equals(""))
{ OperatorDao dao = new OperatorDao();
		toperator t=new toperator();
		t.setOperatorId(username1);
		t = (toperator) dao.selectById(t);
t=dao.selectById(t);
if(t!=null&&lpass.equals(t.getOperatorPwd()));
session.setAttribute("username",t.getOperatorName());
session.setAttribute("isadmin",t.getIdAdmin());
request.setAttribute("operator", t);
request.getRequestDispatcher("main.jsp").forward(request, response);
}
    }
  	 %>
<HEAD>
<TITLE>中国移动业务管理系统</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=gb2312">
<style type="text/css">
<!--
body {
	background-color: #CCCCCC;
	margin-top: 10px;
}
-->
</style>
<link href="style.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY LEFTMARGIN=0 MARGINWIDTH=0>
<!-- ImageReady Slices (index.psd) -->
<TABLE WIDTH=750 BORDER=0 align="center" CELLPADDING=0 CELLSPACING=0>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_01.gif" WIDTH=444 HEIGHT=237 ALT=""></TD>
		<TD>
			<IMG SRC="images/index_02.gif" WIDTH=306 HEIGHT=99 ALT=""></TD>
	</TR>
	<TR>
		<TD>
			<IMG SRC="images/index_03.gif" WIDTH=306 HEIGHT=138 ALT=""></TD>
	</TR>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_04.gif" WIDTH=444 HEIGHT=363 ALT=""></TD>
		<TD width="306" height="185" background="images/index_05.gif"><table width="250" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><form  action="check" method=post >
              <div align="center">
                <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="30"><div align="center"><strong>用户名：</strong>
                        <INPUT name="username" type="text" value=""><font color="red">${error}</font>
                        <br>
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30"><div align="center"><strong>密&nbsp;&nbsp;&nbsp;码：</strong>
                        <INPUT name="password" type=password value="">
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30">
                      <div align="center">
                        <INPUT class=f2 type=submit size=4 value=进入系统 name=Submit>
                      </div></td>
                  </tr>
                 
                
                </table>
                   记住密码：<input type="checkbox" name="ifj" id="ifj"/>
   <select name="time" id="time">
    <option value="1">不限时</option>
   <option value="10">10秒</option>
    <option value="30">30秒</option>
     <option value="60">1分</option>
      <option value="600">10分</option></select>
                </div>
                
  
            </form></td>
          </tr>
        </table></TD>
	</TR>
	<TR>
		<TD>
			<IMG SRC="images/index_06.gif" WIDTH=306 HEIGHT=178 ALT=""></TD>
	</TR>
</TABLE>
<!-- End ImageReady Slices -->
</BODY>
</HTML>