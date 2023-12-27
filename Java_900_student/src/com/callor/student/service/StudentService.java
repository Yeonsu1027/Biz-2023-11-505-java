package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentService {
	static Scanner scan = null;
	static String str = null;
	//StudentDto stdDto = null;
	private static List<StudentDto> stlist = null;

	public StudentService() {
		scan = new Scanner(System.in);
		//stdDto = new StudentDto(); / 아래에서 새로만들어쓰니까 dto생성자에 필요없음
		stlist = new ArrayList<StudentDto>();
	}

	//학생정보 저장해둘곳
	public static void studentlist() {
		Scanner filescan = null;
		InputStream inputData = null;
		
		String stdData ="src/com/callor/student/utils/샘플-학생정보 데이터(2023-12-14).csv";
		
		try {
			inputData = new FileInputStream(stdData);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		filescan = new Scanner(inputData);
		
		while(filescan.hasNext()) {
			String line = filescan.nextLine();
			String[] sData =line.split(",");
			
			StudentDto dto = new StudentDto();
			
			dto.name = sData[1]; //0은학번이니까 1부터
			dto.dept = sData[2];
			dto.grade = sData[3];
			dto.addr = sData[4];
			dto.tel = sData[5];
			
			stlist.add(dto);
			
		}
		
//		//list에 잘들어가있나 test
//		for(int i =0 ;i<stlist.size() ; i++) {
//			System.out.println(stlist.get(i));
		//}
		//test2 이름검사
	//	System.out.println(stlist.get(0).name); //잘나옴 갈한수
		//test 이름재검사
		//	System.out.println(stlist.get(15).name); //담원준도 잘나옴
		//test3 정보출력검사 //한수정보 잘나옴
		// printStdInfrom(stlist.get(0).name, stlist.get(0).dept, stlist.get(0).grade, stlist.get(0).addr, stlist.get(0).tel);
		//정보출력 재검사
		//printStdInfrom(stlist.get(8).name, stlist.get(8).dept, stlist.get(8).grade, stlist.get(8).addr, stlist.get(8).tel); 나한율 정보도 잘나옴
		
		
		//사이즈크기검사
//		int size = stlist.size();
//		System.out.println(size);  //100개들어간거 맞음
		

		inputname();
		
	}
	
	
	
	public static void inputname() {
		
		while(true) {
		Line.dLine(70);
		System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
		Line.sLine(70);
		System.out.print("이름 >> ");
		
		str = scan.nextLine(); //이름 입력받는곳
		
		if(str.equals("QUIT")) break;
	
		int size = stlist.size();
		
		boolean found = false;
		
		int i = 0;
		for(i = 0; i < size; i++) {
			//studentlist();
			
			//StudentDto dto = new StudentDto();
			
			// list의 모든요소를 비교해서..stlist 의n번째 요소의 dto.num이같다면..			
			if(str.equals(stlist.get(i).name)) { 
			
				//입력한 학생이름이 있으면 보여주기
				//printStdInfrom(해당list요소의 dto요소들);
				printStdInfrom(stlist.get(i).name, stlist.get(i).dept, stlist.get(i).grade, stlist.get(i).addr, stlist.get(i).tel);
				found = true; //있을경우에 실패문구 출력안되게
				continue; //보여주고 다시묻기

			}//end if 
	
		}//end for
		
		if(!found) { //false일때 true
			System.out.println("* 데이터가 없습니다");
			printnotfound(str);
			
		}
		
		}//end while
		System.out.println("학생찾기 종료");
	}
	
	
	
	// 학생정보 보여주는곳
	public static void printStdInfrom(String n,String d,String g,String a,String t) {
		Line.dLine(70);
		System.out.printf("이름 : %s\n",n);
		System.out.printf("학과 : %s\n",d);
		System.out.printf("학년 : %s학년\n",g);
		System.out.printf("주소 : %s\n",t);
		System.out.printf("전화번호 : %s\n",a);
		Line.dLine(70);
		
	
	}
	
	public static void printnotfound(String str) {
		Line.dLine(70);
		System.out.printf("%s 자료는 없습니다.\n",str);
		Line.dLine(70);
	}
	
	
	

}
