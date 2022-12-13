package ch12_map.hashmap_1024;

import ch12_collection_1024.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		// 추가. 
		// 멤버 클래스를 참고해서, Animal 클래스 만들기. 
		// 멤버 클래스에 있는 인터페이스 및 메서드를 참고해서 
		// 출력시 내림 차순으로 출력하게끔. 
		// Animal 클래스 객체 4개 임의 만들기. 예) 고양이, 강아지, 호랑이, 원숭이 등..
		// 컬렉션은 MemberHashMap(클래스)  이용하기. 
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//Member 형 객체 4개 생성. 
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		// 해당 4개 객체를 컬렉션인 맵에 추가하고.
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		// 해당 컬렉션의 객체에 있는 수납도구에(메서드)를 이용해서 출력하기. 
		// 반복자를 이용하는 알고리즘이 포함되어 있음. 
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
