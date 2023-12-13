package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.utis.Line;

public class StartServiceImplV1 implements StartService {
	
	Scanner scan = null;
	
	public StartServiceImplV1() {
		 scan = new Scanner(System.in);
	}

	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(0);
		
	}

	@Override
	public Integer selectMenu() {
		
		while(true) {
			this.mainMenu();
		
			String str = scan.nextLine();
			int num = 0;
			
			
			if(str.equals("QUIT")) return null;
					
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println(str+"는 정수가 아닙니다");
				continue;
			}
			if(num<1||num>3) {
				System.out.println("맞는 범위의 수가 아닙니다 다시입력하세요");
				continue;
			}
			break;
		}
		
		
		
		
		return null;
	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
