<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 
 <rapid:override name="frame-content"  >
     <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：新增用户</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    
     <form method="POST" action="saveInfo.htm">
      <p>手机号码：<input type="text" name="T1" size="20"></p>
      <p>漫游状态：<input type="radio" name="R1" value="V4" checked>省内漫游 <input type="radio" name="R1" value="V5">国内漫游 
      <input type="radio" name="R1" value="V6">国际漫游</p>
      <p>通话级别：<input type="radio" value="V1" checked name="R2">本地通话 
      <input type="radio" name="R2" value="V2">国内长途 <input type="radio" name="R2" value="V3">国际长途</p>
      <p>客户ID：<input type="text" name="T2" size="20" value="11100011" readonly></p>
      
      <p><input type="submit" value="完成>>" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>

    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
