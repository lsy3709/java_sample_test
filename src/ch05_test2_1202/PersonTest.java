package ch05_test2_1202;

public class PersonTest {
   
	 public static void main(String[] args) {
		  Person lsy = new Person();
		  lsy.name="이상용";
		  lsy.height= 171F;
		  lsy.weight= 75F;
		  lsy.showInfo();
		  
		  Person lsy2 = new Person("이상용");
		  lsy2.height= 171F;
		  lsy2.weight= 75F;
		  lsy2.showInfo();
		  
		  Person lsy3 = new Person("이상용",171F,75F);
		  lsy3.showInfo();
//		  personKim.name = "������";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("�̼���", 175, 75);
	 }
}
