package com.callor.score.service;

import java.util.ArrayList;

import com.callor.score.models.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {
	
	private static int 국어 = 0;
	private static int 영어 = 1;
	private static int 수학 = 2;
	private static int 음악 = 3;
	private static int 미술 = 4;
	
	
	private int[] totalScore = null; //int 형에는 null 을 쓸 수없지만 배열이라 가능
	
	
	public ScoreServiceV2() {
		scores = new ArrayList<ScoreDto>();
		totalScore = new int[5];
	}

	@Override
	public void printScore() {
		super.printScore();
		// System.out.println("나는 V2에 추가한 코드야!");
		
		for(ScoreDto dto : scores) {
			totalScore[국어] += dto.kor;  //[0]..1234 하면 헷갈리니 미리 변수로 설정 (masicString 방지)
			totalScore[영어] += dto.eng;
			totalScore[수학] += dto.math;
			totalScore[음악] += dto.music;
			totalScore[미술] += dto.art;
		}
		
		int allTotal = 0;
		System.out.printf("총점\t");
		for(int score : totalScore ) { //totalScores 의 요소가 score 변수에 하나씩담긴다 는의미
			System.out.printf("%4d\t",score);
			allTotal += score;
		}
		System.out.printf("%4d\n",allTotal);
		
		float allAvg = 0;
		System.out.print("평균\t");
		for(int score : totalScore) {
			
			float avg = (float)score /scores.size();
			System.out.printf("%.1f\t",avg);
			allAvg +=avg;
					
		}
		System.out.printf("\t%.2f\n",allAvg/totalScore.length);
		Line.dline(100);
		
	}
}
