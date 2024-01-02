package test.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.models.GuideDto;
import test.models.GuideService;
import test.utils.Line;

public class GuideServiceImplV1 implements GuideService{
	
	private List<GuideDto> guideList = null;
	
	//생성자
	public GuideServiceImplV1() {
		
		guideList = new ArrayList<GuideDto>();
	}


	@Override
	public void loadGuide() { 
		InputStream is =null;
		Scanner scan = null;
		
		String data ="src/test/utils/guide.txt";
	
		
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end try&catch
		
		scan = new Scanner(is);
		
		
		
		while(scan.hasNext()) {
			
			
			String str = scan.nextLine(); 
			String[] line = str.split(","); 
			
			GuideDto gdto = new GuideDto(); 
			
			gdto.id = line[0]; 
			gdto.jongmok = line[1];
			gdto.num = line[2];
			gdto.how = line[3];
			
			
			guideList.add(gdto);
		}//end while
		scan.close();
		
		// 잘들어갔나 test..
	//	System.out.println(guideList.size());
		
		
	}//end loadList

	@Override
	public void printGuideList() {
		
		loadGuide();
		
		Line.dLine(100);
		System.out.println("id\t종목명\t순서\t방법"); 
		Line.sLine(100);
		int size = guideList.size();
		for(int i =1; i < size ; i++) { //0은 id종목명~~~이니까 1부터 나오게
			//get i. num~~
		
			//if(guideList.get(i).id.isBlank())break; //pn071이후엔 빈칸이니 출력안되게
			
			if((i-1)>=1) { //맨처음껀 비교할게 없으니 넘기고..
			if(guideList.get(i-1).id.equals(guideList.get(i).id)){ //id 같으면 그냥두고	
			}else { 
				Line.sLine(100); //아니면 줄추가
			}
			}
			
			System.out.printf("%s\t%s\t\t%s 회\t%s\n",
					guideList.get(i).id,guideList.get(i).jongmok,guideList.get(i).num,guideList.get(i).how);
			
			
			
			// if( guideList.get(i-1).id != guideList.get(i).id ) {Line.sLine(100)}
			// ***조건 추가 : id가 달라지면 sLine 을 긋는다.
			// 이전 아이디를 저장하고 새로운 i요소의id와 비교
		}//end for
		
		Line.dLine(100);
	}

}
