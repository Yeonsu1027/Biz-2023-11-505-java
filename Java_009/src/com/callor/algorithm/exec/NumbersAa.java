package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersAa {
	
	//방법1
	
	public static void main(String[] args) {
		for(int i =0; i <10;i++) {  // i<10 은 일종의 if문.
			System.out.printf("%d\t",i+1);
		}
		
		
		
		//방법 2
		
		System.out.println();
		Line.dLine(50);
		
		int index = 0;
		
		while(index<10) {
			System.out.printf("%d\t",index+1);
			index++;
		}
		System.out.println();//줄바꿈
		index=0;
		while(true) {
			System.out.printf("%d\t",index+1);
			if(index>=10) {
				break;
			}
		}
		
		//방법3
		
		System.out.println();
		Line.dLine(50);
		index=0;
		while(index<10) {
			System.out.printf("%d\t",index++ +1);
		}
		
		
		
	}

}
