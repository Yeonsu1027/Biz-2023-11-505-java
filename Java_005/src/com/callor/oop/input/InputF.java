package com.callor.oop.input;
//Scanner를 활용하여 정수를 입력받고

//입력받은 정수가 짝수인지 아닌지 판별하여 console에출력
// 정수를 입력받는중 QUIT를 입력하면 종료. 그렇지 않으면 계속 반복
// 압룍벋운 값이 정수가 아니면 메시지를 보여주고 다시 입력받기
// 입력받은 정수는 2부터 10까지 범위의 정수 이어야 함
// 그렇지않으면 메시지를 보여주고 다시 입력받기

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Line.dLine(35);
		System.out.println(" 2부터 10까지의 정수를 입력하시오.");
		System.out.println(" 입력한 정수를 짝수인지 판별합니다");
		System.out.println(" 종료하려면 QUIT 를 입력해 주세요");
		Line.dLine(35);

		while (true) {

			System.out.println("정수 >>");
			String str = scan.nextLine();
			int num = Integer.valueOf(str);
			System.out.printf("입력한 수 : %d\n", num);

		
			try {
				num=Integer.valueOf(str);
				
				if (num <2 || num >10) {
				
				
				if (num%2 == 0) {
					System.out.printf("%d 는 짝수입니다\n", num);
					
				} else {
					System.out.printf("%d 는 짝수가 아닙니다.\n", num);
				}
				}else {
					System.out.printf("%d 는 2~10이 아닙니다\n",num);
				}
				
			} catch (Exception e) {
				System.out.printf(" %d 는 정수가 아닙니다.\n 다시입력하세요\n", num);
			}


		}//while
	}//main

}
