package com.callor.oop.input;

import java.util.Scanner;

public class InputE {
	public static void main(String[] args) {

		int[] nums = new int[3];

		int i = 0;

		for (i = 0; i < nums.length; i++) {

			Scanner scan = new Scanner(System.in);  //for문 밖에 둬도됨
			System.out.printf("정수 %d >>\n", i + 1);
			String num = scan.nextLine(); // string type으로 return 되므로/ (내가 입력한 값을 출력할 수 있게 해주는 부분)
			nums[i] = Integer.valueOf(num); // valueOf 를사용하여 정수 type으로 바꿈

			System.out.printf("입력한 정수 %d 번 : %d  \n", i + 1, nums[i]); // 입력한 3개의 값을 반복때 순서대로 출력

		} // for
		System.out.println("=".repeat(50));
		System.out.println(nums[0]);     //출력도 for문쓰면 더짧음..
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		
		
	//+	for ( i = 0; i<nums.length ; i++) {
	//+ 		System.out.println(nums[i]);
	// }	
		
		
	}// main

}
