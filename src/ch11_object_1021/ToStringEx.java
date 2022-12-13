package ch11_object_1021;

class Book { // 암묵적으로 무엇을 상속을 받고 있죠? Object
	// Object toString 메서드가 존재합니다. 
	// 이 메서드는 의미가 없는 해당 메모리 주솟값을 출력을함.
	// 실제 작업은 데이터를 다루지, 주솟값을 다루지 않습니다. 그래서 재정의 함. 
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return "책제목 : " + bookTitle + "," + " 책번호 : "+ bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

