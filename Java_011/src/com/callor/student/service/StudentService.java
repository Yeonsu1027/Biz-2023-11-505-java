package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentService {
	Scanner scan = null;
	StudentDto studentDto = null;
	
	public StudentService() {
		StudentDto studentDto = new StudentDto();
		scan = new Scanner(System.in);
	}
	
	
	public void inputStudent() {
		System.out.println("학번을 입력하세요");
		studentDto.num = scan.nextLine();
		System.out.println("이름을 입력하세요");
		studentDto.name = scan.nextLine();
		System.out.println("학과을 입력하세요");
		studentDto.dept = scan.nextLine();
		System.out.println("학년을 입력하세요");
		studentDto.grade = scan.nextLine();
		System.out.println("전화번호를 입력하세요");
		studentDto.tel = scan.nextLine();
		System.out.println("주소를 입력하세요");
		studentDto.addr = scan.nextLine();

	}
	
	public void printScore() {
		
//			Line.dLine(50);
//			inputStudent();
//			Line.dLine(50);
			
			
			
		
	}

}
