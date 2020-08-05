<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 
 <rapid:override name="frame-content"  >
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：配置业务费用</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
 


<h2>收费细项</h2>
    <form method="POST" action="--WEBBOT-SELF--">
      <p>收费项目：<select size="1" name="D1">
        <option>开户费</option>
        <option>漫游费</option>
        <option>押金</option>
        <option>入网费</option>
        <option>选号费</option>
      </select></p>
      <p>收费金额：<input type="text" name="T1" size="20" value="10"></p>
      <p><input type="submit" value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>
    <hr>
    <h2>业务收费</h2>
    <form method="POST" action="--WEBBOT-SELF--">
      <p>业务：<select size="1" name="D1">
        <option>开户业务</option>
      </select></p>
      <p>收费项目：<input type="checkbox" name="C1" value="ON" checked>开户费 
      <input type="checkbox" name="C2" value="ON">漫游费 <input type="checkbox" name="C3" value="ON">押金 
      <input type="checkbox" name="C4" value="ON" checked>入网费 <input type="checkbox" name="C5" value="ON" checked>选号费</p>
      <p><input type="submit" value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>   
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
