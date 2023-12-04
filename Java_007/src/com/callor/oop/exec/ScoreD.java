package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreD {
	public static void main(String[] args) {
		// ----------------------------------------------------

		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;

		int i = 0;
		// ----------------------------------------------------

		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();

		for (i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();

		}
		// 10개의 배열의 각 과목점수를 random으로 생성하고자 한다.
		//선생님한거

		for (i = 0; i < scores.length; i++) { // 0-9까지 10개
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;

		}
		
		
		
	//--------------------------------------------------출력  //내가한거 선생님은 Ca
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		for (i=0 ; i<5;i++) { //철수 영희 민수 길동 꺽정이 5명
			
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",scores[i].scoreKor,scores[i].scoreEng,scores[i].scoreMath
					,scores[i].getScoreTotal(),scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
		

	}
	

}
