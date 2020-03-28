package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	
	private String url = "jdbc:mysql://127.0.0.1:3306/xsyq?serverTimezone=UTC";
	private String username = "root";
	private String password = "root";
	
	//�������ݿⷽ��
	public Connection getCon() throws Exception {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	//�ر����ݿⷽ��
	public void closeCon(java.sql.Connection con) throws Exception {
		
		if(con != null) {
			con.close();
		}
	}
	
}
