package com.callor.score.exec;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

/*
 * List<ScoreDto> type scores 리스트 생성
 * "3명"의 성적처리를 수행
 * 
 * 키보드에서 3개의 점수를 입력받기
 * 점수는 50~100범위의 점수임
 * ScoreDto 클래스를 사용하여 객체를 생성하고
 * 입력받은 3개의 점수를 ScoreDto 객체의 국어, 영어, 수학 점수에 할당 한후
 * scores 리스트에 추가
 */

public class ScoreC {
	
	public List<ScoreDto> scores = null;
	
	
	public void service() {
		
		
		
		scores = new ArrayList<>();
		
		for ( int i=0; i <scores.size() ; i++) {
			ScoreDto scoreDto = scores.get(i);
			
			System.out.printf("%3d\t", scoreDto.kor);
			System.out.printf("%3d\t", scoreDto.eng);
			System.out.printf("%3d\t", scoreDto.math);
			
			scores.add(scoreDto);
		}
	}

	
	
	public void sscore(int scoreKor, int scoreEng, int scoreMath) {
		
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		
		int start = 50;
		int end = 100;
		
		
		scoreKor = numService.inputNumber("국어 점수", start, end);
		scoreEng = numService.inputNumber("영어 점수", start, end);
		scoreMath = numService.inputNumber("수학 점수", start, end);
		
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		System.out.printf("%d\t%d\t%d\t%d\n",
				scoreDto.kor,scoreDto.eng,scoreDto.math,scoreDto.getTotal());
		
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
