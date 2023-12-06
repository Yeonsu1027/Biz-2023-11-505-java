package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerBc {
	public static void main(String[] args) {
		NumberService keyService = new NumberService();  //key~~는 static이 아니니까 
		
		int num1 = keyService.inputNum("첫번째 정수를");
		int num2 = keyService.inputNum("두번째 정수를");
		
		System.out.printf("%d + %d = %d\n",
				num1,num2,num1+num2);
		
	}
}
