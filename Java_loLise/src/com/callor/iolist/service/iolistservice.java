package com.callor.iolist.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.models.iolistdto;
import com.callor.iolist.utils.Line;


public class iolistservice {
	private List<iolistdto> datalist = null;
	
	public iolistservice() {
		datalist = new ArrayList<iolistdto>(); 
	}
	
	
	
	public void loadData() {
		String datafile ="src/com/callor/iolist/models/data.csv";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(datafile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String strdata = scan.nextLine();
			String[] line = strdata.split(",");
			
			iolistdto dto = new iolistdto();
			
			//dto.num = line[0];   
			dto.day = line[0];
			dto.time = line[1]; //이거
			dto.name = line[2];
			dto.cuname = line[3];
			dto.owname = line[4]; //이거 는필요없는거같은데 예의상두자
			dto.buy1orsell2 = line[5];
			dto.suryang = line[6];
			dto.buy = line[7];
			dto.sell = line[8];
			
			datalist.add(dto);
			
		}
		//다들어갔나 test 다들어갔다면 501
	//	System.out.println(datalist.size()); 501 맞음
		
		
	}//end loaddata
	
	
	public void printlist() {
		
		int totalbuy = 0; //매입단가 누적총액
		int totalsell = 0; // 매출단가 누적총액
		
		int intsuryang =0; // 숫자가되어줄 수량,매입단가, 매출단가
		int intbuy =0;
		int intsell =0;
		
		// 수량*단가 계산용 변수
		int buybuy =0;//매입금액
		int sellsell =0;//매출금액
		
		
		loadData();
		
		Line.dLine(100);
		System.out.println("거래일자\t거래처\t\t상품이름\t매입금액\t판매금액");
		Line.sLine(100);
		int size = datalist.size();
		for(int i =1; i <size ; i++ ) { //1부터. 0은 그뭐냐 이름그거니까
			//출력순서
			//0 3 2 (if 5=1매입, 5=2판매 / 6*7/6*8) //if( get(i).suryang.이퀄s(1)) {6*7}else{6*8}
			
			
			//먼저 수량을 숫자로 바꾸고
			intsuryang = Integer.valueOf(datalist.get(i).suryang);
			
			// 거래구분을 매입인지 매출인지 구분하기
			if(datalist.get(i).buy1orsell2.equals("1")) {//1은 매입
				//매입이니까 매입 숫자로 바꾸고
				intbuy = Integer.valueOf(datalist.get(i).buy); //매입단가 숫자버전
				
				buybuy = intsuryang*intbuy; //이게 매입금액이 되어준다.
				
				
				//합계누적
				totalbuy+=buybuy;
				System.out.printf("%s\t%10s\t\t%s\t%d\t%d\n",
						datalist.get(i).day,datalist.get(i).cuname,datalist.get(i).name,buybuy,0);
				
				
			}else { //아니면 2. 판매
				
				intsell = Integer.valueOf(datalist.get(i).sell); //매출단가 숫자버전
				
				sellsell = intsuryang*intsell; //얘가 매출금액.
				
				//합계누적
				totalsell+=sellsell;
				System.out.printf("%s\t%10s\t\t%s\t%d\t%d\n",
						datalist.get(i).day,datalist.get(i).cuname,datalist.get(i).name,0,sellsell);
			}
			
			
			
			//총 매입금액, 판매금액 누적시켜둠.
			//뭐지 엑셀이랑 총합이 다른데 이것도 위에 넣어야하나 /맞네 그러네
			//totalbuy+=buybuy;
			//totalsell+=sellsell;
			
			
			
			// 출력하는 부분을 if문 안에둬서 수량.이퀄(1) 이면 매출칸을 0 출력하고
			// 수량.이퀄(2)이면 매입칸을 0 하면될 것같은데/ 위에다가 넣어버림 될듯?
			
			///----------------------------------------------------
//			System.out.printf("%s\t%s\t%s\t%d\t%d\n",
//					//일단 나오나test 11
//					datalist.get(i).day,datalist.get(i).cuname,datalist.get(i).name,1,1);
			//---------------------------------------------------------------
			
			//추가할것 
			//int 매입금액 = Integer.valueof(datalist.get(i).buy) 숫자로 바꾸기.
			// 숫자로 바꿀것 : 수량, 매입단가, 매출단가
			
			
			
			
		}//end for
		Line.sLine(100);
		System.out.printf("거래건수\t%d 건\t\t\t\t\t%d\t%d\n",size,totalbuy,totalsell); // 건수는 곧 list.size겠네, //printf
		// size,totalbuy,totalsell //****출력할것 목록 
		Line.dLine(100);
	}

}
