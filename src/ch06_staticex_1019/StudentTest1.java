package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {

		Student2 lsyStudent6 = new Student2();
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(2000);
		System.out.println(Student2.getSerialNum());


				
		//Student1 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여 되는지 확인. 
		Student1 lsyStudent3 = new Student1();
		System.out.println("lsyStudent3의 학번: "+lsyStudent3.studentID);
		
		Student1 lsyStudent4 = new Student1();
		System.out.println("lsyStudent4의 학번: "+lsyStudent4.studentID);
		
		Student1 lsyStudent5 = new Student1();
		System.out.println("lsyStudent5의 학번: "+lsyStudent5.studentID);
		
		
		//static 키워드에 접근 하는 방법.
		// 인스턴스 (객체를) 생성해서 접근. 비추.
		// 해당 클래스명으로 접근. 
		Student lsyStudent = new Student();
		lsyStudent.setStudentName("이상용");
		System.out.println(lsyStudent.serialNum);
		System.out.println(Student.serialNum);
		lsyStudent.serialNum++;
		System.out.println(lsyStudent.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println("lsyStudent2 의 정보 ");
		Student lsyStudent2 = new Student();
		System.out.println(lsyStudent2.serialNum);
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}

