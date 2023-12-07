package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumberA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		int num = numService.inputNum("정수를 ");
		System.out.println(num);
		
		
	
		
	}

}
