package com.callor.hello;

public class AlaA {
	public static void main(String[] args) {
		//1-100까지의 숫자중 3의 배수만의 덧셈을 계산하여 출력 index0, for반복문
		
		int ranage = 100;
		int sum = 0;
		
		for(int index = 0 ; index<ranage ; index++) {
			if ((index+1)%3==0) {
				sum += (index+1);
				
				
			}//if
			
		}//for
		
		System.out.printf("1~ %d 까지의 3의 배수의 합 : %d ",ranage, sum);
	}

}
