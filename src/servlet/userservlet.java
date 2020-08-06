package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.customerDao;
import vo.Mobile;
import vo.User;
import vo.customer;

public class userservlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerDao dao=new customerDao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String operator=request.getParameter("operator");
		if(operator.equals("check"))
		{
			String id=request.getParameter("id");
			String type=request.getParameter("ty");
			boolean flag=dao.selectByIdAndType(id,type);
			if(flag)
			{out.print("yicunzai");}
			else{
				out.print("no");
			}
		}
		if(operator.equals("add1"))
		{
			String id=request.getParameter("T2");
			String type=request.getParameter("D1");
			request.setAttribute("id", id);
			request.setAttribute("type", type);
			request.getRequestDispatcher("newCustomer1.jsp").forward(request, response);
		}
		if(operator.equals("add2")){
			String itype=request.getParameter("itype");
			String id=request.getParameter("id");
			String name=request.getParameter("T1");
			String sex=request.getParameter("R1");
			if(sex.equals("V1"))
			{sex="男";}
			else if(sex.equals("V2"))
			{sex="女";}
			String bir=request.getParameter("bir");
			Date date=new Date(bir);
			String address=request.getParameter("T4");
			customer c=new customer(itype,id,name,date,sex,address);
			dao.insert(c);
			
			List<Mobile> list=dao.selectAllMobiles();
			request.setAttribute("mobiles", list);
			customer cid=dao.selectByCustomernum(id);
			request.setAttribute("cid", cid);
			request.getRequestDispatcher("newC.jsp").forward(request, response);
		}
		if(operator.equals("add3"))
		{ UserDao userDao=new UserDao();
			String phonenumber=request.getParameter("number");
			String cname=request.getParameter("cname");
			String caddress=request.getParameter("caddress");
	       dao.insertAccount(phonenumber,cname,caddress);
	       int customerId=Integer.parseInt(request.getParameter("T2"));
	       String status=request.getParameter("R1");
	       String level=request.getParameter("R2");
User user=new User(customerId,phonenumber,phonenumber,status,level);
userDao.insert(user);
	  request.setAttribute("finish", "添加用户完成");
	  request.getRequestDispatcher("finish.jsp").forward(request, response);
		}
	}

}
