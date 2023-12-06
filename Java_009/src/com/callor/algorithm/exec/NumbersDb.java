package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersDb {
	public static void main(String[] args) {
		
		Line.dLine(50);
		
		NumberService numService = new NumberService();
		
		int sum =0;
		int count = 0;
		while(sum < 1000) {
			int num = numService.inputNum("숫자를"); //입력받는 코드
				sum += num;
				count++;
//				if(sum>=1000) {
//					break;
//				}
		}
		System.out.printf("%d 번 입력한 숫자 총합 : %d",count,sum);
		
	}

}
