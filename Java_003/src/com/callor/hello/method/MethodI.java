package com.callor.hello.method;

public class MethodI {
	// public int isPrime(int num) 울 선언
	// main method에서 2~101 범위의 수중 random 수를 5개 생성하여
	// isPrime method에게 전달
	// isprime 은 num이 소수면 num 을 return, 아니면 0을 return
	// isPrime method가 return 값을 변수에 저장하여 모두합산하여 출력

	public static int isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return 0;
			}
		}
		return num;

	}

	public static void main(String[] args) {
		System.out.println("=======================");
		System.out.println("소수의 합 구하기");
		System.out.println("-----------------------");

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = isPrime(num);
			if (index > 0) {
				System.out.printf("%3d 는 소수가 아님\n",num);

			} else {
				System.out.printf("%3d 는 소수임\n",num);
				
			}

		} // for
	
	//	int sum = isPrime();
	//	sum +=sum;
		System.out.println("-----------------------");
	
		System.out.println("소수의 합 :");
		
		System.out.println("=======================");
		
	}
}
