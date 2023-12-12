package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.utils.Line;

public class StartService {
	
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
//		System.out.println("1. 학생정보 입력");
//		System.out.println("2. 학생정보 조회");
//		System.out.println("3. 학생정보 출력");
		for(String item : menuItems) {
			System.out.println(item);
		}
		
		
		System.out.println("QUIT. 종료");
		Line.sLine(50);
		
	}// end Mainmenu
	
	
	private StudentServiceV3A stService = null;
	private String[] menuItems = null;
	private Scanner scan = null;
	
	
	public StartService() {
		scan = new Scanner(System.in);
		menuItems = new String[] {
				"1. 학생정보 입력",
				"2. 학생정보 가져오기",
				"3. 학생정보 조회",
				"4. 학생정보 출력"
		};  //목록을 원하다면 추가해서 선택할 수 있도록 함
		
		stService = new StudentServiceV3A();
	}
	
	
	
	
	public int selectMenu() {
		
		String str = null;
		int numMenu = 0;
		
		
		while(true) {
			mainMenu();
			System.out.println("업무선택 >>");
			
			str = scan.nextLine();
			
			if(str.equals("QUIT")) return -1;
			
			try {
				numMenu = Integer.valueOf(str);
				
				if(numMenu<1 || numMenu>menuItems.length) { //!=
					System.out.printf("1~%d의 수를 입력하세요\n",menuItems.length);
					continue; // 안되면 다시 시켜야하니까
				} 
				
			} catch (Exception e) {
				System.out.println("정확히 입력해주세요");
				continue; // 마찬가지 아니면 처음으로
			} 
			
			
			break; // while 이 끝나야 return할 값이 생기니까
		}//end while
		
		
		
		return numMenu;
		
		
		
	}//end selectMenu
	
	public void startApp() {
		
		while(true) {
			int numMenu = this.selectMenu();
			if(numMenu == -1) { //QUIT = -1
				break;
			}else if(numMenu==1) { //학생정보 입력
				stService.inputStudents();
//			}else if(numMenu == 2) { //V3A 아니고 v3_2에서만든 loadStudent는 연결안되는듯 아무튼 이런식
//				stService.loadStudent();
			}else if(numMenu == 4) {//학생정보 출력
				stService.printStudent();
			}
		}
			
	}

}
