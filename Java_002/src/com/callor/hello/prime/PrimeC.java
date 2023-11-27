package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		//정수형 변수 num을 선언하고 임의의 정수를 대입, for 반복문으로 2~num-1까지 반복하면서
		//나머지 연산수행한후 나머지가 한번이라도 0이 나타나면 "소수가 아님", 그렇지 않으면 " 소수임" 이라고 출력

		int num =9;
		
		for(int i = 2; i<num ; i++) {
			if(num % i == 0) {
				System.out.println("=======================");
				System.out.printf("%d 는 prime number인가?\n",num);
				System.out.println("--------------------");
				System.out.printf("%d MOD %d = %d, " ,
						num, i, num%i);
				System.out.println(num+"는 소수가 아님");
				System.out.println("=======================");
				
					
			} //if1
			if(num%i!=0) {
				System.out.println("=======================");
				System.out.printf("%d 는 prime number인가?\n",num);
				System.out.println("--------------------");
				System.out.println(num+"는 소수임");
				System.out.println("=======================");
				
			} //if2
			break;
		}
		
		
	}

}
