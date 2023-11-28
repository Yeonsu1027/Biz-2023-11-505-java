package com.callor.hello.method;

public class MethodJ {
	// public static boolean isEven(int num) method 선언
	// main method 에서 1~100범위의 수 중 random 수를 "5개" 생성하여
	// isEven method에 전달
	// isEven() 은 num이 짝수이면 true를 return, 아니면 false를 return
	// isEven method가 return 값을 참조하여 num 가 짝수인지 아닌지 판별하여 출력

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true; //2로 나누었을때 0이면 짝수임 true.
		}
		return false;// 0이 아니면 홀수임 false

	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			boolean even = isEven(num);  //isEven 이 boolean이므로, even을 boolean으로 작성해서 랜덤 수를 isEven method에 보내준다. //type이 같아야함
			if(even==true) { //even 은 boolean값(true,false) 위에서 짝수가 true
				System.out.println(num+"은짝수이다"); //따라서
			} else {
				System.out.println(num+"은홀수이다");
			}

		}
	}

}
