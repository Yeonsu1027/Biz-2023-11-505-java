package com.callor.student.models;

public enum MenuIndex {
	학생정보_입력(1), 학생정보_조회(2),
	학생정보_가져오기(3), 학생정보_출력(4),
	학생정보_저장(5);
	
	private int index;
	private MenuIndex(int index) {
		this.index = index; //맴버변수에 매개변수를 할당..?
	}
	
	public int getIndex() {
		return index; //할당된 인덱스값을 리턴하여 외부에서 접근하게함
	}

}
