package com.callor.hello.method;

public class MethodIa {
	
	/*
	 * num 값을 매개변수를 통하여 전달받아 소수인지 검사
	 * 소수이면 자신(num)을 return 아니면 0을 return
	 */
	
	public static int isPrime ( int num) {
		for ( int i = 2; i <num; i++) {
			if(num % i ==0) {
				return 0;  //소수가아닐때
			}
		}
		return num; //소수 일때 자신
	}
	
	
	public static void main(String[] args) {
		int sum=0; //for문 밖에 sum
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()*100)+2;
			// sum += isPrime(num);
			
			
			int result = isPrime(num);
			sum+= result;
			if(result>0) {
				System.out.println(result+"는 소수");
			} else {
				System.out.println(result+"는 소수아님");
			}
		}
		System.out.println("소수의 합 : " +sum);
		
	}

}
