package yeonsu.study.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class inputA {
	
	//has next로 txt파일을 전부 읽어와보자
	
	public static void main(String[] args) {
		
		String testxt = "src/yeonsu/study/inputstream/printtest.txt";
		// 우선 읽어올 파일준비
		
		InputStream is = null;
		// 인풋스트림 선언..
		
		// 인풋스트림 생성하고 txt파일 넣기
		try {
			is = new FileInputStream(testxt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//스캐너 준비
		Scanner scan = null;
		
		//스캐너에 인풋스트림(인풋스트림안에는 텍스트가 있음) 넣기
		scan = new Scanner(is); // 이스캔은 텍스트 파일을 읽어오게되었음.
		
		
		
		while(scan.hasNext()) { //이 읽어오는걸 hasnext로 txt파일에 있는 끝까지 읽어오게만듬.
			String line = scan.nextLine();  //한줄씩 읽어오는걸 while안에 둔다
			System.out.println(line); //한줄읽은거 보여주기
		}
		
		
		
		
		
	}

}
