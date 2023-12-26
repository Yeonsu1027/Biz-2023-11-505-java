package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;
import com.callor.blackjack.utils.AnsiConsol;
import com.callor.blackjack.utils.Line;

public class PlayerServiceImplV2  extends PlayerServiceImplV1{

	public PlayerServiceImplV2() {
		super("딜러");
	}
	public PlayerServiceImplV2(String playerName) {
		super(playerName);
	}
	
	
	//showcard만 변경하기위함
	@Override
	public void showCard() {
		
		if(myCardList.isEmpty()) {
			System.out.println("현재 보유중인 카드 없음");
			return;
		}
		
		Line.dLine(100);
		System.out.printf("%s, 받은카드 : %d, %d점\n",
				this.playerName, this.myCardList.size(),
				this.getScore()
				);
		
		Line.sLine(100);
		
		// 카드 한장을 그리는데 필요한 라인수
		int patternsCount = myCardList.get(0).getPatterns().length;
		for(int lines = 0; lines < patternsCount ; lines++) {
			for(CardDto dto : myCardList) {
				
			//	String line = dto.getPatterns()[lines]; //결과값의 line번째
				String line = String.format("%10s", dto.getPattern(lines));
				
				if("◆♣".contains(dto.suit)) { //suit에 클로버나다이아가 있으면
					System.out.print(AnsiConsol.RED(line));
				}else {
					System.out.print(AnsiConsol.CYAN(line));
				}
							
			}
			System.out.println(); //1번라인 출력~~ enter 8줄의 카드무늬가 주르륵나오게
		}
		
	}

	
}
