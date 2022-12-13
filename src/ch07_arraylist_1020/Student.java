package ch07_arraylist_1020;

import java.util.ArrayList;

public class Student { // Object 끝판 대장. 모든 클래스는 이 Object  상속.,
	
	//인스턴스 변수
	int studentID;
	String studentName;
	
	// 제너릭으로 유효성 검사처럼, 데이터 형이 , Subject이라는 형으로만
	// 들어 갈수 있다. 이 ArrayList 의 원소 타입.
	// Subject 타입의 참조형 변수(인스턴스)
	ArrayList<Subject> subjectList;
	
	ArrayList<Menu> LunchMenu;
		
	public Student(int studentID, String studentName){
//		super();
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		LunchMenu = new ArrayList<Menu>();
	}
	
	public void addMenu(String name, int price, String description){
		Menu menu = new Menu();
		
		menu.setName(name);
		menu.setPrice(price);
		menu.setDescription(description);
		LunchMenu.add(menu);
	}
	
	public void addSubject(String name, int score){
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		
		for(Subject s : subjectList){
			
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			        s.getScorePoint() + "입니다.");
		}
			
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
		
for(Menu menu : LunchMenu){
			
			
			System.out.println("학생 " + studentName + "의 " +" 점심메뉴 : " + 
			        menu.getName()+ " 가격 : "+menu.getPrice()+ "원 간단 위치 : "+ menu.getDescription() + "입니다.");
		}
	}
}
