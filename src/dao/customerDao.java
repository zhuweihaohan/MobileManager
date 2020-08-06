package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tools.DBTools;
import vo.Mobile;
import vo.customer;

public class customerDao implements BaseDao{

	@Override
	public void insert(Object t) {
		customer c=(customer)t;
		String sql="insert into tcustomer(id_type,id_number,customer_name,customer_birthday,customer_sex,customer_address) "
				+ "values(?,?,?,?,?,?)";
	DBTools.execute(sql,c.getIdType(),c.getIdNumber(),c.getCustomerName(),c.getCustomerBirthday(),c.getCustomerSex(),c.getCustomerAddress());
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		
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

	public boolean selectByIdAndType(String id, String type) {
		String sql="select * from tcustomer where id_number=? and id_type=?";
		List<Object[]> objs=DBTools.executeQuery(sql, id,type);
		if(objs.size()>0){
			return true;
		}
		else{
			return false;
		}
	}

	public List<Mobile> selectAllMobiles() {
List<Mobile> mobiles = null;
		
		String sql = "select * from tmobiles where is_available='N'";
		List<Object[]> objs = DBTools.executeQuery(sql, null);
		if(objs.size()>0){
			mobiles = new ArrayList<Mobile>();
			for(int i=0;i<objs.size();i++){
				Object[] obj = objs.get(i);
				String mobileNumber = (String)obj[0];
				String mobileType= (String)obj[1];
				String cardNumber = (String)obj[2];
				String isAvailable = (String)obj[3];
				
			Mobile m = new Mobile(mobileNumber, mobileType,cardNumber, isAvailable);
				mobiles.add(m);
			}
		}
		return mobiles;
	}

	public customer selectByCustomernum(String id) {
		String sql="select * from tcustomer where id_number=?";
		customer c=null;
		List<Object[]> objs=DBTools.executeQuery(sql, id);
		if(objs.size()>0){
			
				Object[] obj = objs.get(0);
				int customerId= (Integer)obj[0];
				String name=(String)obj[3];
				String address=(String)obj[6];
			 c=new customer();
			c.setCustomerId(customerId);
			c.setCustomerName(name);
			c.setCustomerAddress(address);
			}
		
		
		return c;
	}

	public void insertAccount(String phonenumber, String cname, String caddress) {
		String sql="insert into taccount(account_id,contact_person,contact_address,account_balance) values(?,?,?,?)";
		DBTools.execute(sql,phonenumber,cname,caddress,100);
		String sql1="update tmobiles set IS_AVAILABLE='Y' where MOBILE_NUMBER=?";
		DBTools.execute(sql1, phonenumber);
	}

}
