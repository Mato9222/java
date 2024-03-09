package kr.or.ddit.study10.sec02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnService {
	private Connection	conn = null;
	private Statement	stmt = null;
	private ResultSet	rs = null;
	
	public static void main(String[] args) {
		DBConnService dbs = new DBConnService();
		dbs.selectAll();
		System.out.println("프로그램 실행  되고 있음.");
		System.out.println("프로그램 실행  되고 있음.");
		System.out.println("프로그램 실행  되고 있음.");
		System.out.println("프로그램 실행  되고 있음.");
	}
	
	public void selectAll() {
		conn = DBConn.getConnection(); //F2 서라운드, 쿼리를 db로 보내기 위한.
		try {
			System.out.println("실행 1");
			stmt = conn.createStatement();
			String sql = "select  from member";
			System.out.println("실행 2");
			rs = stmt.executeQuery(sql); //쿼리를 rs 로 보냄
			while(rs.next()) {  
				String id 	= rs.getNString("mem_id");
				String pass = rs.getNString("mem_pass");
				String name = rs.getNString("mem_name");
				System.out.printf("%s,%s,%s\n",id,pass,name);
				System.out.println("실행 3");
			}
			System.out.println("실행 4");
		} catch (SQLException e) {
			System.out.println("실행 5");
			e.printStackTrace();
		} finally { //DB접속 연결 끊기 //언제나 실행된다 .
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // 폴더 오른쪽 BUILD PTHE ->  OJDBC 넣기
}
