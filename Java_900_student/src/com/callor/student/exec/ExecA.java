package com.callor.student.exec;

import com.callor.student.service.StudentService;

public class ExecA {
	public static void main(String[] args) {
		StudentService stuService = new StudentService();
		
		//stuService.inputname(); 
		stuService.studentlist(); 
	}

}
