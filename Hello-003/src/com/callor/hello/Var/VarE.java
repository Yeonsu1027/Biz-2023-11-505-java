package com.callor.hello.Var;

public class VarE {
	public static void main(String[] args) {
		
		String nation = "대한민국";
		int num = 30;
		
		// num(정수형변수)에 저장된 값을 복사하여
		// nation(문자열형변수)에 저장(할당)해달라고 요청
		// 오류가 난다. num 변수에 저장된 값을 문자열로
		// 먼저 문자열로 바꾸고 그리고 nation 에 저장하면 된다
		nation = num + "";
	}

}
