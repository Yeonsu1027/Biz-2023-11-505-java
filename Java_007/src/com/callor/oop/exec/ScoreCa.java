package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreCa {
	// ScoreService 클래스를 사용하여 scores 배열을 10개 "선언"
	// score배열의 각 요소를 생성자를 사용하여 초기화 하기
	// 단, for()반복문을 사용하여 초기화하기
	// 51~100까지의 범위의 임의의 정수 3개를 생성하고
	// 각 배열 요소의 scoKor, eng, math에 할당

	public static void main(String[] args) {
		// ----------------------------------------------------

		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;


		int i = 0;
		// ----------------------------------------------------

		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();

		for (i = 0; i < scores.length; i++) { //scores 배열을 먼저10개 만들고
			scores[i] = new ScoreService();
			
		}
		// 10개의 배열의 각 과목점수를 random으로 생성하고자 한다.

		for (i = 0; i < scores.length; i++) { //여기서 scores 배열을 사용하여 30개의 랜덤한 수를 생성한다 //10개의 배열이 3번씩 반복
			//내가한거 

			scoreKor = (int) (Math.random() * 50) + 51;  //랜덤수를 for문안에 둬서 계속 새로운 랜덤수를 생성하도록 함.
			scoreEng = (int) (Math.random() * 50) + 51;
			scoreMath = (int) (Math.random() * 50) + 51;
			
			scores[i].scoreKor = scoreKor;
			scores[i].scoreEng = scoreEng;
			scores[i].scoreMath = scoreMath;

		}
		
		//선생님거 내가한거d
		
		
		// 배열에 저장된 점수 화면에 출력하기
		// Line.title("성적표");
		Line.title(100,"성적표"); //위아래 100개의 라인을 긋고 그안에 성적표 제목을 표시하라.
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for( i =0; i<scores.length;i++) {
			System.out.printf("%3d\t",scores[i].scoreKor);
			System.out.printf("%3d\t",scores[i].scoreEng);
			System.out.printf("%3d\t",scores[i].scoreMath);
			
			System.out.printf("%3d\t",scores[i].getScoreTotal());
			System.out.printf("%5.2f\t\n",scores[i].getScoreAvg());
			
		}
		Line.sLine(50);
		
		
	}

}
