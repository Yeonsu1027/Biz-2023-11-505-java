package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCb {
	public static void main(String[] args) {
		
		String dataFile ="src/com/callor/oop/exec/data.txt";
		
		InputStream is = null; //선언만 할때는 null값을 선언한다
		Scanner scan = null;
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(dataFile + "파일을 찾을 수 없습니다");
		}
		
		scan = new Scanner(is); //열린파일을 scan에 연결
//		while(true) {
//			if(scan.hasNext()) {
//				scan.nextLine();
//				
//			}
//			
//		}
		while(scan.hasNext()) {
			String line = scan.nextLine();
			//System.out.println(line);
			String[] scores = line.split(",");
			int scoreTotal = 0;
			for(int index = 1 ; index < scores.length ; index++) {  //0은 학번이니까 1부터 7까지가 점수. 7과목의 점수를 합산하기위함
				scoreTotal += Integer.valueOf(scores[index]);
			}
			System.out.printf("%s 번 총점 : %d\n",
					scores[0],scoreTotal);  //0을 쓰는이유는 학번부터 점수가 총8개로 0번부터 7. 0은 학번
		}
		// while안에 for문을 사용해서 """"한줄씩"""" 불러오는 것이므로 출력해서 총 100개
	}

}
