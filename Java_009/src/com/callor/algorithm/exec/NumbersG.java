package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	// 키보드를 통해 1개의 점수를 입력받기
	// 점수에 대하여 평점을 출력
	// 이때, 80점 이상이면 " 축하합니다" 70~79이면 " 더 분발하세요",
	// 60미만이면 낙제입니다 라고 출력

	public static void main(String[] args) {
		Line.sLine(50);
		NumberService numser = new NumberService();
		int num = numser.inputNum("숫자를 ");
		Line.sLine(50);
		if (num >= 80) {
			System.out.println(num + "입니다 축하합니다");
		} else if (num >= 70 && num <= 79) {
			System.out.println(num + "입니다 더 분발하세요");
		} else if (num < 60) {
			System.out.println(num + "입니다 낙제입니다");
		}
		

		
		if (num >= 95 && num <= 100) {
			System.out.println("a+");
		} else if (num >= 90 && num <= 94) {
			System.out.println("a");
		} else if (num >= 85 && num <= 89) {
			System.out.println("b+");
		}else if (num >= 80 && num <= 84) {
			System.out.println("b");
		}else if (num >= 75 && num <= 79) {
			System.out.println("c+");
		}else if (num >= 70 && num <= 74) {
			System.out.println("c");
		}else if (num >= 65 && num <= 69) {
			System.out.println("D+");
		}else if (num >= 60 && num <= 64) {
			System.out.println("D");
		}else if (num >= 0 && num <= 59) {
			System.out.println("F");
		}
		Line.sLine(50);
	}

}
