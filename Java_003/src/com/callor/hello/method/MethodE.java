package com.callor.hello.method;

public class MethodE {
	//동생에게 2000원을주고, 편의점에서 컵라면을 사오도록 심부름을 시킨다
	// 컵라면은 가격이 1500원이다
	//컵라면을 구입한 후 거스름돈을 return 한다
	//main 에서는 buy() method 에게 2000원을 전달하면서, 호출하고 거스름돈 결과를 change 변수에 할당(보관)한다
	//buy에게 전달한 값과 거스름돈을 console에출력
	
	int money = 2000;
	
	public static int buy() {
		int cup = 1500;
		int money = 2000;
		
		return money-cup;
		
	}
	
	
	public static void main(String[] args) {
		int change = buy();
	//	System.out.printf("buy 에게 전달한 값 : %d, 거스름돈 : %d",money,change);
		
	}

}
