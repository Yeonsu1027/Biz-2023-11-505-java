package com.callor.number;

import java.util.Scanner;

public class numberQuiz_Goldenkey {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean restart = false; // 재시작 여부 판단
		
		int num = 0;
		int rnd = (int) (Math.random() * 50) + 1; // 맞추어야 할 1~50까지의 랜덤한 정수 1개 생성
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
		
		//-------------------------------------

		while (true) {
			if (restart) {  //restar=false
				System.out.println(" 황금열쇠 번호 입력 >>");
			}
			String str = scan.nextLine(); // 사용자의 입력을 받음

			if (str.equals("RESTART")) {
				// 게임을 재시작할 때 변수 초기화
				restart = true;
				rnd = (int) (Math.random() * 50) + 1;
				sum = 0;
				index = 1;
				continue; // 재시작을 선택한 경우, 다음 루프로 이동하여 게임을 다시 시작
				
			} else if (str.equals("QUIT")) {
				break; // 게임 종료를 선택한 경우, 반복문을 벗어나 게임을 종료
			}

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("'정수'를 정확히 입력하세요");
				continue;
			}
			
			if (num < 0 || num > 50) {
				System.out.println("값은 1~50 중에 입력해야 합니다"); 
				continue; // 범위내 값이 아니면 처음으로
			}

			// 입력한 숫자가 랜덤수와 같은지 확인
			if (num == rnd) {
				System.out.printf("참잘했어요 정답 : %d, %d번째의 시도 만에 열쇠를 찾았습니다!\n", num, index++);
				System.out.println("계속하려면 RESTART를 입력하시고 종료하려면 QUIT를 입력하세요.");
				restart = false;
				continue; // 게임 종료
			} else if (rnd > num) {
				System.out.printf("%d 보다 값이 큽니다 다시 생각해보세요 남은 기회: %d 번\n", num, (chance - 1) - sum);
			} else if (rnd < num) {
				System.out.printf("%d 보다 값이 작습니다 다시 생각해보세요 남은 기회: %d 번\n", num, (chance - 1) - sum);
			}

			sum = index++;
			if (index > 5) {
				System.out.println("5번의 기회를 모두 소진하여");
				System.out.println("황금열쇠 찾기에 실패하였습니다.");
				System.out.println("다시하려면 RESTART를 입력하시고 종료하려면 QUIT를 입력해주세요.");
				restart = false;
			}
		} // endwhile
		System.out.println("게임이 종료되었습니다");
	}

}
