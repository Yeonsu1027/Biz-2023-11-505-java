package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardA {
	// scanner 를 사용하여 10 이상의 정수를 입력받기
	// 1부터 입력받은 정수까지의 범위의 수중 짝수만 찾아서 console에 출력

	public static void main(String[] args) {

		System.out.println(" 10 이상의 정수를 입력해주세요");
		System.out.println(" 1부터 입력한 값까지 범위의 짝수를 검사합니다");
		System.out.println(" 정수 >> ");

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num =0;
		

		try {
			num = Integer.valueOf(str); //정상실행시 밖으로가짐

		} catch (Exception e) {
			System.out.printf(" %d는 정수가 아닙니다 다시 입력하세요", num);

		} // catch
		
		if (num>=10) {
			
		}

		for (int i = 1; i < num; i++) {
	//i부터num까지.... 어떻게..???
			if (num % 2 == 0) {
				System.out.printf(" %d 는 짝수입니다", num);

			}

		}

	}

}
