package com.callor.student.model;

public enum Stdindex {
	
	학번(0),
	이름(1),
	학과(2),
	학년(3),
	전화번호(4),
	주소(5) ; //세미콜론 써야함 주의
	
	
	public int index;
	private Stdindex(int index) {
		this.index = index;
	}

}
