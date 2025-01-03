package day18.step2_JDBC;

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	// * 
	private String DBURL = "jdbc:mysql://localhost:3306/mydb0103";
	private String DBID = "root";
	private String DBPWD = "1234";
	// + JDBC 인터페이스
	private Connection conn;
	
	// + 싱글톤
	// 1단계. 디폴트 생성자 private 한다. 
	private Dao() {
		// *JDBC 연동* : 싱글톤이 생성될때 DB 연동이 된다.
		try {
			//  1. 드라이버 로드한다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB서버와 연결 시도
			conn = DriverManager.getConnection( DBURL , DBID , DBPWD );
			System.out.println("[ DB연동 성공]");
		}catch( ClassNotFoundException e ) {
			System.out.println(">> JDBC 드라이버가 없습니다." + e );
		}catch( SQLException e ) {
			System.out.println(">> DB연동 실패 " + e );
		}
	} // f end
	// 2단계. private static 인스턴스 생성한다.
	private static Dao instance = new Dao();
	// 3단계. 싱글톤 반환 함수.
	public static Dao getInstance() { return instance; }
	
	// 1. insert
	public void insert( ) {
		try {
			// (1) SQL 작성
			String sql = "insert into user( uname , uage ) values('유재석' , '30')";
			// (2) SQL 기재 , prepare 준비 , Statement 기재 : 연동된 db에 SQL를 기재하고 기재된 SQL 객체 반환
			PreparedStatement ps = conn.prepareStatement(sql);
			// (3) 기재된 SQL 실행 , 
			// executeUpdate() : 현재 기재된 SQL를 실행 하고 처리한 레코드 수 반환 함수 . int 반환
			// (4) SQL 실행 결과 반환 받기
			int count = ps.executeUpdate();
			// (5) 반환 결과를 조작하기
			if( count == 1 ) { System.out.println("[insert 성공]"); return; }
		}catch( SQLException e ) { System.out.println( e ); }
		System.out.println("[insert 실패]");
	} // f end
	
	// 2. select
	public void select( ) {
		try {
			// (1) SQL 작성
			String sql = "select * from user ";
			// (2) SQL 기대
			PreparedStatement ps = conn.prepareStatement(sql);
			// (3) 기재된 SQL 실행 , select => executeQuery
			// executeQuery() : 현재 기재된 SQL를 실행 하고 조회 결과를 조작 가능한 인스턴스 반환 함수 , ResultSet 반환			
			// (4) SQL 실행 결과 반환 받기
			ResultSet rs = ps.executeQuery();
			// (5) 반환 결과를 조작하기 .next() : 조회 결과에서 다음 레코드로 이동 함수, 다음 레코드 존재하면 true 다음레코드 없으면 false
			// rs.next(); // 즉] 6개의 레코드가 존재하면 .next() 함수는 6번 실행 가능하다.
			while( rs.next() ) { // 첫번째 레코드 부터 마지막 레코드까지 하나씩 이동
				// rs.get타입("속성명"); // 현재 레코드의 속성값 반환 함수. 타입 일치.
				System.out.printf(" %d \t %s \t %d \n " , 
						rs.getInt("uno") ,
						rs.getString("uname")  ,
						rs.getInt("uage") );
			} // while end
		}catch( SQLException e ) { System.out.println( e ); }
	} // f end
	
	// 3. update
	
	public void update( ) {
		try {
			// (1) SQL 작성
			String sql = "update user set uname = '강호동' where uno = 5"; 
			// (2) SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// (3) 기재된 SQL 실행 하고 반환받기
			int count = ps.executeUpdate();
			// (4) 반환 결과를 조작하기
			if( count == 1 ) {
				System.out.println("[update 성공]");
				return;
			}
		}catch( SQLException e ) {
			System.out.println( e );
		}
		System.out.println("[update 실패]");
	} // f end
	
	// 4. delete
	public void delete( ) {
		try {
			String sql = "delete from user where uno = 1";
			PreparedStatement ps = conn.prepareStatement(sql);
			int count = ps.executeUpdate();
			if( count == 1 ) {
				System.out.println("[delete 성공]"); return;
			}
		}catch( SQLException e ) { System.out.println( e ); }
		System.out.println("[delete 실패]");
	} // f end
	
	
	
	
	
	
	
} // class end
