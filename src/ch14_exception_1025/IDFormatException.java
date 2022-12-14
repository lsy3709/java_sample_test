package ch14_exception_1025;

public class IDFormatException extends Exception{
	// 사용자가 만든 임의의 클래스 , 상속 받았습니다.
	// 기존 메서드를 재사용 하기 위해서. 
	
	public IDFormatException(String message){
		// super 키워드를 보시면 부모 클래스 메서드를 사용한다. 
		super(message);
	}
}
