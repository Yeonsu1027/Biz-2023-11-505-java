package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardB {
	// while사용
//51부터 100까지 임의의 1부터 10까지의 수를 하나 생성
	// scanner를 사용하여 키보드로 부터 정수1부터 10까지의 값을 입력받기
	// random()으로 생성한 수가 키보드로 입력한 값과 맞으면 " 참 잘했어요 :000
	// 맞지 않으면 "다시한번시도해 보세요" 메시지를 보여주고 다시입력
	// ++ 맞지않으면 random값보다 입력한 값이 크면"값이 너무커요" 아니면 " 값이 너무 작아요"
	// 다시한번 잘생각해보세요 라고 메시지를 보여주고 다시 입력받기

	public static void main(String[] args) {
		System.out.println("* 숫자 맞추기 *");
		System.out.println("랜덤한 1~10까지의 정수중 하나를 찾습니다");
		System.out.println("1~10까지의 정수를 하나 입력해주세요");
		System.out.println("정수입력 >>");

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rnd = (int) (Math.random() * 10) + 1; // 맞추어야할 1~10까지의 랜덤한정수 1개생성

		// -----------------------------------------------------------------------------
		while (true) {
			String str = scan.nextLine(); // ****while안에서 입력받아야하므로 while문 안에 nextLine을 둔다 **입력받는곳

			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("'정수'를 정확히 입력하세요"); // 정수검사먼저하고..
				continue; // 정수아니면 처음으로
			}

			// 1~10의 숫자가맞는지 검사하고..
			if (num < 0 || num > 10) { // 범위 값은 0보다 작으면 안되고, 10보다 커선안됨. 1~10의 범위를 만듬. ||둘다 true여야 true
				// 틀린 범위의 값을 true로 하여 1-10범위가 아닐시 오류 출력
				System.out.println("값은 1~10 중에 입력해야 합니다");
				continue; // 범위내 값이 아니면 처음으로
			}

			// 입력한 숫자가 랜덤수와 같은지 확인
			if (num == rnd) {
				System.out.println("참잘했어요 정답 : " + num);
				break;
			} else if (rnd > num) {
				System.out.println(num + "보다 값이 큽니다 다시생각해보세요");         
				///else if 를 사용하는 이유는 else를 따로 사용할 경우 정답도 큰지, 작은지 검사가 되어버리기 때문에 효율을위해 else if를 사용한다.
				continue;
			} else if (rnd < num) {
				System.out.println(num + "보다 값이 작습니다 다시생각해보세요");
				continue;
			} 

		} // while
		System.out.println("게임종료");
	}

}
