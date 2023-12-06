package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersHa {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		Line.dLine(50);
		System.out.println("3과목의 점수를 입력하세요");
		int score1 = numService.inputNum("첫번째 과목점수");
		int score2 = numService.inputNum("두번째 과목점수");
		int score3 = numService.inputNum("세번째 과목점수");
		
		int total = score1 + score2 + score3;
		float avg = (float)total/3;
		
		if(avg>=60) {
			System.out.println("축하합니다\n 합격입니다");
		} else {
			System.out.println("아쉽지만\n 낙제입니다");
		}
		
	}

}
