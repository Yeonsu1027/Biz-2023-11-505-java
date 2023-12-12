package com.callor.student.exex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExA {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		StudentServiceImplV1 stService1 = new StudentServiceImplV1();
		List<Integer> nums = new ArrayList<Integer>(); //List를 통해서 선언하고 arraylist통해 생성한다
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums = new ArrayList<Integer>();
		nums = new LinkedList<Integer>();
		nums = new Vector<Integer>();  //3개모두 interface 를 implements 하고있다
		
		stService = new StudentServiceImplV1();
		stService = new StudentServiceImplV2();
		
	}

}
