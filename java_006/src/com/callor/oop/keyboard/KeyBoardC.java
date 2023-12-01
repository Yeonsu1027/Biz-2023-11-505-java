package com.callor.oop.keyboard;

import java.util.Scanner;

// + 키보드와 값이 맞으면 "참잘했어요 : 000"
// 몇번만에 정답을 맞췄는지 검사하기
// 정답을 맞췄으면 "00번째 정답맞춤"
// 정답을 계속 못찾으면, "5번째 정답 못 맞춤 실패", 실패하면 정답을 보여주고 종료.
// 기타 조건은 KeyBoardB와 같게

public class KeyBoardC {

	public static void main(String[] args) {
		System.out.println("* 숫자 맞추기 *");
		System.out.println("랜덤한 1~10까지의 정수중 하나를 찾습니다");
		System.out.println("1~10까지의 정수를 하나 입력해주세요");
		System.out.println("정수입력 >>");

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rnd = (int) (Math.random() * 10) + 1; // 맞추어야할 1~10까지의 랜덤한정수 1개생성
		
		
		int index = 1;
		int sum = 0;
		sum += index;

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
				System.out.printf("참잘했어요 정답 : %d, %d번째에 맞췄습니다\n",num,index++);
				break;
			} else if (rnd > num) {
				System.out.printf("%d 보다 값이 큽니다 다시생각해보세요 시도한 횟수 : %d\n",num,index++);
				/// else if 를 사용하는 이유는 else를 따로 사용할 경우 정답도 큰지, 작은지 검사가 되어버리기 때문에 효율을위해 else if를
				/// 사용한다.
				
			} else if (rnd < num) {
				System.out.printf("%d 보다 값이 작습니다 다시생각해보세요 시도한 횟수 : %d\n",num,index++);
			
			}
			
			
			

			
		} // while
		System.out.println("게임종료");
	}

}
