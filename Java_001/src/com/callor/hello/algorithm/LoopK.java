package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		//for반복문써서 1-35까지 덧셈 계산 결과를 출력 index는0부터
		
		int ranage = 35;
		int sum=0;
		for ( int i = 0; i<ranage ; i++) {
			sum += (i + 1);
			
		}
		System.out.printf("1~ %d까지 덧셈결과 : %d", ranage, sum);
	}

}
