<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 
 <rapid:override name="frame-content"  >
       <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：新增客户>第二步</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    <form method="POST" action="newUser.htm">
      <p>证件类型：居民身份证</p>
      <p>证件号码：3323224123341</p>
      <p>姓名：<input type="text" name="T1" size="20" value="Tom"></p>
      <p>性别：<input type="radio" value="V1" checked name="R1">男&nbsp;&nbsp; <input type="radio" name="R1" value="V2">女</p>
      <p>生日：<input type="text" name="T3" size="20" value="1965/1/1"></p>
      <p>联系地址：<input type="text" name="T4" size="20" value="akjs askfa asjkfsa"></p>
      <p>　</p>
      <p><input type="submit" value="下一步>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
