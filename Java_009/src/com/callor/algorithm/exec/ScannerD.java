package com.callor.algorithm.exec;

public class ScannerD {

	public static void main(String[] args) {
		ScannerBb scannerbb = new ScannerBb();  //ScannerBb class 가져오기

		int num1 = ScannerBb.inputNum("첫번째 정수를");   //ScannerBb class의 inputnum method가져오기
		int num2 = ScannerBb.inputNum("두번째 정수를");  // 숫자 두번쓸거니까 method 2번가져온다.  //inputnum(title)

		if (num1 < num2) { //오름차순 정렬
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			
			
		}
		//출력은 main 에서
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		
		

	}

}
