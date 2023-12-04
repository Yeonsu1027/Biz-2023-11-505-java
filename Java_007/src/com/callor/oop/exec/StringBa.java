package com.callor.oop.exec;

public class StringBa {
	// 다음과 같은 문자열 변수를 선언
	// String nums = "40,80,70,100,98"
	// nums 문자열 변수에 저장된 값을 컴마(,) 기준으로 잘라서 문자열 배열에 저장
	// 문자열 배열에 저장된 숫자를 정수로 변환하여 정수들의 합을 계산하여 출력
	
	public static void main(String[] args) {
		
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");
		
		for(int i =0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
		int sum =0;
		for(int i =0; i < result.length ; i++) {
			sum += Integer.valueOf(result[i]);
		}
		System.out.println("합계"+sum);
		
		
	}

}
