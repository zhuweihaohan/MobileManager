package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OperatorDao;
import vo.toperator;

public class checkopNameservlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		OperatorDao dao = new OperatorDao();
		toperator t=new toperator();
		
		String opname=(String)request.getParameter("opname");
		
	t.setOperatorId(opname);
	t = (toperator) dao.selectById(t);
	
	if(t==null){
		out.print("true");
		
	}else{
		out.print("false");
	}
	}

}
