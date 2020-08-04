package dao;

import java.util.List;

import tools.DBTools;
import vo.User;

public class UserDao implements BaseDao<User>{

	@Override
	public void insert(User t) {
		// TODO Auto-generated method stub
		
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
		String sql = "select * from user1 where username=?";
		
		List<Object[]> objs = DBTools.executeQuery(sql, t.getUsername());
		if(objs.size()>0){
			user = new User();
			Object[] obj = objs.get(0);
			String username = (String)obj[0];
			String password = (String)obj[1];
			String isadmin = (String)obj[2];
			user.setUsername(username);
			user.setPassword(password);
			user.setIsadmin(isadmin);
			
		}
		
		return user;
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
