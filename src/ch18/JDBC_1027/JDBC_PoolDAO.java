package ch18.JDBC_1027;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

public class JDBC_PoolDAO {
	BasicDataSource ds;
	  public JDBC_PoolDAO() {
		  ds = new BasicDataSource(); 
		  //Connection Pool 기능과 Thread-safe 기능을 갖춘 BasicDataSource
		  // 클래스의 객체를 생성한다. 이 클래스는 이클립스에 추가한 
		  //commons-dbcp-2.x.jar에 내장된 API이다. 
		  
		  ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		  ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		  ds.setUsername("system");
		  ds.setPassword("oracle"); 
		  // BasicDataSource 클래스의 객체에서 데이터베이스에 연결할 때
		  // 필요한 4가지 정보를 설정. 
		  
		  ds.setInitialSize(4); 
		  // setInitialSize() 메소드를 이용해서 Connection Pool에 초기값으로 
		  //4개의 Connection을 가질수 있도록 설정한다. 이 4개의 Connection 을 공유하면서
		  // 사용할수 있다.
	  }
			 public ArrayList<JDBC_PoolDTO>select(){
			   ArrayList<JDBC_PoolDTO> list = new ArrayList<JDBC_PoolDTO>();
			  Connection con = null;
			  PreparedStatement pstmt = null;
			  ResultSet rs = null;
			  try {
				 con = ds.getConnection(); // BasiceDataSource 의 객체에서 인자가 없는 
				 // getConnection() 메소드를 이용해서 Connection 객체를 얻는다.
				 // Pool에 저장되어 있던 Connection 객체가 반환된다. 
				 
				 String query = "SELECT deptno,dname,loc FROM dept"; 
				 //요청할 SQL  문을 String 변수에 저장한다.
				 
				 pstmt =con.prepareStatement(query); 
				 //SQL 문 전송에 필요한 PreparedStatement 객체를 
				 //Connection 객체의 preparedStatement(sql)메소드를 이용해서 얻는다. 
				 
				 rs = pstmt.executeQuery(); 
				 //SELECT 문을 요청하기 때문에 executeQuery() 메소드를 
				 //사용하며 결과는 ResultSet 객체로 받는다.
				 
				 while(rs.next()) {
				JDBC_PoolDTO dto = new JDBC_PoolDTO(); 
				// 각각의 레코드 정보를 JDBC_Ex_DTO 클래스의 객체에 저장한다. 
				
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto); // 저장된 JDBC_Ex_DTO 클래스의 객체를 누적시키기 위해서 
				// ArrayList 객체 저장한다. while 문이 모두 실행된 후에는 
				//dept 테이블의 모든 레코드가 
				// ArrayList 의 객체에 모두 저장된다. 
				 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }finally {
				 try {
					 if (rs != null) rs.close();
					 if (pstmt != null) pstmt.close();
					 if ( con != null) con.close();
				 }catch(SQLException e){
					 e.printStackTrace();
				 }
			 }
			 return list;
				 }
}
