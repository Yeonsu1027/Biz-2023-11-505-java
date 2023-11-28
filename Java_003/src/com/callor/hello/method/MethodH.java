package com.callor.hello.method;

public class MethodH {
	// boolean isPrime(int num) method 선언
	// main method에서 2~101 범위의 수중 random 수를 "5개"생성하여 //main에서 for를만듬
	// isPrime method에게 전달

	public static boolean isPrime(int num) {
		int index = 0;

		for (index = 2; index < num; index++) { // 소수를 판별
			if (num % index == 0) {
				return false;
			} // if
		} // for
		return true;
	}

	// isPrime

	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("소수판별하기");
		System.out.println("-----------------------------");
		for (int i = 0; i < 5; i++) { // 5개의 랜덤한 수 생성
			int num = (int) (Math.random() + 100) + 2; // 2~100까지
			boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.println(num + " 는 소수임");
			} else {
				System.out.printf("%d 는 소수가 아님\n",num);
			}//else
		} // for
		System.out.println("============================");
	}

}
