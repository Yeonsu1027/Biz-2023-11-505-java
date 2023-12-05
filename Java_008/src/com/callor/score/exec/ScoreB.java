package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	
	public static void main(String[] args) {
		ScoreServiceA scoreSevice = new ScoreServiceA(); //class 를 객체로 초기화 시켜주는 함수  
		ScoreDto score = new ScoreDto();												// ScoreService class 의 method를 가져오기 위해 선언함  // ScoreService class 에는 static이없음
		scoreSevice.loadScores();
		scoreSevice.printScores();                    //scoreServie의 method를 가져온다
		
		
	}

}
