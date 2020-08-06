<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 <script src="jquery.js"></script>
 <script>
$(document).ready(function(){

})
</script>
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
    <form method="POST" action="charge?operator=set">
      <p>收费项目：<select size="1" name="D1">
        <option value="A">开户费</option>
        <option value="B">漫游费</option>
        <option value="C">押金</option>
        <option value="D">入网费</option>
        <option value="E">选号费</option>
      </select></p>
      <p>收费金额：<input type="text" name="T1" id="T1" size="20" ><span id="sp1"></span></p>
      <p><input type="submit" id="tijiao" value="提交" name="B1" ><input type="reset" value="全部重写" name="B2"></p>
    </form>
    <hr>
    <h2>业务收费</h2>
    <form method="POST" action="charge?operator=open">
      <p>业务：<select size="1" name="D1">
        <option>开户业务</option>
      </select></p>
      <p>收费项目：<input type="checkbox" name="c1" id="C1" checked value="ON">开户费 
      <input type="checkbox" name="c2" id="C2" value="ON">漫游费 <input type="checkbox" name="c3" id="C3" value="ON">押金 
      <input type="checkbox" name="c4" id="C4" checked value="ON">入网费 <input type="checkbox" name="c5" id="C5" checked value="ON">选号费</p>
      <p><input type="submit"  value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>   
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
