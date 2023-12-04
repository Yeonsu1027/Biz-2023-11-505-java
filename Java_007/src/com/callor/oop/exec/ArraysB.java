package com.callor.oop.exec;

public class ArraysB {
	public static void main(String[] args) {
		
		// 정수형 배열 45개를 선언하고 정수를 1~45까지 순서대로 배열요소에 할당
		
		int[] nums = new int[45];
		
		
		for( int i =0; i <nums.length ; i++) {
			nums[i]=i+1;
		}
		
		// nums 배열은 개수가 45개, nums.lenth : 45
		// index 의 범위는 0~44까지
		
		int rndNum = (int)(Math.random()*nums.length); //0부터44까지 만들어진다. random으로 만든수는 소수점이므로0 이니까
		
		
		// 배열의 shuffle(무작위로 뒤 섞기)
		// 임의의 index 값 2개를 생성하여 서로 위치 바꾸기를
		// 100 번 실행
		for(int i = 0; i < 100; i++) {
			int index1 = (int)(Math.random() * nums.length);
			int index2 = (int)(Math.random() * nums.length);
			
			int _temp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _temp;
			
		}
		for(int i =0; i <nums.length ; i++) {
			System.out.printf("%d,",nums[i]);
		}
		
		int[] nums2 = new int[6];
		
		for(int i = 0 ; i < nums2.length ; i++) {
			nums2[i] = nums[i];
			
		}
		
		for(int mIndex =0; mIndex <nums2.length; mIndex++) {
			for(int sIndex = mIndex + 1; sIndex < nums2.length ; sIndex++) {
				if(nums[mIndex] > nums2[sIndex]) {
					int _temp = nums2[sIndex];
					nums2[mIndex] = nums2[sIndex];
					nums2[sIndex] = _temp;
					
				}
			}
		}
		System.out.println();//줄바꿈표시
		for(int num : nums2) {
			System.out.printf("%d ", num);
		}
		
		
		
		
	}

}
