package yeonsu.study.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputB {
	// txt파일을 hasnext로 전부 읽어와서 읽은파일을 list에 담아보자!
	
	public static void main(String[] args) {
		
		List<String> printest = new ArrayList<String>();
		
		String testxt = "src/yeonsu/study/inputstream/printtest.txt";
		InputStream is =null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(testxt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			printest.add(line);
		}
		
		//잘되었나 확인
		System.out.println(printest.size());
		int size = printest.size();
		for(int i =0; i < size ; i++ ) {
			System.out.println(printest.get(i));
			
		}
		
		
		
		
		
		
	}

}
