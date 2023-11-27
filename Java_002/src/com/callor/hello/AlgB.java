package com.callor.hello;

public class AlgB {
	public static void main(String[] args) {
		// 1-100까지의 숫자중 3의배수와 5의배수의 합을 계산하고
		// 3의 배수와 5의 배수의 합을 4칙연산하여 출력 , for단일, index=0

		int ranage = 100; // ~까지의 수
		int sum1 = 0;
		int sum2 = 0;
		
		

		for (int index = 0; index < ranage; index++) {          // 계산을 줄이기위하여 여러번 사용된 i+1을 변수로선언해주는 것이 좋음
			if ((index + 1) % 3 == 0) {                          // int num3 = i+1 ; (for문 아래에 선언)  /* 이 연산을 미리 한 번 수행하여
				sum1 += (index + 1);                             //결과를 변수에 보관해두고 활용

			} // if1

			if ((index + 1) % 5 == 0) {
				sum2 += (index + 1);
			} // if2

		} // for
		System.out.printf(" 1~%d까지의 수중 3과 5의 배수의 합 : %d\n ", ranage, sum1 + sum2);           // %d + %d =%d\n 형태로 쓰는게 깔끔하다..
		System.out.printf("1~%d까지의 수중 3과 5의 배수의 뺄셈 : %d\n ", ranage, sum1 - sum2);
		System.out.printf("1~%d까지의 수중 3과 5의 배수의 곱셈 : %d\n ", ranage, sum1 * sum2);
		System.out.printf("1~%d까지의 수중 3과 5의 배수의 나눗셈 : %d ", ranage, sum1 / sum2);
	}

}
