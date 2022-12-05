package ch05_test3_1205;

public class FishBread {
	private String powder; //반죽
	private String redBean; // 팥
	
	//실제 데이터에 접근을 하는 방법
	// 직접 접근 할거냐?, set/get 라는 메서드 이용할거냐?
	// 예) 직접 접근 객체명.변수
	// 예2) getPowder() 메서드로 접근. 
	// 자동으로 해당 멤버들에 대해서 set/get 자동으로 만들었음. 
	
	// 기본 생성자 -> JVM이 자동으로 만들어줌. 조건) 해당 생성자가 하나도 없을 경우. 
	// 오버로드 -> 매개 변수가 2개인 생성자를 만들기.
	
	//기본생성자 -> 추가로 직접 만듦.
	public FishBread() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 2개인 생성자 -> 자동으로 만듦.
	public FishBread(String powder, String redBean) {
		super();
		this.powder = powder;
		this.redBean = redBean;
	}
	
	

	public String getPowder() {
		return powder;
	}
	
	public void setPowder(String powder) {
		this.powder = powder;
	}
	public String getRedBean() {
		return redBean;
	}
	public void setRedBean(String redBean) {
		this.redBean = redBean;
	}
	
	public void showInfo() {
		System.out.println("현재 반죽은 : " + powder +", 현재 팥은 : "+redBean);
		
	}
	

	
}
