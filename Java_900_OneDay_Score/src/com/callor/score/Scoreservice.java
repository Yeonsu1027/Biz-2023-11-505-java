package com.callor.score;

import java.util.ArrayList;
import java.util.List;

public class Scoreservice {

	private List<ScoreDto> scores = null;

	ScoreDto scoredto = null;;

	public Scoreservice() {
		scores = new ArrayList<ScoreDto>();
		scoredto = new ScoreDto();

	}

	public void printScore() {
		//학생수
		int Std = 10;

		// 각 점수합계, 총점의합계
		int KorTotal = 0;
		int EngTotal = 0;
		int MathTotal = 0;
		int MusicTotal = 0;
		int ArtTotal = 0;
		int TotalTotal = 0;

		// 각과목평균, 평균의평균
		float KorAvg = 0.0f;
		float EngAvg = 0.0f;
		float MathAvg = 0.0f;
		float MusicAvg = 0.0f;
		float ArtAvg = 0.0f;

		float AvgAvg = 0.0f;
		// 평균평균
		float AvgAvg2 = 0.0f;

		Line.dLine(100);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(100);
		System.out.println("학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(100);

		// ------------------------------------ 학번구하기
//		String strStdNum = "23000";
//		if (scores.size() > 0) {  
//			
//			strStdNum = scores.get(scores.size() - 1).StdNum;
//		}
//	
//		int intStdNum = Integer.valueOf(strStdNum.substring(2));
//				
//		intStdNum++;
//		scoredto.StdNum = strStdNum;
//		
//		strStdNum = String.format("23%03d", intStdNum);
		// -------------------------------------

		
		
		String strStdNum = "23000";
		
		for (int i = 0; i < Std; i++) {
			
			
			//new 학번구하기
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);
			
						
			scoredto = new ScoreDto();
			

			scoredto.Kor = (int) (Math.random() * 50) + 51;
			scoredto.Eng = (int) (Math.random() * 50) + 51;
			scoredto.Math = (int) (Math.random() * 50) + 51;
			scoredto.Music = (int) (Math.random() * 50) + 51;
			scoredto.Art = (int) (Math.random() * 50) + 51;

			int ScoreKor = scoredto.Kor;
			int ScoreEng = scoredto.Eng;
			int ScoreMath = scoredto.Math;
			int ScoreMusic = scoredto.Music;
			int ScoreArt = scoredto.Art;

			int Total = scoredto.getTotal();
			float Avg = scoredto.getAvg();

			System.out.printf("%s\t\t", strStdNum);
			System.out.printf("%d\t", ScoreKor);
			System.out.printf("%d\t", ScoreEng);
			System.out.printf("%d\t", ScoreMath);
			System.out.printf("%d\t", ScoreMusic);
			System.out.printf("%d\t", ScoreArt);
			System.out.printf("%d\t", Total);
			System.out.printf("%.2f \n", Avg);

			KorTotal += ScoreKor;
			EngTotal += ScoreEng;
			MathTotal += ScoreMath;
			MusicTotal += ScoreMusic;
			ArtTotal += ScoreArt;
			TotalTotal += Total;

			AvgAvg += Avg;

			KorAvg = (float) KorTotal / Std;
			EngAvg = (float) EngTotal / Std;
			MathAvg = (float) MathTotal / Std;
			MusicAvg = (float) MusicTotal / Std;
			ArtAvg = (float) ArtTotal / Std;

			AvgAvg2 = (float) AvgAvg / Std;
			
			
			
			intStdNum++;

			scores.add(scoredto);
		} // end for
		
				
		
		

		Line.sLine(100);

		System.out.printf("총점\t\t%d\t%d\t%d\t%d\t%d\t%d\n", KorTotal, EngTotal, MathTotal, MusicTotal, ArtTotal,
				TotalTotal);
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n", KorAvg, EngAvg, MathAvg, MusicAvg, ArtAvg,
				AvgAvg2);

		Line.dLine(100);

	}

}
