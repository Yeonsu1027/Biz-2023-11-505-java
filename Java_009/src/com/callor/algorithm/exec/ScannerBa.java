package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerBa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		while (true) {
			System.out.println("첫번째 정수 >>");
			String str1 = scan.nextLine();
			try {
				num1 = Integer.valueOf(str1);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");
				continue;
			}
			break;
		}

		while (true) {
			System.out.println("두번째 정수 >>");
			String str2 = scan.nextLine();
			try {
				num2 = Integer.valueOf(str2);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");
				continue;
			}
			break;
		}

		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);

	}
}
