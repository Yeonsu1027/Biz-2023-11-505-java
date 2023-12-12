package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3A;
import com.callor.student.service.StudentServiceV3_2;

public class StudentExecC {
	
	public static void main(String[] args) {
		StudentServiceV3A stService = new StudentServiceV3A();
		stService.inputStudents();  //QUIT를 누르면
		stService.printStudent();  //가 실행된다
	}

}
