<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 <script src="jquery.js"></script>
<script >
$(document).ready(function(){
var t1=$("#T1");
var t2=$("#T2");

t2.blur(function(){
if(t2.val()<t1.val()){
alert("后面不能比前面大,请重写");
t2.attr("value","");
}
})
t1.blur(function(){
if(t2.val()<t1.val()){
alert("后面不能比前面大,请重写");
t2.attr("value","");
}
})
})
</script>
 <rapid:override name="frame-content"  >
       <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：资源管理</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
 

    <form method="POST" action="resourse">
    <p>号码类型：<input type="Radio" name="R1" name="MType" value="SIM" checked>SIM &nbsp;&nbsp;<input type="Radio" name="R1" name="MType" value="UIM">UIM</p>
    <p>指定号段：从<input type="text" id="T1" name="T1" size="20" value="13910000000">到<input type="text" name="T2" id="T2" size="20" value="13910000009"><input type="submit" value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    <span id="error"></span>
    </form>
    <hr>
    
    
 
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
