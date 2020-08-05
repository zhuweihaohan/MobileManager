<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<rapid:override name="frame-content"  >
     <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：新增操作员</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    <form method="POST" action="addOperator">
      <p>登录ID：<input type="text" name="T1" size="20" value="A00000001"></p>
      <p>姓 名：<input type="text" name="T2" size="20" value="张三"></p>
      <p>密码：<input type="password" name="T3" size="20" value="******"></p>
      <p>密码确认：<input type="password" name="T4" size="20" value="******"></p>
      <p>是否管理员：<input type="radio" value="V1" checked name="R1">是&nbsp;&nbsp;&nbsp; 
      <input type="radio" name="R1" value="V2">否</p>
      <p><input type="submit" value="提交" name="B1"></p>
    </form>
    </TD>
    </TR>
  </TBODY></TABLE> 
  </rapid:override>
<%@ include file="framework.jsp" %>