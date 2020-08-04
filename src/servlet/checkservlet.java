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

	//��ȡ�������
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	//�ж�����Ĳ����Ƿ�Ϊ��
	if(username==null||username.trim().equals("")||password==null||password.trim().equals("")){
		
		req.setAttribute("error", "�û��������벻��Ϊ��");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		return ;
	}else{
		
		OperatorDao dao = new OperatorDao();
		toperator t=new toperator();
		t.setOperatorId(username);
		t = (toperator) dao.selectById(t);
		if(t==null){
			req.setAttribute("error", "�û���������");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			return ;
			
		}else{
			if(password.equals(t.getOperatorPwd())){
				HttpSession session = req.getSession();
				session.setAttribute("operatorName", t.getOperatorName());
				session.setAttribute("isadmin", t.getIdAdmin());
				
				   req.getRequestDispatcher("main.htm").forward(req, resp);
				
				
			}else{
				req.setAttribute("error", "���벻��ȷ");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
				return ;
				
			}
			
		}
	}
	
}}
