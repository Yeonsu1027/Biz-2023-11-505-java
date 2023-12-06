package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class NumbersB {

	public static void main(String[] args) {

		Line.dLine(50);
		System.out.println("숫자를 입력해 주세요 >>");
		Scanner scan = new Scanner(System.in); //Numberservice numbersvice = new Numberservice 로 스캔 불러오면 용량 줄일 수 있음
		String snum = scan.nextLine();
		Line.sLine(50);

		int num = 0;
		num = Integer.valueOf(snum);

		for (int i = 0; i < num; i++) { // for중첩 반복문 *이 1개~ 입력한개수 까지 출력하는걸
			for (int index = 0; index < i + 1; index++) {
				System.out.printf("* ");
			}
			System.out.println();// 안쪽 for문 한줄씩 출력되게 줄바꿈 추가
		}

		Line.sLine(50);
	}

}
