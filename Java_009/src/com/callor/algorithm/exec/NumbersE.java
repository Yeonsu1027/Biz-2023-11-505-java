package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersE {
	// 구구단 2단부터 9단까지 출력
	// 단 구구단의 결과 값이 짝수인 경우만 출력
	public static void main(String[] args) {

		int num = 0; // 단수용 //num단
		int i = 0; // x 곱하는 숫자용
		int sum = 0; // 짝수검사용 num*i

		for (num = 2; num < 10; num++) { // 2단 num부터 9단num까지
			Line.sLine(30);
			for (i = 1; i < 10; i++) { //x 1부터 9까지
				sum = num*i;
				if(sum%2==0) {
					
					System.out.printf("%d x %d = %d\n",num,i,sum);
					
				}
			}
		}

	}

}
