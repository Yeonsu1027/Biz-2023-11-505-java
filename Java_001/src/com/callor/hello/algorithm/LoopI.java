package com.callor.hello.algorithm;

public class LoopI {
	public static void main(String[] args) {
		//for단일 1-100까지중 7의배수 i=0부터
		
		for(int i =0; i<100 ; i++) {
			
			int n = i+1;  
			if(n%7==0) { //7의 배수만, 조건을 주고 조건을 만족하는 것만 출력
				System.out.printf("%3d",n);  //-한거
				
				
				//for(int i =0; i<100 ; i++) {
				//System.out.printf("%3d",i+1);
				
				
				
				
			}
		}
	}

}
