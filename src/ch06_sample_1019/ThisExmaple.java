package ch06_sample_1019;
class BirthDay{

	int day;
	int month;
	int year;
	String name;
	
	//해당 멤버의 set/get 다 만들어서 -> 해결.
	// BirthDay 의 객체를 하나 생성해보기. 참조형 변수 : ex1 -> 해결.
	// 매개변수가 3개인 생성자를 통해서 만들어보기. -> 해결.
	// 해당 값을 출력하는 메서드 :showInfo 만들어보기. -> 해결.
	// showInfo 출력 해보기. -> 해결.
	
	// 추가 주문.
	// 멤버에 변수에 name 추가하기. -> 해결
	// 멤버로 set/get 를 추가하기. -> 해결
	// 해당 생성자를 매개변수가 4개인 추가하기. -> 해결 
	// 해당 생성자 매개변수가 4개를 호출하는 객체를 생성 후.  -> 해결 
	// showInfo2 메서드를 만들어서 출력해보기. -> 해결 
	// 출력의 예
	// 2022년 12월 5일 , 이름: 이상용(자기이름)
	
	public void showInfo() {
		System.out.println("년월일 출력 예제: " +year + "년 " + month+"월 "+ day + "일");
		
	}
	
	public void showInfo2() {
		System.out.println(year + "년 " + month+"월 "+ day + "일" + " 이름 : " + getName());
		
	}
	
	//매개변수가 4개인 생성자 만들었음.
	public BirthDay(int day, int month, int year, String name) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	//매개변수가 3개인 생성자 만들었음.
	public BirthDay(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void printThis() {
		System.out.println(this);  //this 출력해보기
	}
}

public class ThisExmaple {

	public static void main(String[] args) {
		
		BirthDay ex1 = new BirthDay(5,12,2022);
		ex1.showInfo();
		BirthDay ex2 = new BirthDay(5,12,2022,"이상용");
		System.out.println("기존 출력 : 년월일");
		ex2.showInfo();
		
		System.out.println("2022년 12월 5일 , 이름: 이상용(자기이름) 형식으로 출력해보기.");
		ex2.showInfo2();
		
		//이름 변경하기. 
		
		ex2.setName("이상용2");
		System.out.println("이름 변경후 showInfo2 호출하기.");
		ex2.showInfo2();
		
//		BirthDay bDay = new BirthDay();
//		bDay.setYear(2000);
//		System.out.println(bDay);
//		bDay.printThis();
	}
}
