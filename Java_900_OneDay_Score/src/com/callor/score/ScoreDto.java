package com.callor.score;

import java.util.Scanner;

public class ScoreDto {
	
	
	
	
	int Kor;
	int Eng;
	int Math;
	int Music;
	int Art;
	public int StdNum;
	
	private int total;
	private float avg;
	
	
	
	
	public int getTotal() {
		
		
		total = Kor;
		total += Eng;
		total += Math;
		total += Music;
		total += Art;
		
		return total;
		
		
	}
	
	public float getAvg() {
		
	
		getTotal();
		
		
		avg = (float)total /5;
		
		return avg;
		
	}
	
	
	
	
}
