package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreC {
	//ScoreService 클래스를 사용하여 scores 배열을 10개 "선언"
	//score배열의 각 요소를 생성자를 사용하여 초기화 하기
	//단, for()반복문을 사용하여 초기화하기
	
	public static void main(String[] args) {
		
		ScoreService[] scores = new ScoreService[10];
		
		for(int i = 0 ; i<10 ; i++ ) { //0-9까지
			scores[i] = new ScoreService();
		}
	}

}
