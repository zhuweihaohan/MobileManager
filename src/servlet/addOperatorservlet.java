package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OperatorDao;
import vo.toperator;

public class addOperatorservlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String operatorId=request.getParameter("T1");
String operatorName=request.getParameter("T2");
String operatorPwd=request.getParameter("T3");
String isadmin=request.getParameter("R1");
toperator op=new toperator();
op.setIdAdmin(isadmin);
op.setOperatorId(operatorId);
op.setOperatorName(operatorName);
op.setOperatorPwd(operatorPwd);
OperatorDao dao=new OperatorDao();
dao.insert(op);
request.setAttribute("finish", "添加操作员完成");
request.getRequestDispatcher("finish.jsp").forward(request, response);
	}

}
