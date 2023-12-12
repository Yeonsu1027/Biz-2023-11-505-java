package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

/*
 * 키보드를 통해서 학생정보를 입력받고
 * StudentDto 에 추가한 다음 
 * List<StudentDto> students 리스트에 추가하기
 * 
 */
public class StudentServiceV3 {

	// ***클래스 여역에 서넝ㄴ된 변수(객체)들
	// 인스턴스 변수, 멤버변수
	// 클래스 영역에 선언된 변수나 객체는 private 로 선언한다***
	// 다만 이 클래스를 누군가 상속하여 사용할 것으로 예상되면
	// protected 로 선언한다
	private Scanner scan = null;
	private List<StudentDto> students = null;
	
	// 클래스 영역에 선언된 변수는 생성자 method 에서
	// 값을 초기화 하여 사용할 준비를 한다
	public StudentServiceV3() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}
	
	private String itemInput(String title) {
		while(true) {
			
			System.out.println(title+"입력(QUIT:종료) >>");
			String inputStr = scan.nextLine();
			
			
			// 아무런 값도 입력하지 않고 enter 누르기 금지
			if(inputStr.isBlank()) {
				System.out.printf("*** %s 값은 반드시 입력!!",title);
				continue; // 값이 없으면 처음으로 보내기 // 엔터만했을때 넘어가지 않도록
			}
				
				
				// 키보드로 QUIT 를 입력하면?
				if(inputStr.equals("QUIT")){//입력받은 변수를 상대로 equals
					return null;
				}
			return inputStr;
			
		}
		}
	
	// 한 학생의 정보를 입력받는 method
	public boolean inputStudent() {
		
		
//		String strNum = this.itemInput("학번");
//		if(strNum == null) {//QUIT를 입력하면 null 을 return 하므로
//			return;   //void method 이므로 return 값이 없고/ 입력을 끝낸다.
//		} //중괄호 생략하고 조건문 뒤에 return 가능   // {}에 들어갈게 두 줄이상이면 반드시 {} 있어야함
//		String strName = this.itemInput("이름");
//		String strDept = this.itemInput("학과");
//		String strGrade = this.itemInput("학년");
//		String strTel = this.itemInput("전화번호");
//		String strAddr = this.itemInput("주소");
		
		String strNum = null;
		String strName = null;
		String strDept = null;
		String strGrade = null;
		String strTel = null;
		String strAddr = null;
		
		
		// 입력한 학번이 이미 students 요소중에 있으면
		// 다시 학번을 입력받기 위하여
		// 학번 입력 부분을 무한 반복처리
		while(true) {
			strNum = this.itemInput("학번");
			if(strNum == null) return false;
			
			// 학번에서 아무 값도 입력하지 않고 enter를 눌렀을때
		
//			for(StudentDto dto : students) {
//				// 개별 dto의 num 속성(멤버변수) 이 내가 입력한
//				// strNum 변수에 할당된 값과 같냐?
//				if(dto.num.equals(strNum)) {
//					System.out.println("*** 학번 중복");
//					continue;
//				}
//			}
			
			int index = 0;
			int size = students.size();
			for(index = 0; index<size; index++) {
				if(students.get(index).num.equals(strNum)) {
					break;
				}
			}
			if(index < size ) {
				System.out.println("** 학번 중복");
				continue;
			} else {
				break;
			}
		}
		
		strName = this.itemInput("이름");
		if(strName == null) return false;
		
		strDept = this.itemInput("학과");
		if(strDept == null) return false;
		
		strGrade = this.itemInput("학년");
		if(strGrade == null) return false;
		
		strTel = this.itemInput("전화번호");
		if(strTel == null) return false;
		
		strAddr = this.itemInput("주소");
		if(strAddr == null) return false;
		
		
		StudentDto stdDto = new StudentDto();
		// stdDto.num = strNum;
		stdDto.name = strName;
		stdDto.dept = strDept;
		stdDto.tel = strTel;
		stdDto.addr = strAddr;
		
		students.add(stdDto);
		return true;                             // QUIT 종료는 false, 한명의 정보가 입력이 끝난경우는 true
		
	} // end inputStudent()
	
	public void inputStudents() {
		while(true) {
			boolean bYes = this.inputStudent();
			// if(bYes == false) {   // **이 세가지는 모두 동일하다**
			// if(bYes != true) { 
				if( !bYes ) { //true 가 아니면 이라는 의미     //가장간단한 방법
					break;
			}
		}
		System.out.println("업무 종료@@@");
	}
	
	
	
	
	
	
}
