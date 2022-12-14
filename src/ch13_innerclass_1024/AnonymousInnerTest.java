package ch13_innerclass_1024;

class Outter2{
	
	//1 익명 클래스 선언만
	Runnable getRunnable(int i){

		int num = 100;
		
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	
	//2 익명클래스를 선언과 동시에 할당했음. 
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
	
		// 1번 , 정의(선언한 익명클래스) 여기서 할당해서 사용.
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		//2번 해당 객체를 바로 이용해서 메서드를 호출함. 
		out.runner.run();
	}
}
