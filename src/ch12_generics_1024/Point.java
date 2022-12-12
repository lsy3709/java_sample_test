package ch12_generics_1024;

public class Point<T, V> {
	// Integer T
	// Double V
	
	// 포함 관계 , has A 관계.
	T x; //Person 형
	V y; // Animal 형 
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() { //리턴 의 타입 : Integer 반환하구나.
			return x;
	}

	public V getY() {
		return y;
    }
}
