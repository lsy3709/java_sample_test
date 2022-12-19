package ch18.JDBC_1027;

public class JDBC_PoolDTO {
	int deptno; //5-8행 dept 테이블의 컬럼에 
	//해당하는 인스턴스 변수를 선언한다.
	String dname;
	String loc;

	public void setDeptno(int deptno) { //인스턴스 변수에 대한 Getter/Setter 메소드를 정의한다.  
				this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}

}
