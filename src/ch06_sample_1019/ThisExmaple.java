package ch06_sample_1019;
class BirthDay{

	int day;
	int month;
	int year;
	
	//해당 멤버의 set/get 다 만들어서 
	// BirthDay 의 객체를 하나 생성해보기. 참조형 변수 : ex1
	// 매개변수가 3개인 생성자를 통해서 만들어보기.
	// 해당 값을 출력하는 메서드 :showInfo 만들어보기.
	// showInfo 출력 해보기.
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);  //this 출력해보기
	}
}

public class ThisExmaple {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
