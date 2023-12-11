package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV1 {

	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<>();
	}

	String stdNum = null;

	public boolean inputStudent() {

		System.out.println("학번을 입력하세요");
		stdNum = scan.nextLine();
		check();
		if (stdNum.equals("QUIT")) {
			return false;
		}

		System.out.println("이름을 입력하세요");
		String stdName = scan.nextLine();
		if (stdName.equals("QUIT")) {
			return false;
		}

		System.out.println("학과을 입력하세요");
		String stdDept = scan.nextLine();
		if (stdDept.equals("QUIT")) {
			return false;
		}

		System.out.println("학년을 입력하세요");
		String stdGrade = scan.nextLine();
		if (stdGrade.equals("QUIT")) {
			return false;
		}

		System.out.println("전화번호를 입력하세요");
		String stdTel = scan.nextLine();
		if (stdTel.equals("QUIT")) {
			return false;
		}

		System.out.println("주소를 입력하세요");
		String stdAddr = scan.nextLine();
		if (stdAddr.equals("QUIT")) {
			return false;
		}

		StudentDto studentDto = new StudentDto();
		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;

		students.add(studentDto);

		return true;
	}

	public boolean check() {
		//while(true) {
		for (StudentDto student : students) {
			if (student.num.equals(stdNum)) {
				System.out.println("학번중복, 다시입력하세요");
				//return false;
				continue; //다시가 아니고 이름으로 넘어 가짐..
			}
		}
		return false;
		
		//}

	}

	public void inputStudents() {
		boolean result = true;
		while (result) {
			result = inputStudent();

		} // end while
		System.out.println("입력종료 퇴근하자!");

	}

}
