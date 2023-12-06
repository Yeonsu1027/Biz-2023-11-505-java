package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersD {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int num=0; //입력받는숫자
	int sum =0; //입력한 숫자의 누적
	int i =0; //입력한 횟수
	
	Line.dLine(100);
	while(true) {
		System.out.println("숫자를 입력해 주세요 >>");
		String str = scan.nextLine();
		num = Integer.valueOf(str);
		i++;
		sum += num;
		if(sum>1000) {
			Line.sLine(50);
			System.out.printf("%d번 입력한 숫자 총 합 :%d\n",i,sum);
			Line.dLine(50);
			break;
		}
		
		
	}//end while
	
	
	
	
	
		
	}

}
