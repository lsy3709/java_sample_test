package ch10_interfaceex_1021;

public class Customer implements Buy, Sell, Refund{

	@Override
	public void buy() {
		System.out.println("Customer 구매하기");
	}

	@Override
	public void sell() {
		System.out.println("Customer 판매하기");
	}

	@Override
	public void order() {
		System.out.println("Customer order 고객 판매 주문");
	}

	@Override
	public void refund() {
		System.out.println("Customer refund 고객 환불하기.");
		
	}
}








