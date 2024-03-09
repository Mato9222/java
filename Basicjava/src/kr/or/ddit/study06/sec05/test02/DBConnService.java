package kr.or.ddit.study06.sec05.test02;

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
	}
	
	public void selectAll() {
		conn = DBConn.getConnection(); //F2 서라운드, 쿼리를 db로 보내기 위한.
		try {
			stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql); //쿼리를 rs 로 보냄
			while(rs.next()) {  
				String id 	= rs.getNString("mem_id");
				String pass = rs.getNString("mem_pass");
				String name = rs.getNString("mem_name");
				System.out.printf("%s,%s,%s\n",id,pass,name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // 폴더 오른쪽 BUILD PTHE ->  OJDBC 넣기
}
