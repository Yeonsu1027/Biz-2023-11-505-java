package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class StringC {
	
	public int score1 = 0;
	public int score2 = 0;
	public int score3 = 0;
	public int score4 = 0;
	public int score5 = 0;
	public int score6 = 0;
	public int score7 = 0;

	public static void main(String[] args) {
		
		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null; //스캐너를 선언만하기
		InputStream is = null;
		
		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 하려고 한다
		 * java 에서 파일을 읽어서 무언가 처리를 하려면
		 * 먼저 파일을 open 해야 한다
		 * 이때 파일을 Open 하는 도구중에 fileInputStream 이라는
		 * 도구를 사용할 것이다
		 * 
		 * 그런데, 파일을 Open 하는 과정에서 어떠한 이유로든지
		 * Open하고 하는 파일이 없을 수 있다. 갑자기 사라질 수도 있다
		 * 때문에 java 에서는 파일을 Open 하는 명령(도구)를 사용하는
		 * 코드에서는 반드시 try...catch 를 사용하여
		 * exception 예방을 하도록 강제 하고 있다
		 */
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Open 한 data.txt 파일에 대한 정보(연결)을 Scanner 와
		// 연결 해주기
		scan = new Scanner(is);
		//------------
		String students[] = new String[100];
		
		
		
		
		while(scan.hasNext()) {
			
			String line = scan.nextLine(); 
			System.out.println(line);
			
			for ( int i = 1; i<students.length ; i++) {
				
				students[i].substring(6); //이걸나눠서 stu[i]score1~7에넣어야
			}
			//students[i].score1; 
			
			//students[i] = line.split(",");
			
		}
		
		
		
		
		
		
		
//int[] sums = new int[students.length]; //합계계산용
//		
//		
//		for ( int index =1; index < students.length ; index++) {
//	
//			
//					students[index] = line.split(",");
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		String[] score = new String[];
//		String score = students[].substring(5);
//		
//		
//		int[] sum = new int[students.length];
//		sum = Integer.valueOf(students[]);

		
		scan.close();
		
		
	}

}
