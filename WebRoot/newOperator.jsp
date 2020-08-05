<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<script src="jquery.js"></script>
<script >
$(document).ready(function(){
var t1=$("#T1");
var t3=$("#T3");
var t4=$("#T4");
var namef=0;
var passf1=0;
var passf2=0;
t3.blur(function(){
var pass1=t3.val();
 if(pass1.length<6)
{$("#sp2").empty(); 
$("#sp2").append("<font color='red'>太短了</font>");
}
else if(pass1.length>16)
{$("#sp2").empty(); 
$("#sp2").append("<font color='red'>太长了</font>");}
else{
var str=/^[0-9]*$/
var str1=/^[a-zA-Z]*$/
if(str.test(pass1)||str1.test(pass1))
{$("#sp2").empty(); 
$("#sp2").append("<font color='red'>至少有个字母或数字</font>");
}
 else{$("#sp2").empty(); 
$("#sp2").append("<font color='green'>正确</font>");
passf1=1;
 }
} 
if(namef==1&&passf1==1&&passf2==1)
{$("#tijiao").attr("disabled", false);}
}

)
t4.blur(function(){
var pass_1=t3.val();
var pass_2=t4.val();
if(pass_1==pass_2){
$("#sp3").empty(); 
$("#sp3").append("<font color='green'>一致</font>");
passf2=1;
}
else{
$("#sp3").empty(); 
$("#sp3").append("<font color='red'>不一致</font>");
}

if(namef==1&&passf1==1&&passf2==1)
{
$("#tijiao").attr("disabled", false);}
})
t1.blur(function(){
var t1value=t1.val();
$.ajax({
url:"checkopName",
type:"POST",
data:"opname="+t1value,
success:function(data){
if(data=="true"){
$("#sp1").empty();  
$("#sp1").append("<font color='green'>ID可用</font>");
namef=1;
}
else{
$("#sp1").empty(); 
$("#sp1").append("<font color='red'>ID已存在</font>");
}
}
})

if(namef==1&&passf1==1&&passf2==1)
{$("#tijiao").attr("disabled", false);}
})
})
</script>
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
      <p>登录ID：<input type="text" id="T1" name="T1" size="20" ><span id="sp1" ></span></p>
      <p>姓 名：<input type="text" id="T2"name="T2" size="20" ></p>
      <p>密码：<input type="password" id="T3" name="T3" size="20" ><span id="sp2" ></span></p>
      <p>密码确认：<input type="password" id="T4" name="T4" size="20" ><span id="sp3" ></span></p>
      <p>是否管理员：<input type="radio" value="Y"  name="R1">是&nbsp;&nbsp;&nbsp; 
      <input type="radio" name="R1" value="N" checked>否</p>
      <p><input type="submit" value="提交" id="tijiao" name="B1" disabled></p>
    </form>
    </TD>
    </TR>
  </TBODY></TABLE> 
  </rapid:override>
<%@ include file="framework.jsp" %>