package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
	//while 문을 활용하여 1-10까지의 정수를 console 에 출력
	
	public static void main(String[] args) {
		
		Line.dLine(100);
		int i =1;  //0 하고 아래도10 출력에 +1해주면 더깔끔함
		while(i<11) {
			System.out.print(i++ +"\t");
			//System.out.printf("%d\t",index+1); //좀더 깔끔하게..
		}
	 System.out.println();//줄바꿈
		Line.dLine(100);
		
		
	}

}
