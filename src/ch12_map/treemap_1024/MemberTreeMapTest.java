package ch12_map.treemap_1024;

import java.util.Comparator;

import ch12_collection_1024.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "이상용3");
		Member memberLee = new Member(1001, "이상용1");
		Member memberHong = new Member(1004, "이상용4");
		Member memberSon = new Member(1002, "이상용2");
		
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberSon);
		
//		System.out.println(memberHashMap);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
