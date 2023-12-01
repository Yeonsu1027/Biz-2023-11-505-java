package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputGa {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int lineLength = 30;
		Scanner scan = new Scanner(System.in);
		int num = 0;

		// 멈추고 싶을때까지 계속 반복하기
		while (true) {

			Line.dLine(lineLength);
			System.out.println("소수 찾기 프로젝트");
			Line.dLine(lineLength);
			System.out.println("2보다 큰 정수 값을 입력해주세요");
			System.out.println("정수>>");

			// 키보드에서 입력되기를 기다리다가
			// 입력이 완료되면(...Enter) 입력된 문자열을
			// str 변수에 할당
			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				break;
			}

			// 입력된 문자열을 먼저 정수로 변환하기
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해 주세요");

				System.out.printf("입력한 값 : (%s)\n", str); // 입력한 문자열을()를입력하여 확인
				// 다시 while 처음으로 점프
				continue;
			}

			// 정수로 정확히 입력했구나
			// 값의 유효성 검사(2이상의 정수가 입력되었나?)
			if (num < 2) {
				System.out.println("2이상의 정수를 입력해야 합니다");
				System.out.printf("입력한 값 : %d\n", num);
				continue;
			}
			// 소수검사
			if (isPrime(num)) {
				System.out.println(num + " 는 소수야@@@");
			} else {
				System.out.println(num + " 는 소수가 아니야 ㅠㅠ");
			}

		} // end while
		System.out.println("소수찾기 프로젝트를 종료합니다");

	}

}
