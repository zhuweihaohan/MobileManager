package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBTools {

	private static Connection conn = null;
	private static final String URL = "jdbc:mysql://localhost:3306/mobilemanager?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PASSWORD = "rootroot";
	private static PreparedStatement pstat = null;
	private static ResultSet rs = null;
	static{
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//编写一个方法获取数据库的连接对象
	public static Connection getConn(){
		if(conn==null){
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void execute(String sql,Object...objs){
		conn = getConn();
		try {
			pstat = conn.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					pstat.setObject(i+1, objs[i]);
				}
			}
			pstat.execute();
			commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rollback();
		}
		
	}
	public static List<Object[]> executeQuery(String sql,Object...objs){
		List<Object[]> list = new ArrayList<Object[]>();
		conn = getConn();
		try {
			pstat = conn.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					pstat.setObject(i+1, objs[i]);
				}
			}
			rs = pstat.executeQuery();
			while(rs.next()){
				Object[] obj = new Object[rs.getMetaData().getColumnCount()];
				for(int i=0;i<obj.length;i++){
					obj[i] = rs.getObject(i+1);
				}
				list.add(obj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	public static void commit(){
		if(conn!=null){
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			}
		}
	}
	public static void rollback(){
		if(conn!=null){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			}
		}
	}
	public static void close(){
		if(pstat!=null){
			try {
				pstat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
		
	}
}
