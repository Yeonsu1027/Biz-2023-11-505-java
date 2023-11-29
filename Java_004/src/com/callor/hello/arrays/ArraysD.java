package com.callor.hello.arrays;

public class ArraysD {
	// 10명학생의 국,영,수 점수를 저장할 배열 선언
	// 51부터 100까지 범위의 임의의 점수를 생성하여 배열 각요소에 할당

	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKor = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		int i = 0;

		// 국어 점수
		for (i = 0; i < scoreKor.length; i++) {
			int rndKor = (int) (Math.random() * 50) + 51;
			scoreKor[i] = rndKor;
		}
		// 영어 점수
		for (i = 0; i < scoreEng.length; i++) {
			int rndEng = (int) (Math.random() * 50) + 51;
			scoreEng[i] = rndEng;
		}
		// 수학 점수
		for (i = 0; i < scoreMath.length; i++) {
			int rndMath = (int) (Math.random() * 50) + 51;
			scoreMath[i] = rndMath;
		}
		// 총점
		for (i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] = scoreKor[i] + scoreEng[i] + scoreMath[i];
		}

		for (i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float) sum[i] / 3;
		}

		for (i = 0; i < STUDENT_LENGTH; i++) {
			for (i = 0; i < scoreKor.length; i++) {
				System.out.printf("%d", scoreKor[i]);
			}
			for (i = 0; i < scoreEng.length; i++) {
				System.out.printf("%d", scoreEng[i]);
			}
			for (i = 0; i < scoreMath.length; i++) {
				System.out.printf("%d", scoreMath[i]);

			}

			System.out.println("=".repeat(50));
			System.out.println("  샛별반 성적표  ");
			System.out.println("-".repeat(50));
			System.out.println("국어  영어  수학  총점  평균");
			System.out.println("-".repeat(50));

			for (i = 0; i < STUDENT_LENGTH; i++) {//순서대로 출력하기 위함

				System.out.printf(" %3d   %3d   %3d  %3d   %.2f  \n", scoreKor[i], scoreEng[i], scoreMath[i],sum[i],avg[i]);

			}//for
			System.out.println("=".repeat(50));

		}//for

	}

}
