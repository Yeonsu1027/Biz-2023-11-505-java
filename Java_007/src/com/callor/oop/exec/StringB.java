package com.callor.oop.exec;

public class StringB {
	// 다음과 같은 문자열 변수를 선언
	// String nums = "40,80,70,100,98"
	// nums 문자열 변수에 저장된 값을 컴마(,) 기준으로 잘라서 문자열 배열에 저장
	// 문자열 배열에 저장된 숫자를 정수로 변환하여 정수들의 합을 계산하여 출력
	
	public static void main(String[] args) {
		
		String nums = "40,80,70,100,98";
		String[] numss = nums.split(",");  //여러개로 분리되니 문자열 "배열" 이 필요하다 // 5개의 숫자니까 numss.lenght는 5
		
		int sum = 0; //합계 계산용
		
		for ( int i =0; i < numss.length ; i++) {
			sum += Integer.valueOf(numss[i]); 
			System.out.println(numss[i]);
		}
		System.out.println("합계"+sum);
		
		
		
		
		
	}

}
