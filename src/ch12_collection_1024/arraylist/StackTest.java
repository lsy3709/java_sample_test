package ch12_collection_1024.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0 ) { 
			System.out.println("������ ������ϴ�");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		stack.push("A"); // 1층
		stack.push("B"); // 2층
		stack.push("C"); // 3층
		
		System.out.println(stack.pop()); //3층
		System.out.println(stack.pop());//2층
		System.out.println(stack.pop());//1층
	}
}
