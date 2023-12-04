package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreCa2 {
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

	}

}
