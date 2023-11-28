package com.callor.hello.method;

public class MethodCa {

	/*
	 * String nation() :
	 * 			문자열 데이터를 필수로 return 해야한다
	 */
	public static String nation() {
		String nation = "대한민국";                         // nation.nation
		//return nation;
		return "대한민국";            // 두개 중 택1
	}
	
	
	
	
	public static void main(String[] args) {
		String nation = nation();      //여기서 선언된 nation은 위의 것과 이름은 같지만 다름.  // main.nation
		System.out.println(nation);
		
		//.. println() method 는 화면에 값을 출력만할 뿐
		// return type 이 void 이다
		 System.out.println( nation() ); 
		
	}

}
