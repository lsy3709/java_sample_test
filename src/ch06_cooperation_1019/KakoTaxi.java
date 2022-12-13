package ch06_cooperation_1019;

public class KakoTaxi {
	   int kakoTaxiNumber;             // 버스 번호
		 int passengerCount;        // 승객 수
		 int money;                 // 버스의 수입
		    
		 public KakoTaxi(int kakoTaxiNumber)   // 버스 번호를 매개변수로 받는 생성자
		 {   
			  this.kakoTaxiNumber = kakoTaxiNumber;
		 }
		
		 public void take(int money)   // 승객이 낸 돈을 받음
		 {  
			  this.money += money;    // 버스의 수입 증가
			  passengerCount++;      // 승객 수 증가
		 }
		    
		 public void showInfo() {      // 버스 정보를 출력하는 함수
			  System.out.println("카카오택시 " + kakoTaxiNumber + "번의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
		 }


}
