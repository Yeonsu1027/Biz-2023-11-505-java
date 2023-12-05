package com.blackjack;

// *******대충 실험용************

public class exexexex {
	public static void main(String[] args) {
		// heart deck
		String heartdeck = "♥A,♥2,♥3,♥4,♥5,♥6,♥7,♥8,♥9,♥J,♥Q,♥K";
		String[] heart = heartdeck.split(",");
		int hrndnum = (int) (Math.random() * 13) + 1;
		// --------------------------
		// spade deck
		String spadetdeck = "♠A,♠2,♠3,♠4,♠5,♠6,♠7,♠8,♠9,♠J,♠Q,♠K";
		String[] spade = heartdeck.split(",");
		int srndnum = (int) (Math.random() * 13) + 1;
		// --------------------------
		
		String nums[] = new String[2]; // 문양4개 인데 일단2개실험
		
		// 문양 카드 26장이 랜덤으로 나오게..
		int rnddeck = (int)(Math.random()*2);
		
		
		
		
		
	
		
		
		//test
		//???????????????
						
		System.out.println("┌───┐");
		System.out.printf("│ %s│\n",spade[srndnum]);
		System.out.println("└───┘");
		
		

		// 점수계산하기
//		int sum = 0;
//
//		if (hrndnum> 10) { // JQK 10점
//
//			hrndnum = 10;
//
//			sum += hrndnum;
//			if (sum > 21) {
//				System.out.println("패배했습니다");
//
//			}
//
//		}


	}

}
