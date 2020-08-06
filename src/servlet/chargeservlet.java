package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.chargeDao;
import vo.charge;
import vo.chargeRule;

public class chargeservlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String operator=request.getParameter("operator");
if(operator.equals("set"))
{String id=request.getParameter("D1");
double money=Double.parseDouble(request.getParameter("T1"));
charge c=new charge();
c.setChargeCode(id);
c.setCharge(money);
chargeDao dao=new chargeDao();
dao.update(c);
request.setAttribute("finish", "����ҵ��������");
request.getRequestDispatcher("finish.jsp").forward(request, response);
}
else if(operator.equals("open"))
{ 
	String c1=request.getParameter("c1");
String c2=request.getParameter("c2");
String c3=request.getParameter("c3");
String c4=request.getParameter("c4");
String c5=request.getParameter("c5");
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);
System.out.println(c5);
chargeDao dao=new chargeDao();
dao.delete();

if(c1!=null&&c1.equals("ON"))
{ chargeRule rule=new chargeRule();
rule.setFuncId("O");
rule.setChargeCode("A");
rule.setFuncName("������");
dao.insert(rule);
	}
if(c2!=null&&c2.equals("ON"))
{ chargeRule rule=new chargeRule();
rule.setFuncId("O");
rule.setChargeCode("B");
rule.setFuncName("���η�");
dao.insert(rule);
	}
if(c3!=null&&c3.equals("ON"))
{ chargeRule rule=new chargeRule();
rule.setFuncId("O");
rule.setChargeCode("C");
rule.setFuncName("Ѻ��");
dao.insert(rule);
	}
if(c4!=null&&c4.equals("ON"))
{ chargeRule rule=new chargeRule();
rule.setFuncId("O");
rule.setChargeCode("D");
rule.setFuncName("������");
dao.insert(rule);
	}
if(c5!=null&&c5.equals("ON"))
{ chargeRule rule=new chargeRule();
rule.setFuncId("O");
rule.setChargeCode("E");
rule.setFuncName("ѡ�ŷ�");
dao.insert(rule);
	}
request.setAttribute("finish", "����ҵ���շ����");
request.getRequestDispatcher("finish.jsp").forward(request, response);
}
		
	}

}
