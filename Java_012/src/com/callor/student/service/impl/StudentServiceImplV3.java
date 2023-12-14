package com.callor.student.service.impl;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	public StudentServiceImplV3() {
		super();
	}

	protected String newStdNum() {
		
		String stdNum = "S0001";
		if(!students.isEmpty()) { //데이터가있으면
			// students 리스트의 가장 "마지막 요소"의 학번
			stdNum = students.get(students.size()-1).num;
			
			// num 데이터의 맨 첫번째 한개 글자를 추출하기
			// S0100 이라면 S 만 추출하기
			String frefix = stdNum.substring(0,1);
			
			// S0100 이라면 0100 만 추출하기
			stdNum = stdNum.substring(1);
			
			stdNum =String.format("%s%04d",frefix,Integer.valueOf(stdNum)+1);
			
		}
		return stdNum;
		
	}
	
	@Override
	public boolean inputStudent() { // 이런 이름의 method가 반드시 필요하다
		// TODO:한 학생의 정보 입력받기

		// 키보드로 학생의 개별 정보들(학번, 이름.. 등)을 입력받고
		// 임시로 저장할 배열
		// StdIndex enum 에 선언된 요소의 개수를 세어서
		// 그 개수를 사용하여 inputStr 배열을 생성하기
		String[] inputStr = new String[StdIndex.values().length]; // Stdindex에 선언되어있는 6개의 요소 개수 0~5 "StdIndex.values() :
							
		int stdnum =0;
		String strstdnum = null;
		// 배열이란뜻" / .values 자체가 StdIndex의 배열이다.
		
		for (StdIndex item : StdIndex.values()) { // StdIndex의 요소를 item에 하나씩.. 학번..이름..학과.. 저장한다.
			while (true) { //학번(s0101) 입력// 로 출력되게.. 입력한최종학번이 s100이면..
				//stdnum = Integer.valueOf(students.get(0).num);
				//strstdnum = String.format("s%03d",stdnum); ,strstdnum 
				
				String newStdNum = this.newStdNum(); //새로운학번을 생성
				
				System.out.printf(" %s(%s) 입력 (QUIT:종료)>> ",item,newStdNum); // for반복문이라 item이 학번.. 이름.. 바뀌어가면서 뜬다.
				String str = keyBD.nextLine(); // item이 학번이면 학번의 index값이 getIndex에 의해 0번 값이 온다. 그 배열값에 키보드로 입력한 값이 들어간다.
				if (str.equals("QUIT"))
					return false;
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다
				if (item.toString().equals("학번") && this.selectStdNum(str) != null) { // item이 학번이면, 방금입력한 학번을 보내서 이미
																						// 존재하는지 물어본다 //null이 아닐경우 중복이다
					// item의 type(StdIndex)과 "학번의 type(문자) 가 다르므로 item을 문자로바꾸고 비교한다. &&는 앞이참이어야
					// 뒤에도검사
					System.out.println("학번 중복");
					continue; // for는 continue를 만나면 건너뛴다.. 이름으로 가버림

				}
				inputStr[item.getIndex()] = str;
				break;

			}

		} // end for
		StudentDto stDto = new StudentDto(); // dto의 요소들은 for문으로 반복할 수없다. 일일이 입력
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];

		students.add(stDto);

		return true; // 입력이 다끝나면 true를 return
	}
}
