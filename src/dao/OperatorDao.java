package dao;

import java.util.List;

import tools.DBTools;
import vo.User;
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



	

}
