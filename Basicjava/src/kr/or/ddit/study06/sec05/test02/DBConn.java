package kr.or.ddit.study06.sec05.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {// 싱글톤 - 하나만 접속하기 위해서
	private static Connection	conn = null; //실직적으로 DB 접속
	
	private DBConn() {
		
	}
	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@192.168.142.37:1521:xe"; // IP주소 및 포트(:1521) 변경가능.
		String user = "JSY90"; 
		String password = "java";
	
		if(conn == null) {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
		return conn;
	}
}
