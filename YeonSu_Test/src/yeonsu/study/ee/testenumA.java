package yeonsu.study.ee;

public enum testenumA {
	오리(1), 닭(2), 쥐(3), 고양이(7);

	
	
	
	private int index;
	testenumA(int index) {
		this.index = index; //맴버변수에 매개변수를 할당..?
		
	}

	public int getIndex() {
		return index; //할당된 인덱스값을 리턴하여 외부에서 접근하게함
	}
	
}
