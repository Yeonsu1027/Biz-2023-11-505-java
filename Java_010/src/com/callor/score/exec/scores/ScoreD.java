package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

/*
 * List<ScoreDto> type scores 리스트 생성
 * "3명"의 성적처리를 수행
 * 
 * 키보드에서 3개의 점수를 입력받기
 * 점수는 50~100범위의 점수임
 * ScoreDto 클래스를 사용하여 객체를 생성하고
 * 입력받은 3개의 점수를 ScoreDto 객체의 국어, 영어, 수학 점수에 할당 한후
 * 입력된 순서대로 학번을 "S0001"형식의 문자열로 만들어
 * ScoreDto 객체의 학번에 할당
 * 
 * 
 * scores 리스트에 추가
 */



/*
 * 여러명의 학생 성적 데이터를 변수에 저장하고 처리하기
 * 
 * 데이터 소스(키보드입력, random(), file 에서 읽기)를
 * 가지고 정보처리를 하기 위해서는
 * 먼저 각 학생 개인의 점수를 Dto 객체에 담고
 * Dto 객체에 담긴 학생 개인의 점수를 List 객체에 추가한다
 * 
 */
public class ScoreD {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		// scores 의 type은 List
		// scores 의 요소들의 type은 ScoreDto
		// ScoreDto 가 여러개 포함될 리스트 변수
		// 아직은 요소가 0인 리스트 생성
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		
		int start = 50;
		int end =100;
		String stNum2 = null; 
		int stNum =0;
		
		
		for(int index = 0; index <3 ; index++ ) {
			
			ScoreDto scoreDto = new ScoreDto(); //list에 dto를 추가할때 항상 새로만들어야 한다
			stNum = index+1;
			// 키보드로 입력받은 데이터를
			stNum2  = String.format("S%04d", stNum);
			int scoreKor = numService.inputNumber(stNum2+"번의 국어점수",start,end);
			int scoreEng = numService.inputNumber(stNum2+"번의 영어점수",start,end);
			int scoreMath = numService.inputNumber(stNum2+"번의 수학점수",start,end);
			
			
			// Dto 객체의 각요소에 점수를 할당하고
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			// List 객체에 추가하기
			scores.add(scoreDto); // dto new가 for문 밖에 있으면 scores한개에 3번추가한게 된것
			
		}
		
		
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		for(int i = 0; i <scores.size() ; i++) {
			ScoreDto dto = scores.get(i);
			
			stNum = i+1;
			stNum2  = String.format("S%04d", stNum);
			
			
			System.out.printf("%s\t",stNum2);
			System.out.printf("%d\t",dto.kor);
			System.out.printf("%d\t",dto.eng);
			System.out.printf("%d\t",dto.math);
			System.out.printf("%d\n",dto.getTotal());
			
		}
		Line.dLine(50);
	}

}
