package com.callor.hello.prime;

public class PrimeE {
	// 정수형 변수 num을 선언하고 Math.random() Method를 사용하여 2-101까지의
	// 범위의 임의의 정수 5개를 생성하고, 생성된 5의 정수가 소수인지 아닌지 판별하여 출력

	public static void main(String[] args) {

		int i = 0;

		System.out.println("=======================");
		System.out.println("소수 판별하기");
		System.out.println("-------------------------");

		for (i = 0; i < 5; i++) {
			int num = (int) Math.random() * 100 + 2;
			
			
			for (i = 2; i < num; i++) {
				if (i < num) {
					System.out.printf("%d MOD %d = %d, \n", num, i, num % i);
					System.out.println(num + "는 소수가 아님");
				} else {
					System.out.println(num + " 는 소수임");

				}

			}

		}
	}
}
