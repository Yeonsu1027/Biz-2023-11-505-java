package com.callor.hello.arrays;

public class ArraysAa {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for( int i = 0; i <10;i++) {
			int rndNum = (int)(Math.random()*50)+51;
			nums[i] = rndNum;
		}
		
		for(int i = 0; i<10 ;i++) {
			if(nums[i] > 80) {
				System.out.printf(" index %d 번요소의 값 : %d \n",i,nums[i]);
				break;  //if 밖에 break가 들어가면 dead code, 1번만 반복하므로 i++가 의미없기때문
			}
		}
		
	}

}
