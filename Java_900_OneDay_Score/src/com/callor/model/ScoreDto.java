package com.callor.model;

import java.util.Scanner;

public class ScoreDto {
	
	
	
	
	public int Kor;
	public int Eng;
	public int Math;
	public int Music;
	public int Art;
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
