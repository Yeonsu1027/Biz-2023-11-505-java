package com.callor.number;

import java.util.Scanner;

public class numberQuiz_Goldenkey_norestart_ver {

	// 황금열쇠를 찾아라!
	// java_006에서 작성한 KeyboardC를 가져와 수정하여 만들었음.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean restart = true; // 재시작여부판단
		while (restart) {

			int num = 0;
			int rnd = (int) (Math.random() * 50) + 1; // 맞추어야할 1~50까지의 랜덤한정수 1개생성
			int sum = 0;
			int chance = 5;
			int index = 1;

			System.out.println("=".repeat(50));
			System.out.println("뤼팡의 황금열쇠를 찾아라");
			System.out.println("=".repeat(50));
			System.out.println(" 1~50까지의 숫자중 하나를 입력하여");
			System.out.println(" 황금열쇠를 찾으세요.");
			System.out.println("* 조건: 황금열쇠의 번호는 정수입니다 *\n* 기회는" + chance + "번입니다 *");
			System.out.println("=".repeat(50));
			System.out.println(" 황금열쇠 번호 입력 >>");

			// -----------------------------------------------------------------------------

			while (true) {
				String str = scan.nextLine(); // ****while안에서 입력받아야하므로 while문 안에 nextLine을 둔다 **입력받는곳
				if (str.equals("QUIT")) {
					break; // while 안에서 break를 만나면 반복에서 벗어나져, while문 밖에 게임종료가 출력
				}

				try {
					num = Integer.valueOf(str);

				} catch (Exception e) {
					System.out.println("'정수'를 정확히 입력하세요"); // 정수검사먼저하고..
					continue; // 정수아니면 처음으로
				}

				// 1~10의 숫자가맞는지 검사하고..
				if (num < 0 || num > 50) {
					System.out.println("값은 1~50 중에 입력해야 합니다");
					continue; // 범위내 값이 아니면 처음으로
				}

				// 입력한 숫자가 랜덤수와 같은지 확인

				if (num == rnd) {
					System.out.printf("참잘했어요 정답 : %d, %d번째의 시도 만에 열쇠를 찾았습니다!\n", num, index++);
					System.out.println(" 계속하려면 재시작하시고\n 종료하려면 QUIT를 입력하세요.");
					break;
				} else if (rnd > num) {
					System.out.printf("%d 보다 값이 큽니다 다시생각해보세요 남은기회 : %d 번\n", num, (chance - 1) - sum);
					sum = index++;
					/// else if 를 사용하는 이유는 else를 따로 사용할 경우 정답도 큰지, 작은지 검사가 되어버리기 때문에 효율을위해 else if를
					/// 사용한다.

				} else if (rnd < num) {
					System.out.printf("%d 보다 값이 작습니다 다시생각해보세요 남은기회 : %d 번\n", num, (chance - 1) - sum);
					sum = index++;
				}

				if (index > 5) {
					System.out.println("5번의 기회를 모두 소진하여");
					System.out.println("황금열쇠 찾기에 실패하였습니다..");
					System.out.println("다시 시도하려면 재시작하시고\n 종료하려면 QUIT를 입력 해주세요");

				}

			} // endwhile

			System.out.println("게임종료");

		}
	}

}
