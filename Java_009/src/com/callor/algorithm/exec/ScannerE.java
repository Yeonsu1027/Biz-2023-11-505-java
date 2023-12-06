package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Line.dLine(50);
		System.out.println(" 원하는 구구단 단수를 입력해 주세요 >>");
		
		String gugu = scan.nextLine();
		int num = 0;
		num = Integer.valueOf(gugu);
		
		
		Line.dLine(50);
		System.out.printf("%d 단 구구단\n",num);
		for(int i = 1; i<10 ; i++) {
			System.out.printf("%d x %d = %d\n",num,i,i*num);
		}
		
		Line.dLine(50);
		
	}
	
	

}
