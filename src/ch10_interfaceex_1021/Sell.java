package ch10_interfaceex_1021;

public interface Sell {
	
	void sell();
	
	default void order(){
		System.out.println("interface Sell 판매 주문");
	}
}



