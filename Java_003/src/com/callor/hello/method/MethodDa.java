package com.callor.hello.method;

public class MethodDa {
	
	/*
	 * 30과 40을 덧셈하여 결과(int type)를 return
	 */
	
	public static int add() {
		int num1 = 30;
		int num2 = 40;
		int result = num1+num2;
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * add() method 가 return 값은 int type 이므로
		 * int type 변수를 선언하고 return 값을 할당(보관)
		 */
		
		int sum = add();  //add 는 add method 의 return 값
		System.out.println("함수 return 값 : " +sum);
		
	}

}
