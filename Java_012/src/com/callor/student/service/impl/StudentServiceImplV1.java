package com.callor.student.service.impl;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utis.Line;

/*
 * StudentServiceImplV1 클래스는 StudentService interface 를
 * implements(상속, 설계를 이어받기) 하였다
 * 이때 interface에 정의된 method 들은 반드시 만들어야 한다
 * 그렇지 않으면 코드가 오류가 발생하여 진행이 되지 않는다
 * 
 * interface 와 class 간에 하나의 규칙이 만들어지는 것이다.
 * 
 * 이렇게 interface 를 implements 한 클래스를
 * "구현체" 클래스 라고한다.
 * 
 */
public class StudentServiceImplV1 implements StudentService {

	// 현재 ImplV1 클래스를 다른 클래스가 상속하였을때
	// protected 로 선언된 변수는 같이 상속이 된다
	// 즉 ImplV1 을 상속한 클래스에서는 별도로
	// students 리스트 객체(변수)를 선언하지 않아도 된다
	protected List<StudentDto> students = null;
	protected Scanner keyBD = null;
	
	
	public StudentServiceImplV1() {
		students = new ArrayList<StudentDto>();
		keyBD = new Scanner(System.in);
	}
	
	// 학번을 매개변수로 전달받아 students 리스트를 검색하여
	// 동일한 학번의 요소가 있으면 그 요소를 return
	// 없으면 null 을 return
	protected StudentDto selectStdNum(String num) { //리턴하는 std가 studenDto 타입이니까 method 타입도 동일
		// TODO:학생정보 찾기
		for(StudentDto std : students) {
			if(std.num.equals(num)) { //입력받은 학번이 std의 num(학번)과 같으면 중복
				return std;
			}
			
		}
		// 여기에 코드가 도달하면, 같은 학번이 없다!!
		return null;
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
		String[] inputStr = new String[StdIndex.values().length]; //Stdindex에 선언되어있는 6개의 요소 개수 0~5 "StdIndex.values() : 배열이란뜻" / .values 자체가 StdIndex의 배열이다.
		for(StdIndex item : StdIndex.values()) {  //StdIndex의 요소를 item에 하나씩.. 학번..이름..학과.. 저장한다.
			while(true) {
				
				String newStdNum = this.newStdNum(); //새로운학번을 생성
				
				System.out.printf(" %s(%s) 입력 (QUIT:종료)>> \n",item,newStdNum ); 
				String str = keyBD.nextLine(); //item이 학번이면 학번의 index값이 getIndex에 의해 0번 값이 온다. 그 배열값에 키보드로 입력한 값이 들어간다.
				if(str.equals("QUIT")) return false; 
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다
				if(item.toString().equals("학번")) {  //학번인 경우에만 중복과, ~를사용함. 검사 나머지는 빈칸만 검사
					
					if(str.isBlank()) {
						System.out.printf("**학번은 %s를 사용함 \n",newStdNum);
					}
					
					
					
					if( this.selectStdNum(str) != null) { //item이 학번이면, 방금입력한 학번을 보내서 이미 존재하는지 물어본다 //null이 아닐경우 중복이다
				
					// item의 type(StdIndex)과 "학번의 type(문자) 가 다르므로 item을 문자로바꾸고 비교한다.  &&는 앞이참이어야 뒤에도검사
					System.out.println("학번 중복");
					continue; //for는 continue를 만나면 건너뛴다.. 이름으로 가버림
					}
			} else if (str.isBlank()) {
				System.out.println("값을 입력해주세요");
				System.out.printf("%s 는 필수항목입니다\n",item);
				continue;
			}
				inputStr[item.getIndex()] = str;
				break;
				
			}
			
			
		}
		StudentDto stDto = new StudentDto();  //dto의 요소들은 for문으로 반복할 수없다. 일일이 입력
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];
		
		students.add(stDto);
		
		return true; //입력이 다끝나면 true를 return
	}

	@Override
	public void inputStudents() {
		// TODO:여러학생의 정보받기
//		while(true) {
//			if(this.inputStudent()) {
//				break;
//			}
//		} 를 아래처럼 줄인다. if를 없앴음.
		
		boolean result = true; //result 를 true로 해두어서 
		while(result) { //while 안에 넣고 true로 실행.
			Line.sLine(100);
			result = this.inputStudent(); // 여기서 입력이끝나면 true가 return되므로 계속작성, QUIT면 false로 종료
			Line.sLine(100);
		}
		System.out.println("입력 끝");
	}

	@Override
	public void loadStudent() {
		// TODO 학생정보 읽어오기
		
	}

	@Override
	public void printStudent() {
		// TODO:학생정보 출력하기
		
		Line.dLine(100);
		System.out.println("한울고교 학생정보");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
		
		for(StudentDto dto : students) {
			System.out.printf("%s\t",dto.num);
			System.out.printf("%s\t",dto.name);
			System.out.printf("%s\t",dto.dept);
			System.out.printf("%s\t",dto.grade);
			System.out.printf("%s\t",dto.tel);
			System.out.printf("%s\t\n",dto.addr);
		}
		Line.dLine(100);
	}

	@Override
	public void saveStudent() {
		
		
		
		
	}

}
