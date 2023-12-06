package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersF {
	// 키보드를 통해 1개의 정수를 입력받기
	// 구구단 2단부터 9단까지 출력
	// 단, 입력한 정수의 배수인 경우만 출력
	
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		int num = numService.inputNum("숫자를");
		
		for (int dan = 2; dan < 10; dan++) {
			for (int item = 1; item < 10; item++) {
				if ((dan * item) %num == 0) {

					System.out.printf("%d x %d = %d\n", dan, item, dan * item);
				}
			}
			Line.sLine(30);
		}
	}

}
