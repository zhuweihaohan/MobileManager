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

	OperatorDao dao=new OperatorDao();
	


		
		
		String mobileNumber1=request.getParameter("T1");

String mobileNumber2=request.getParameter("T2");
String mobileType=request.getParameter("R1");
int f=1;
for(long i=Long.parseLong(mobileNumber1);i<=Long.parseLong(mobileNumber2);i++){
boolean flag=dao.selectMobileByNum(mobileNumber1);
if(flag){
	request.setAttribute("exist", "这组号码中已有存在");
	request.getRequestDispatcher("resource.jsp").forward(request, response);
	f=0;
	break;
}}
if(f==1)
	{dao.createMobile(mobileNumber1,mobileNumber2,mobileType);
	request.setAttribute("finish", "资源管理操作完成");
	request.getRequestDispatcher("finish.jsp").forward(request, response);
	}	}
	}

