package yeonsu.study.ee;

public class EnumtestA {
	public static void main(String[] args) {
		
		
		System.out.println(testenumA.오리.getIndex()); // enum에서 적은(index)를 getIndex 를통해 가져온다
		
		System.out.println(testenumA.values().length); // enum의 배열의 수 // enum.values() 는 enum에 적은 내용이 배열로 나타난다
		
		System.out.println(testenumA.고양이.getIndex()); //배열의 순서대로 012.. 로 가는게 아닌 직접 인덱스 번호를 설정하는 식인듯?
	}

}
