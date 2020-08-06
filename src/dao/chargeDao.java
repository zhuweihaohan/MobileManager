package dao;

import java.util.List;

import tools.DBTools;
import vo.charge;
import vo.chargeRule;

public class chargeDao implements BaseDao{

	public void insert(Object t) {
		chargeRule r=(chargeRule)t;
		String sql="insert into tcharge_rule(func_id,charge_code,func_name) values("
				+ "?,?,?)";
		DBTools.execute(sql,r.getFuncId(),r.getChargeCode(),r.getFuncName());
	}

	public void update(Object t) {
		charge c=(charge) t;
		String sql="update tcharge set CHARGE=? where CHARGE_CODE=?";
		DBTools.execute(sql,c.getCharge(),c.getChargeCode());
	}

	@Override
	public void delete(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object selectById(Object t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete() {
		String sql="delete from tcharge_rule where func_id='O'";
		DBTools.execute(sql, null);
	}

}
