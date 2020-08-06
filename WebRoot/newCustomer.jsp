<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<script src="jquery.js"> 
</script>
<script>
$(document).ready(function(){
$("#T2").blur(function(){
var d1=$("#D1");
var t2=$("#T2");
var str=/^[1-9]\d{5}(18|19|20|(3\d))\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
if(str.test(t2.val()))
{$("#sp1").empty();
$("#sp1").append("<font color='green'>格式正确</font>");
$.ajax({
url:"user",
type:"POST",
data:"operator=check&ty="+d1.val()+"&id="+t2.val(),
success:function(data){
if(data=="no")
{$("#sp1").empty();
$("#sp1").append("<font color='green'>可用</font>");
$("#tijiao").attr("disabled", false);
}
else{
$("#sp1").empty();
$("#sp1").append("<font color='red'>不可用</font>");
}
}
})

}
else{
$("#sp1").empty();
$("#sp1").append("<font color='red'>检查格式</font>");
}

})
})
</script>
 <rapid:override name="frame-content"  >
       <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD height=25>&nbsp;您现在的位置：新增客户>第一步</TD>
        </TR>
        <TR>
          <TD bgColor=#2650a6><IMG height=1 src="images\blank(1).gif" 
            width=1></TD></TR>
        <TR>
          <TD><IMG height=2 src="images\blank(1).gif" width=574></TD></TR></TBODY></TABLE></TD></TR>
  <TR vAlign=top>
    <TD height="600" bgColor=#f1f3f9>
    <form method="POST" action="user?operator=add1">
      <p>证件类型：<select size="1" name="D1" id="D1">
        <option value="居民身份证">居民身份证</option>
        <option value="护照">护照</option>
        <option value="军官证">军官证</option>
      </select></p>
      <p>证件号码：<input type="text" name="T2" id="T2" size="20" value="3323224123341"><span id="sp1"></span></p>
      
      <p>　</p>
      <p><input type="submit" id="tijiao" value="下一步>>" name="B1" disabled><input type="reset" value="全部重写" name="B2"></p>
    </form>
    
    </TD>
    </TR>
  </TBODY></TABLE>
  <BR>
  </rapid:override>
<%@ include file="framework.jsp" %>
