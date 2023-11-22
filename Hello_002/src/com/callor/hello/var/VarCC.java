package com.callor.hello.var;

public class VarCC {
	public static void main(String[] args) {
		
		int scoreKor = 90;
		int scoreEng = 90;
		int scoreMath = 90;
		
		
		int total = scoreKor+scoreEng+scoreMath;
		
		int avg = (total)  /3;
		
		
		System.out.println("==================================");
		System.out.println( "성적표");
		System.out.println("==================================");
		scoreKor = 90;
		System.out.println(" 국어 : "+scoreKor);
		scoreEng = 90;
		System.out.println(" 영어 : "+scoreEng);
		scoreMath = 90;
		System.out.println(" 수학 : "+scoreMath);
		System.out.println("----------------------------------");
		total = scoreKor + scoreEng + scoreMath;
		System.out.println(" 총점 : "+ total);
		avg = total / 3;
		System.out.println(" 평균 : "+ avg);
		System.out.println("==================================");
		
		
	}

}
