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
		System.out.println("dog의 주솟값");
		System.out.println(dog);
		System.out.println(dog.name);
		System.out.println(dog.age);
		
		//고양이 객체 생성, 이름, 나이 지정
		//출력도 한번 합니다.
		Animal cat = new Animal();
		cat.name = "야옹이";
		cat.age = 1;
		cat.showInfo();
		System.out.println("dog의 주솟값");
		System.out.println(dog);
		System.out.println("cat의 주솟값");
		System.out.println(cat);
		
		
	}

}
