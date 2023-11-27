package com.callor.hello.prime;

public class PrimeGa {
	public static void main(String[] args) {

		for (int num = 2; num < 100; num++) {

//		int num = 0;
			int index = 0;
			for (index = 2; index < num + 1; index++) {
				if (num + 1 % index == 0) {
					break;
				}//if

			}//for
			
		}
	}

}
