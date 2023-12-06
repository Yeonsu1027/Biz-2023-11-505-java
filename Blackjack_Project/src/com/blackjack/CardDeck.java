package com.blackjack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class CardDeck {

	// 딜러가 16미만이면 카드 한장받고
	// 처음 받은카드 2장의 합이 21이 되면 무승부
	// 합이 21 초과 되면 진다.
	// 16 미만이면 반드시 hit, 17이상이면 hit and stay
	// 플레이어가 되면 카드는 초기화
	// 카드는 4개
	// A(1), 2~10, (KQJ = 10;)
	
	private List<CardDeck> cardDeck = null;
	
	public void card() {
		//1~KQJ
		int rndNum1 = (int)(Math.random()*13)+1; 
		int rndNum2 = (int)(Math.random()*13)+1;
		int rndNum4 = (int)(Math.random()*13)+1;
		int rndNum5 = (int)(Math.random()*13)+1;
	}
	
	public static void main(String[] args) {
		
		String data = "src/com/blackjack/pattern.txt";
		InputStream deck =null;
		try {
			deck = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
