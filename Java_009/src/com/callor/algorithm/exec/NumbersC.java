package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersC {
	
	public static void main(String[] args) {
		Line.dLine(50);
		NumberService numser = new NumberService(); //스캐너 초기화해서 가져오기
		int num =numser.inputNum("숫자를");
		Line.sLine(50);
		
		for(int main = 0; main < num ; main++) {
			System.out.printf("%3d",main);
			
			//main 0 : sub =0; sub<7 : 7-0
			//main 1 : sub =0; sub<6 : 7-1
			//main 2 : sub =0; sub<5 : 7-2
			
			for(int sub = 0; sub < num-main ; sub++) {
				System.out.printf("%3d",sub);
			}
			System.out.println();
		}
		
		for(int main = 0; main < num; main++) {
			// sub 7~0 : 7개
			// sub 7~1 : 6개
			// sub 7~2 : 5개
			for(int sub = num ; sub >main ; sub--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
//		
//		for(int i =0; i<num ; i ++) {
//		
//			for(int s =num; s>0 ; s--) { //처음에 num만큼 출력되고 하나씩 줄여나가기
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
	}

}
