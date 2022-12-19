package studentInfoEx.school;

import java.util.ArrayList;

public class School {

	// 외부에서 해당 객체 생성 안됩니다.
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good School";
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School(){}
	
	//싱글톤 패턴적용. 해당 학교 클래스의 객체를 외부에서 생성 못하고. 
	//반드시 이 getInstance 메서드를 호출해야지만, 해당 학교 객체를 이용가능. 
	// 널 체크성 알고리즘임. 체크성 구조는 자주 보게됩니다. 당분간.
	public static School getInstance(){
		if(instance == null) 
			instance = new School();
		return instance;
	}
	//학교 클래스안에 구성요소 중에서, 학생 목록, 과목 목록 각각 ArrayList 형임. 객체.
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	// 해당 학생을 학생 목록에 추가.
	public void addStudent(Student student){
		studentList.add(student);
	}
	// 해당 과목을 과목 목록에 추가.
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	// 해당 과목 리스트를 가죠오기.
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	// 해당 과목 리스트를 설정.
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}
