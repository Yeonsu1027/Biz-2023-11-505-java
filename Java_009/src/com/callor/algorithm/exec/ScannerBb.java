package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerBb {
	
	public static int inputNum(String title) {//매개변수
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(title+" 을(를) 입력해 주세요 >> ");
			String str = scan.nextLine();
			
			int num =0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("**정수를 정확히 입력해 주세요**");
				continue;
			}
			return num;
			
		}
	}
	
	public static void main(String[] args) {
		
		Line.dLine(50);
		int num1 = inputNum(" 첫 번째 정수"); //meht(매개변수)
		int num2 = inputNum(" 두 번째 정수");
		
		Line.sLine(50);
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		
		
	}

}
