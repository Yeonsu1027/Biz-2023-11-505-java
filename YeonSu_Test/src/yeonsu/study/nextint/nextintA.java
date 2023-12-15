package yeonsu.study.nextint;

import java.util.Random;

public class nextintA {
	public static void main(String[] args) {
		
		int one = 1;
		
		Random random = new Random(); 
		
		//nextint(10); 불가
		int rnd =0;
		
		rnd = random.nextInt(10);
		
		System.out.println(rnd);
		
	}

}
