package servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.Marshaller.Listener;

import dao.OperatorDao;
import dao.UserDao;
import vo.User;
import vo.toperator;

public class checkservlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
	
	}

	
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//获取请求参数
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	//判断输入的参数是否为空
	if(username==null||username.trim().equals("")||password==null||password.trim().equals("")){
		
		req.setAttribute("error", "用户名或密码不能为空");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		return ;
	}else{
		
		OperatorDao dao = new OperatorDao();
		toperator t=new toperator();
		t.setOperatorId(username);
		t = (toperator) dao.selectById(t);
		if(t==null){
			req.setAttribute("error", "用户名不存在");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			return ;
			
		}else{
			if(password.equals(t.getOperatorPwd())){
				HttpSession session = req.getSession();
				session.setAttribute("operatorName", t.getOperatorName());
				session.setAttribute("isadmin", t.getIdAdmin());
				 String ifj=req.getParameter("ifj");
				   String time=req.getParameter("time");
				  String name=req.getParameter("username");
				  String pass=req.getParameter("password");
				   if(ifj!=null)
				   { System.out.println("记住密码");
					   Cookie c1=new Cookie("username",name); 
				   Cookie c2=new Cookie("password",pass); 
				   if(!time.equals("1"))
				   {int t1=Integer.parseInt(time);
				   c1.setMaxAge(t1);
				   c2.setMaxAge(t1);
				   }
				   resp.addCookie(c1);
				   resp.addCookie(c2);
				   }
				   
				req.setAttribute("operator", t);
				   req.getRequestDispatcher("main.jsp").forward(req, resp);
				
				
			}else{
				req.setAttribute("error", "密码不正确");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
				return ;
				
			}
			
		}
	}
	
}}
