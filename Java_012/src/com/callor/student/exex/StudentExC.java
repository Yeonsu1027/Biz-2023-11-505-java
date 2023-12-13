package com.callor.student.exex;

import com.callor.student.models.StdIndex;

public class StudentExC {
	public static void main(String[] args) {
		System.out.println(StdIndex.학번.getIndex()); //stindex에 있는 학번이 몇번(몇번index)이냐? // util enum
		System.out.println(StdIndex.이름.getIndex());
		
		// StdIndex enum에 선언된 요소들을 배열로 변환하고
		// indexArray 배열에 복살하라
		StdIndex[] indexArray = StdIndex.values();
		
		for(int i = 0; i <indexArray.length ; i++) {}
			for(StdIndex item : indexArray){ //item은 각요소의 이름을가진다
				System.out.printf("%d, %s\n",item.getIndex(),item);
			}
		
		
	}

}
