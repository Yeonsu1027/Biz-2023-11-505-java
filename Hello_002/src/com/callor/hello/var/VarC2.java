package com.callor.hello.var;

public class VarC2 {
	public static void main(String[] args) {
		
		int scoreKor = 90;
		int scoreEng = 90;
		int scoreMath = 90;
		
		// 데이터를 변수에 할당하는 곳
		scoreKor = 90;
		scoreEng = 90;
		scoreMath = 90;
		
		int total = scoreKor+scoreEng+scoreMath;
		
		int avg = (total)  /3;
		
		
		System.out.println("==================================");
		System.out.println( "성적표");
		System.out.println("==================================");
		System.out.println(" 국어 : "+scoreKor);
		System.out.println(" 영어 : "+scoreEng);
		System.out.println(" 수학 : "+scoreMath);
		System.out.println("----------------------------------");
		
		System.out.println(" 총점 : "+ total);
		System.out.println(" 평균 : "+ avg);
		System.out.println("==================================");
		
		
	}

}
