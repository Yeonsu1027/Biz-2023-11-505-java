package com.callor.hello.arrays;

public class ArraysA {
	// 10개의 요소를 갖는 정수형 배열 nums 를 선언
	// 51부터 100까지의 범위의 임의의 정수 10개 생성하여 배열 각 요소에 할당
	// nums 배열 요소에 보관된 수 중 80보다 큰 값이 최초로 나타나는 index와, 배열의 요소의 값 찾아서 console에 출력

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51;
			if (nums[index] > 80) {
				System.out.printf("index %d번 요소의 값 : %d ", index, nums[index]);
				break; 
			}
			
		}

	}

}
