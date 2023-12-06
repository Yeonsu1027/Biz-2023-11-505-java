package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerDd {
	public static void main(String[] args) {
		NumberService keyService = new NumberService();

		int num1 = ScannerBb.inputNum("첫번째 정수를");
		int num2 = ScannerBb.inputNum("두번째 정수를");  //파란거 numberservice 여야함 나중에 수정하든

		if (num2 > num1) {
			int _temp = num1;
			num1 = num2;
			num2 = _temp;
		}
		if (num1 < num2) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		
		//System.out.printf("%d + %d = %d\n",num1,num1,num1+num2);
		keyService.printAlgebra(num1, num2);  //class.method(매개변수);

	}

}
