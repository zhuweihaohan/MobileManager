package dao;

import java.util.ArrayList;
import java.util.List;

import tools.DBTools;
import vo.Mobile;
import vo.toperator;

public class OperatorDao {

	
	
	public toperator selectById(toperator t) {
		toperator to = new toperator();
		String sql = "select * from toperator where OPERATOR_ID=?";
		
		List<Object[]> objs = DBTools.executeQuery(sql, t.getOperatorId());
		
		
		
		if(objs.size()>0){
			
			Object[] obj = objs.get(0);
			String operatorId=(String )obj[0];
			String operatorName=(String )obj[1];
			String operatorPwd=(String )obj[2];
			String isAdmin=(String )obj[3];
			
			to.setIdAdmin(isAdmin);
			to.setOperatorId(operatorId);
			to.setOperatorName(operatorName);
			to.setOperatorPwd(operatorPwd);
			return to;
		}
		else{
			return null;}
		
	}

	public void insert(toperator op) {
		String sql="insert into toperator(operator_id,operator_name,operator_pwd,is_admin)"
				+ "value(?,?,?,?)";
		DBTools.execute(sql, op.getOperatorId(),op.getOperatorName(),op.getOperatorPwd(),op.getIdAdmin());
		
	}

	public List<toperator> selectAll() {
List<toperator> ops = null;
		
		String sql = "select * from toperator";
		List<Object[]> objs = DBTools.executeQuery(sql, null);
		if(objs.size()>0){
			ops  = new ArrayList<toperator>();
			for(int i=0;i<objs.size();i++){
				Object[] obj = objs.get(i);
				String id = (String)obj[0];
				String name = (String)obj[1];
				String pwd = (String)obj[2];
				String isadmin=(String)obj[3];
				toperator t= new toperator(id, name, pwd, isadmin);
				ops.add(t);
			}
		}
		return ops;
		
	}

	public void update(toperator t) {
		String sql="update toperator set operator_name=?,operator_pwd=?,is_admin=? "
				+ "where operator_id=?";
		DBTools.execute(sql, t.getOperatorName(),t.getOperatorPwd(),t.getIdAdmin(),t.getOperatorId());
	}

	public void createMobile(String mobileNumber1, String mobileNumber2, String mobileType) {
		long num1=Long.parseLong(mobileNumber1);
		long num2=Long.parseLong(mobileNumber2);
		for(long i=num1;i<=num2;i++)
		{
			String sql="insert into tmobiles(mobile_number,mobile_type,card_number,is_available) "
					+ "value(?,?,?,?)";
			DBTools.execute(sql,i,mobileType,i,"N");
		}
	}

	public boolean selectMobileByNum(String num) {
		String sql="select * from tmobiles where mobile_number=?";
 List<Object[]> objs = DBTools.executeQuery(sql, num);
		
		
		
		if(objs.size()>0){
		return true;	
			
		}
		else{
			return false;
	}


	}
	

}
