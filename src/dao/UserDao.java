package dao;

import java.util.List;

import tools.DBTools;
import vo.User;

public class UserDao implements BaseDao<User>{

	public void insert(User t) {
		String sql="insert into tuser(customer_id,account_id,mobile_number,roaming_status,com_level) values("
				+ "?,?,?,?,?)";
		DBTools.execute(sql,t.getCustomerId(),t.getAccountId(),t.getMobileNumber(),t.getRoamingStatus(),t.getComLevel());
		
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectById(User t) {
		User user = null;
		String sql = "select * from tuser where user_id=?";
		
		List<Object[]> objs = DBTools.executeQuery(sql, t.getUserId());
		
		
		
		if(objs.size()>0){
			
			Object[] obj = objs.get(0);
			int userId = Integer.parseInt((String)obj[0]);
			int customerId = Integer.parseInt((String)obj[1]);
			String accountId = (String)obj[2];
			String mobileNumber=(String )obj[3];
			String roamingStatus=(String )obj[4];
			String comLevel=(String )obj[5];
			user=new User(userId,customerId,accountId,mobileNumber,roamingStatus,comLevel);
			
		}
		
		return user;
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
