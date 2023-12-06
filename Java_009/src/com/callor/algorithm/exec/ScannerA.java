package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerA {
	
	// Scanner 클래스를 사용하여 키보드에서 2개의 정수를 입력받기
	// 입력받은 2개의 정수의 4칙연산과 나머지 연산을 수행하여 console에 출력
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Line.dLine(50);
		System.out.println("첫번째 정수를 입력하세요 >>");
		
		int num1 = 0;
		int num2 = 0;
		
		String str1 = scan.nextLine();
		num1 = Integer.valueOf(str1);
		
		System.out.println("두번째 정수를 입력하세요 >>");
		String str2 = scan.nextLine();
		num2 = Integer.valueOf(str2);
		
		Line.sLine(50);
		
		
		
		
		
		System.out.printf("%d + %d = %d\n",
				num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",
				num1,num2,num1-num2);
		System.out.printf("%d x %d = %d\n",
				num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n",
				num1,num2,num1/num2);
		System.out.printf("%d MOD %d = %d",
				num1,num2,num1%num2);
		
		Line.dLine(50);
		
		
	}
	
	
	
	

}
