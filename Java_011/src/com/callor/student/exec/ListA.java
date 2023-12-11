package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		for(int i =0; i<10;i++) {
			int num =(int)(Math.random()*50)+51;
			nums.add(num);
			
		}
		
		System.out.println(nums);
		
		int size = nums.size();
		for(int index = 0; index <size; index++) {
			if(nums.get(index)==77) {
				
				System.out.println((index+1)+"번째에 있음");
				//System.out.println("있다");
				
			} else {
				System.out.println("없음"); 
				}
			break;
			
		}
		
//		for(int index = 0; index <size; index++) {
//			if(nums.get(index)==77) {
//				
//				break;
//				
//			} 
//			
//		}
		
		
		
		
		
	}

}
