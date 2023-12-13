package com.callor.student.exex;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentExD {
	
	public static void main(String[] args) {
		// 인터페이스를 사용하여 객체를 선언하고
		// 구현체클래스를 사용하여 객체를 생성(초기화)한다
		StudentService stService = new StudentServiceImplV1();
		//stService.printStudent();
		stService.inputStudents(); //QUIT를 입력하면 빠져나오고
		stService.printStudent(); //출력하는 부분이 실행된다
	}

}
