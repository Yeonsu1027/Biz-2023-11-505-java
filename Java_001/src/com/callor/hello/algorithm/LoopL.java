package com.callor.hello.algorithm;

public class LoopL {
	public static void main(String[] args) {
		//1-100까지 숫자중 짝수만 덧셈해서, index =0
		
		int sum=0;
		int ranage = 100;
		
		for(int i = 0; i<ranage; i++) {
			if((i+1)%2==0) {
				sum += (i + 1);
			}// if문
		}//for문
		System.out.println("1부터"+ranage+"까지 덧셈결과 : "+sum);
	
	}

}
