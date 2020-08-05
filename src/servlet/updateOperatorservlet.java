package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OperatorDao;
import vo.toperator;

public class updateOperatorservlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
OperatorDao dao=new OperatorDao();
List<toperator> ops=dao.selectAll();
request.setAttribute("operators", ops);
request.getRequestDispatcher("updateOperator.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OperatorDao dao=new OperatorDao();
		String operator=request.getParameter("operator");
		if(operator.equals("find")){
		 String id=request.getParameter("opname");	
			toperator tope=new toperator();
					tope.setOperatorId(id);
				tope=dao.selectById(tope);
				PrintWriter out=response.getWriter();
				List<String> lists=new ArrayList<String>();
				lists.add(tope.getOperatorName());
				lists.add(tope.getOperatorPwd());
				lists.add(tope.getIdAdmin());
				out.print(lists);
				
		}
		else{
			String id=request.getParameter("T1");
			String name=request.getParameter("T2");
			String pwd=request.getParameter("T3").trim();
			String isadmin=request.getParameter("R1");
			toperator temptoperator=new toperator(id,name,pwd,isadmin);
			dao.update(temptoperator);
			request.setAttribute("finish", "修改操作员完成");
			request.getRequestDispatcher("finish.jsp").forward(request, response);
		}
	}

}
