package com.callor.hello.arrays;

public class ArraysC {
	// 10명 학생의 국어점수를 저장할 배열 scoreKors를 선언
	// 51부터 100까지 범위의 임의의 점수 10개 생성하여 배열 각 요소에 할당
	// 학생들의 국어점수를 출력하고, 배열에 저장된 전체 요소의 총점과 평균을 계싼하여 출력,
	// 평균은 실수로 표현허되 소수점 2째자리까지 출력
	// 데이터 저장, 총점계산, 출력코드를 분리하여 작성
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int index = 0;
		int sum = 0;
		float avg = 0;
		int i =0;
		
		System.out.println("=".repeat(50));
		System.out.println("  샛별반 국어 점수  ");
		System.out.println("-".repeat(50));
		
		for (index = 0; index < scoreKors.length ; index++ ) {  //10개의 스코어생성
			int rndScore = (int)(Math.random()*50)+51;
			scoreKors[index] = rndScore;
			System.out.printf(" %d번 : %d  \n",i,scoreKors[i]);
		}//for1
		
		
		for ( i =0; index< scoreKors.length ; i++) {  //총점계산
			sum += scoreKors[i];
		}//for2
		
		
		avg = (float)sum/scoreKors.length;
		
		System.out.println("-".repeat(50));
		System.out.printf(" 총점 %d, 평균 : %.2f \n", sum, avg);
		System.out.println("=".repeat(50));
		
		
		
		
		
	}

}
