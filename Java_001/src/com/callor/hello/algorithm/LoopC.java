package com.callor.hello.algorithm;

public class LoopC {
	
	public static void main(String[] args) {

		
		
		for(int index = 0 ; index < 100; index++) {
			System.out.print("* ");     //별을 출력할때마다 count를 1씩 증가시키고
			// count++                 // 카운트가 10을 넘어가면 enter와 함께 count를 다시 초기화           
			// if(count >=10 {
			//	System.out.println();                   
			//	count = 0;
			
			//* 10개의 별을 출력한 후 줄바꿈을 해주면되겠다
			if ( index%10 == 9) {  //소수점 표시안되니, 0.1=1, 9번째까지 출력된 후 다음줄로  / 0~9(총10개*) 까지 출력 후 줄넘김.
		System.out.println(); }    //** 직접쓴거
			
		}
		System.out.println("=============================");   //**선생님정답  / 1~10(총10개*) 까지 출력 후 줄넘김.
		for(int index = 0; index < 100 ; index++) {
			System.out.print("* ");
			if((index + 1) % 10 ==0) {
				System.out.println();
			}
		}
		
		
	}

}
