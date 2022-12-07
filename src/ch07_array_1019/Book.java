package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;

	//가격추가
	private int bookPrice;
	
	// 가격추가한 매개변수가 3개인 생성자 만들기.
	public Book(String bookName, String author, int bookPrice) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	
	public Book(){}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author + ","+ bookPrice);
	}
}
