package com.callor.oop.input;

import java.util.Scanner;

public class InputEb {
	public static void main(String[] args) {
		//nums type은 ? 정수형배열
		int[] nums = new int[3];
		//scan type 은?
		// scanner 클래스 type, scanner 클래스 type의 객체(Object)
		//scanner type
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(30));
		for(int i =0; i <nums.length ; i++) {
			System.out.printf("정수 %d >>",i+1);
			// str의 정체는? : 문자열형 변수, 문자열 클래스의 객체, 문자열형 객체
			String str = scan.nextLine();
			nums[i] = Integer.valueOf(str);
		}
		for(int i =0; i <nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=".repeat(30));
	}
	
	

}
