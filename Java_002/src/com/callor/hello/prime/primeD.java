package com.callor.hello.prime;

public class primeD {
	//MAth.random() method를 사용하여 1-10까지 범위의 임의의 정수1개를 생성하여 num 변수에 할당
	//생성된 random 수가 소수인지 아닌지 판별하여 출력
	
	public static void main(String[] args) {
		
		int i = 0;
		
		//임의의 수 생성
		int num = (int)(Math.random() * 10)+2;
		
		
		System.out.println("=======================");
		System.out.println( num +"는 prime number 인가?");
		System.out.println("-------------------------");
		
		for (i = 2; 1< num ;i++ ) {  //2부터시작 i=2/1,0으로는 나눠볼필요x
			if(num%i ==0) {
				break;                       //소수를 판별하는부분
			}//if
			
		}//for
		if(i < num) {     ///판별결과 출력하기
			System.out.printf("%d MOD %d = %d, \n",
					num , i, num % i);
			System.out.println(num+"는 소수가 아님");        //f("  %d 는 소수가 아님\n",num)
		} else {
			System.out.println(num + " 는 소수임");
				
				
		
		}
		System.out.println("=======================");
	}

}
	
