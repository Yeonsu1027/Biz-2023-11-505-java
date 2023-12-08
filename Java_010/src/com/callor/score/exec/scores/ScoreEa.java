package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;

public class ScoreEa {
	
	public static void main(String[] args) {
		ScoreService socreService = new ScoreService();
		
//		for(int i =0; i < 100; i++) {
			socreService.inputScore(0,100);
		}
//	}

}
