package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumbersH {
	
	// 키보드를 통해 3개의 점수를 입력받기
	// 3개 점수의 평균을 계산하여
	// 평균이 60이상이면 합격입니다, 아니면 낙제입니다 출력
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int score1 = numService.inputNum("1점수를 ");
		int score2 = numService.inputNum("2점수를 ");
		int score3 = numService.inputNum("3점수를 ");
		
		float avg = (score1+score2+score3)/3;

//		String scoreGrade = "F";
//		if (avg >= 95) scoreGrade = "A+";  // 계속 이어지므로 조건은 하나씩만 써도 95~90이라는 조건이 됨.
//		 else if (avg >= 90) scoreGrade = "A";
//		 else if (avg >= 85) scoreGrade = "B+";
//		 else if (avg >= 80) scoreGrade = "B";
//		 else if (avg >= 75) scoreGrade = "C+";
//		 else if (avg >= 70) scoreGrade = "C";
//		 else if (avg >= 65) scoreGrade = "D+";
//		 else if (avg >= 60) scoreGrade = "D";
//		System.out.printf("%s 입니다\n",scoreGrade);
		
		if(avg>=60) System.out.println("합격입니다");
		
	//	else if(avg >= 70) System.out.println("더 분발하세요");
		else if(avg < 60) System.out.println("낙제입니다");

	}

}
