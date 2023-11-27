package com.callor.hello.prime;

public class PrimeG {
	// 2~100까지의 정수 중 소수들만 출력하기         //for 반복문으로 2-100까지 반복하는 동안 for문안에서 소수인가 검사

	public static void main(String[] args) {
		int i = 0;
		int num = 100;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
			}

		}

		if (i < num) {
		} else {
			System.out.printf(" %d 는 소수임\n", i);

		}
	}

}
