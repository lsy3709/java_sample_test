package ch05_test3_1205;

public class FishBreadTest {

	public static void main(String[] args) {
		//클래스명 참조형변수(객체이름) = new 클래스명(); 
		FishBread fishBread1 = new FishBread();
		// 기본 생성자 : FishBread();
		// 해당 변수에 처음에 값을 할당하는 역할, 초기화라고 이야기함. 
		// 변수, powder : String, redBean : String, 기본적으로 
		// 값을 할당을 하지 않아서, 기본값이 null -> 해당 참조형(주솟값) 할당이 안되었음.
		fishBread1.setPowder("이상용 기법의 반죽(사실 빵가루임...)");
		fishBread1.setRedBean("설탕(갈색 설탕)을 추가한 팥");
		fishBread1.showInfo();
		
		FishBread fishBread2 = new FishBread("빵가루2","설탕 팥");
		
		
		

	}

}
