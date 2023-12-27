package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class ExecC {
	public static void main(String[] args) {
		String stdFile = "src/student.csv";
		StudentService stdService = new StudentServiceImplV1(stdFile); //클래스 생성자를 이용해 객체를 만들때는 정보를주어라
		stdService.loadStudent();
		stdService.inputStudent();
	}

}
