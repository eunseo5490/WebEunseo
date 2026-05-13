package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	
	//db 접속 정보
	//주소
	//아이디
	//비밀번호
	private static String url = "jdbc:mysql://localhost:3306/java_db";
	private static String user = "root";
	private static String password = "1234";
	
	//데이터 베이스 연결 객체를 반환하는 메서드
	public static Connection getConnection() {
		//연결 성공 시 connection 객체 반환
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("MySQL 연결 성공");
			
			return conn;
			
		} catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
		//실패하면 null을 반환
		return null;
		
		
	}
}
