package com.callor.score.model;
//학번,이름,학과,학년,담임교수,전화번호,주소,,

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * scanner클래스를 사용하여 scan 객체 선언
 * List<StudentDto> 클래스를 사용하여 students 객체 선언
 * 생성자 method 를 선언하고 Scanner를 통하여 Sudent.txt파일을 열어 데이터를 읽을 준비를 하는 코드를 작성
 * ArraysLis<>()을 사용하여 students 객체 초기화
 * loadStudents() method를 선언하여 student.txt 데이터를 읽어 students 리스트에 담기
 */

public class StudentDto {
	
	// 속성(preperty) : Dto 클래스에 선언된 변수
	// 멤버변수
	public String stdnum;
	public String name;
	public String dept;
	public String grade;
	public String prof;
	public String tel;
	public String addr;
	
	
	Scanner scan =  null;
	
	
	
	
	
	
	
	
	
	
	

}
