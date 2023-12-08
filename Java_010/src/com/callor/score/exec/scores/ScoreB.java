package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreB {
	//키보드에서 3개의 점수를 입력받기
	// 점수는 50~100 범위의 점수임
	//ScoreDto 클래스를 사용하여 객체를 생성하고
	//입력받은 3개의 점수를 ScoreDto 객체의 국어,영어,수학 점수에 할당
	//3과목의 총점을 계산해서 출력
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto scoredto = new ScoreDto();
		
		
		scoredto.kor = numService.inputNumber("국어 점수", 50, 100);
		scoredto.eng = numService.inputNumber("영어 점수", 50, 100);
		scoredto.math = numService.inputNumber("수학 점수", 50, 100);
		
		Line.sLine(50);
		System.out.println(scoredto.getTotal());
		
		
		
	}

}
