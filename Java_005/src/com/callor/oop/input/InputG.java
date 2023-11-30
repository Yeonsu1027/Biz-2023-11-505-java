package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputG {
	/*
	 * Scanner를 사용하여 정수를 입력받고 입력 받은 정수가 짝수인지 아닌지 판별하여 Console에 출력 정수를 입력받는 중 QUIT를
	 * 입력하면 종료, 그렇지 않으면 계속 반복
	 * 
	 * 입력 받은 정수는 2이상의 정수 이어야 함 그렇지 않으면 메시지를 보여주고 다시 입력받기 입력받은 정수가 소수인지 아닌지 판별하여
	 * console에 출력 소수 판별은 method를 분리해도 됨.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Line.dLine(35);
		System.out.println(" 2부터 10까지의 정수를 입력하시오.");
		System.out.println(" 입력한 정수를 짝수인지 판별합니다");
		System.out.println(" 입력한 정수가 소수인지 판별합니다");
		System.out.println(" *종료하려면 QUIT 를 입력해 주세요*");
		Line.dLine(35);

		while (true) {

			System.out.println(" *종료하려면 QUIT 를 입력해 주세요* \n 정수 >>");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("계산기 종료!");
				break;
			}
			int num = Integer.valueOf(str);
			// if(str.equals("QUIT")) {
			// return ;
			// }
			System.out.printf("입력한 수 : %d\n", num);
			int index = 0;
			
			for(index = 2;index<num ; index++) {
				if(num% index == 0) {
					break;
				}
				
				}
		
			if( index <num) { System.out.println("소수?");
				
			}
			

			try {

			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;
			}
			
			if (num < 2) {
				System.out.println("값은 2이상으로 입력해야 합니다");
				System.out.println("입력한 값 : " + num);
				continue;
			}

			if (num % 2 == 0) {
				System.out.println(num + " 는 짝수입니다 ");
			} else {
				System.out.println(num + " 는 짝수가 아닙니다. ");
			}

		} // while
	}// main

	public static void Prime() {

	}

}
