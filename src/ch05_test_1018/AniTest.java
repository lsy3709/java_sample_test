package ch05_test_1018;

public class AniTest {

	public static void main(String[] args) {
		//객체를 생성.
//클래스명 참조형_변수 = new 클래스의기본생성자();
		// dog 라는 이름의(참조형) 변수를 선언.
		// 객체를 생성했음.
		Animal dog = new  Animal();
		//강아지 이름,나이 설정.
		dog.name="강아지";
		dog.age=1;
		// 기본 메서드 하나 출력. 
		dog.showInfo();
		
		
	}

}
