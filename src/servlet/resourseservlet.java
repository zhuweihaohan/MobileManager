package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

import dao.OperatorDao;
import vo.Mobile;

public class resourseservlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String operator=request.getParameter("operator");
if(operator.equals("checkn")){
	String num=request.getParameter("num");
	System.out.println(num);
	OperatorDao dao=new OperatorDao();
	boolean flag=dao.selectMobileByNum(num);
	PrintWriter out=response.getWriter();
	if(flag)
		out.print("yes");
	else{out.print("no");}
}
else{
		
		
		String mobileNumber1=request.getParameter("T1");

String mobileNumber2=request.getParameter("T2");
String mobileType=request.getParameter("R1");
Mobile m=new Mobile();
OperatorDao dao=new OperatorDao();
	dao.createMobile(mobileNumber1,mobileNumber2,mobileType);	
	}
	}
}
