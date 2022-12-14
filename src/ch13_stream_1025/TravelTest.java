package ch13_stream_1025;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		//본인들이 TravelCustomer 재활용하고, 객체를 4개정도, 한개더 추가하고
		// 중간 연산, 최종연산을 이용해서 출력 하는예제.
		// 예1 , 인원스 카운트 
		// 예2 , 비용이 특정 조건 보다 비용 600000보다 많은 (많은 적은) 사람출력해보기.
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100000);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100000);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 500000);
		TravelCustomer customerlsy = new TravelCustomer("이상용", 39, 5000000);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerlsy);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은 :" + total + "입니다");
		
		int count = (int) customerList.stream().mapToInt(c->c.getPrice()).count();
		System.out.println("총 여행 인원 :" + count + "명 입니다");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("== 비용이 제일 많은 사람출력해보기. ==");
		customerList.stream().filter(c->c.getPrice() >= 600000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
