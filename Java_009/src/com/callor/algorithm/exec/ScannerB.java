package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Line.dLine(50);
		System.out.println("첫번째 정수를 입력하세요 >>");

		int num1 = 0;
		int num2 = 0;

		while (true) {
			try {
				String str1 = scan.nextLine();
				num1 = Integer.valueOf(str1);

			} catch (Exception e) {
				System.out.println("정수가 아닙니다 정확히 입력하세요");
				continue;
			}

			System.out.println("두번째 정수를 입력하세요 >>");
			try {
				String str2 = scan.nextLine();
				num2 = Integer.valueOf(str2);

			} catch (Exception e) {
				System.out.println("정수가 아닙니다 정확히 입력하세요");
				continue; 
			}
			
			// ** 숫자 하나당 while 문 1개씩! while 끝에 break;!!

			Line.sLine(50);

			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);

			Line.dLine(50);

		}
	}

}
