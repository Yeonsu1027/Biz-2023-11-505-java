package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentService {
	
	private Scanner scan = null;
	// private List<StudentDto> students = null;
	
	public StudentService(String dataFile) {
		InputStream is =null;
		
		try {
			is = new FileInputStream(dataFile);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	//	scan = new Scanner(is);
	//	students = new ArrayList<>();
		
		
	}
	
}
	
	


