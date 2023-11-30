package com.callor.oop.input;

import java.util.Scanner;

public class InputEa {
	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1>>");
		String str = scan.next();
		nums[0] = Integer.valueOf(str);
		
		System.out.println("정수 1>>");
		str = scan.next();
		nums[1] = Integer.valueOf(str);
		
		System.out.println("정수 1>>");
		str = scan.next();
		nums[2] = Integer.valueOf(str);
		
		System.out.println("=".repeat(30));
		for(int i =0; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
