package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		
		// 정수변수num을 선언하고 임의의 정수를 대입,
		//for 반복문을 사용하여 2~num -1까지 반복하면서
		//나머지 연산수행 한 후 나머지가 한 번 이라고 0이 나타나면 "소수가아님"이라고 출력
		
		int num = 15;
		
		System.out.println("================================");
		System.out.println(num+" 는 Prime Number 인가?");
		System.out.println("--------------------------------");
		
		for(int i = 2 ; i<num ;i++) {
			if(num%i==0) {
				System.out.printf(" %d MOD %d = 0, %d 는 소수가 아님\n",num,i,num);
			}
		
		}
		System.out.println("================================");
	}

}
