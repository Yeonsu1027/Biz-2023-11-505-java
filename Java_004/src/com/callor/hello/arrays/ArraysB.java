package com.callor.hello.arrays;

public class ArraysB {
	//10명 학생의 국ㄱ어점수를 저장할 배열 scoreKors를 선언
	//51부터 100까지 범위의 임의의 점수 10개 생성하여 배열 각 요소에 할당
	// 배열에 저장된 전체 요소의 총점과 평균을 계산하여 출력
	// 평균은 실수로 표현 하되 소수점 2째자리까지
	
	public static void main(String[] args) {

		int students = 10;
		int[] scoreKors = new int[students];
		int index =0;
		double sum=0;
		
		for ( index = 0; index < students ; index++) {
			int random = (int)(Math.random()*50)+51;
			scoreKors[index] = random;
			
			sum += scoreKors[index];
		}//for문
		
		System.out.println("=================================================");
		System.out.printf(" 국어점수 총점 : %.2f, 평균 : %.2f \n",sum, sum/students);
		System.out.println("=================================================");
	}

}
