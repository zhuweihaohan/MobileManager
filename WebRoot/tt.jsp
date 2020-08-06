<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 <script src="jquery.js"></script>
 <script>
$(document).ready(function(){
var t1=$("#T1");
t1.blur(function(){
var str=/^[0-9]*$/
if(!str.test(t1.val()))
{
$("#sp1").append("<font color='red'>请输入数字</font>")

}
else if(str.test(t1.val())){
$("#tijiao").attr("disabled", false);
}
})
$("#C1").blur(function(){
var c1=$("#C1");
if(c1.is(':checked'))
{c1.attr("value","ON");
}
else if(!c1.is(':checked')){
c1.attr("value","NOo");
alert(c1.val());
}
})
$("#C2").blur(function(){
var c2=$("#C2");
if(c2.is(':checked'))
{c2.attr("value","ON");
}
else if(!c2.is(':checked')){
c2.attr("value","NOo");
}
})
$("#C3").blur(function(){
var c3=$("#C3");
if(c3.is(':checked'))
{c3.attr("value","ON");
}
else if(!c3.is(':checked')){
c3.attr("value","NOo");
}
})
$("#C4").blur(function(){
var c4=$("#C4");
if(c4.is(':checked'))
{c4.attr("value","ON");
}
else if(!c4.is(':checked')){
c4.attr("value","NOo");
}
})
$("#C5").blur(function(){
var c5=$("#C5");
if(c5.is(':checked'))
{c5.attr("value","ON");
}
else if(!c5.is(':checked')){
c5.attr("value","NOo");
}
})
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
      <p><input type="submit" id="tijiao" value="提交" name="B1" disabled><input type="reset" value="全部重写" name="B2"></p>
    </form>
    <hr>
    <h2>业务收费</h2>
    <form method="POST" action="charge?operator=open">
      <p>业务：<select size="1" name="D1">
        <option>开户业务</option>
      </select></p>
      <p>收费项目：<input type="checkbox" name="C1" id="C1" checked value="ON">开户费 
      <input type="checkbox" name="manyou" id="C2" value="wu">漫游费 <input type="checkbox" name="yajin" id="C3" value="wu">押金 
      <input type="checkbox" name="C4" id="C4" checked value="ON">入网费 <input type="checkbox" name="C5" id="C5" checked value="ON">选号费</p>
      <p><input type="submit"  value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
    </form>   
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
