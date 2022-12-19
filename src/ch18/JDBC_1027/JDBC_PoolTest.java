package ch18.JDBC_1027;

import java.util.ArrayList;

public class JDBC_PoolTest {
	public static void main(String[] args) {
	      JDBC_PoolDAO dao = new JDBC_PoolDAO(); 
		  //JDBC_PoolDAO 클래스를 사용하기 위해서 객체를 생성. 
		  
	      ArrayList<JDBC_PoolDTO> list = dao.select();
	      // JDBC_PoolDAO 클래스 객체의 select() 메소드를 호출한다. 
	      // 결과값으로 dept 테이블의 모든 레코드를 저장하고 있는 
	      // ArrayList 객체를 리턴받는다. 
		  
	      for(JDBC_PoolDTO dto : list) {
	    	  // 향상된 for 문을 이용해서 ArrayList 객체에 저장된 레코드의 값을 출력 한다. 
	    	  int deptno = dto.getDeptno();
	    	  String dname = dto.getDname();
	    	  String loc = dto.getLoc();
	    	  System.out.println(deptno + " "+ dname+ " "+ loc);
	      }

		}
}
