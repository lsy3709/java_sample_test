package ch10_bookshelf_1021;

import java.util.ArrayList;

public class Shelf {

	//상속을 받은 클래스에서 보인다. 
	
	protected ArrayList<String> shelf;
	
	public Shelf(){
		// 기본 생성자 , 즉 Shelf 객체를 만들면, 자동으로 ArrayList가 만들어진다. 
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
}




