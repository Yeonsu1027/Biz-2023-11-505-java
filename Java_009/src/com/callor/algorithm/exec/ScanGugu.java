package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScanGugu {
	
	public static void main(String[] args) {
		NumberService numservice = new NumberService(); // nums~~의 스캔기능 가져오기//기존거 재활용해서 구구단 출력만 만들기
		Line.dLine(50);
		int dan = numservice.inputNum("원하는 구구단 단수를");
		Line.dLine(50);
		System.out.printf("\t단 구구단\n",dan);
		Line.sLine(50);
		for(int i = 1; i<10;i++) {
			System.out.printf("\t%d x %d = %d\n",dan,i,dan*i);
		}
		Line.dLine(50);
		
	}

}
