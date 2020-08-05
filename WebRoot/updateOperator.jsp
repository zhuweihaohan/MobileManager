<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
 <script src="jquery.js"></script>
<script >
$(document).ready(function(){
var t1=$("#T1");
var t3=$("#T3");
var t4=$("#T4");
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
if(passf1==1&&passf2==1)
{$("#tijiao").attr("disabled", false);}
}

)
t4.blur(function(){
if(passf1==1)
{var pass_1=t3.val();
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

if(passf1==1&&passf2==1)
{
$("#tijiao").attr("disabled", false);}
}})
t1.change(function(){
var t1value=t1.val();
 $.ajax({
url:"updateOperator",
type:"POST",
data:"operator=find&opname="+t1value,
success:function(data){
var str=data;
str=str.replace('[', '');//将字符串处理
str=str.replace(']','');
var arr=str.split(',');//取出字符

$("#T2").val(arr[0]);
$("#T3").val(arr[1]);
$("#T4").val(arr[1]);

var y=" Y";
if(arr[2]==y)
{$("#R11").attr("checked",true);
  }
else if(arr[2]==" N")
{
$("#R22").attr("checked",true);}
}
}) 
})


})
</script>
 <rapid:override name="frame-content"  >
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：修改操作员</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    <form method="POST" action="updateOperator?operator=update">
      <p>登录ID：
<select name="T1" id="T1">
<option value="no">--请选择--</option>
<c:forEach items="${operators}" var="o">
<option value="${o.getOperatorId()}">${o.getOperatorId()}</option>
</c:forEach>
</select>
</p>
     <p>姓 名：<input type="text" id="T2" name="T2" size="20" ></p>
      <p>密码：<input type="password" id="T3" name="T3" size="20" ><span id="sp2" ></span></p>
      <p>密码确认：<input type="password" id="T4" name="T4" size="20" ><span id="sp3" ></span></p>
      <p>是否管理员：<input type="radio" value="Y"  name="R1" id="R11">是&nbsp;&nbsp;&nbsp; 
      <input type="radio" name="R1" id="R22" value="N" >否</p>
      <p><input type="submit" value="提交" id="tijiao" name="B1" disabled></p>
    </form>
    </TD>
    </TR>
  </TBODY></TABLE> 
  </rapid:override>
<%@ include file="framework.jsp" %>
