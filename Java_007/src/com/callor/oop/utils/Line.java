package com.callor.oop.utils;

public class Line {
	
	public static void dLine(int length) {
		System.out.println("=".repeat(length));
	}
	
	
	public static void sLine(int length) {
		System.out.println("-".repeat(length));
	}

	public static void title(String title) {
		// title 문자열 변수에 할당된 문자열 데이터의 개수
		int length = title.length();  //여기의 length는 method
		dLine(length*10); //같은 class라서 Line. 을 앞에 쓰지 않아도 됨.
		System.out.println(title);
		dLine(length*10);
		
	}
	
	public static void title(int length, String title) { //정수 줄 개수, 문자열 제목 
		dLine(length);
		System.out.println(title);
		dLine(length);
	}
	
	
}
