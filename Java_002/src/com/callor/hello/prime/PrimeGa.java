package com.callor.hello.prime;

public class PrimeGa {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

//		int num = 0;
			int index = 0;
			int num = i+1; //for 문안에서 +-를 사용하면 오류가 날 수있으므로 i+1을 변수로 선언해둔다.
			for (index = 2; index < num ; index++) {
				if (num  % index == 0) {
					break;
				} // if

			} // for
			if (index>=num) {
				System.out.printf("%d 는 소수임\n",num);
			}
			

		}
	}
}
