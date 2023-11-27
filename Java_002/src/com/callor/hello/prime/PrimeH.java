package com.callor.hello.prime;

public class PrimeH {
	//2~100까지의 정수중 소수들의 합을 계산하여 출력 / 합 1060
	
	public static void main(String[] args) {
		int index = 0;
		int num =0;
		int sum= 0;
		
		for (int i =1; i < 100; i++) {
				num = i+1;
		 for (index = 2; index < num  ; index++) {
			 
				if (num  %index ==0) {
					break;
				}//if
				
			}//for2
			if (index < num) {
				
			}else {
				sum +=num;
			}//else
			
		}//for1
		System.out.println("==============================");
		System.out.println("2~100까지 수 중 소수들의 합 :"+sum);
		System.out.println("==============================");
		
	}

}
