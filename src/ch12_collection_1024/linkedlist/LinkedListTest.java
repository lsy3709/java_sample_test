package ch12_collection_1024.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
//		String str1 = new String ();
//		str1 = "D";
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		System.out.println(myList.get(0).hashCode());
		myList.add(1, "D");
		
		System.out.println(myList);
		
		myList.addFirst("O");
		System.out.println(myList);
		System.out.println(myList.removeLast());
		
		System.out.println(myList);
	
	}
}
