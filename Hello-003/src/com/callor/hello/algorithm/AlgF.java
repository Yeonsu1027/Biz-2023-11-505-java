package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 5백, 1백, 50원, 10원 단위이다
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩이 포함되는지
		 * 출력하시오
		 */
		
		int pay = 3587960;
		
		int num1 = 0;
		
		System.out.println("======================");
		num1 = pay % 100; // 60
		System.out.println("10원 권 : "+(num1-50)/10);
		System.out.println("50원 권 : "+num1/50);
		num1 = pay % 1000; // 960
		System.out.println("100원 권 : "+(num1-500)/100);
		System.out.println("500원 권 : "+num1/500);
		num1 = pay % 10000; // 7960
		System.out.println("1000원 권 : "+(num1-5000)/1000);
		System.out.println("5000원 권 : "+num1/5000);
		int num2 = 0; //pay 358만...,  5만원권 71장, 만원 권 3장    71*5만원
		num2= pay/50000;
		System.out.println("10000원 권 : "+(pay-(num2*50000))/10000);
		System.out.println("50000원 권 : "+num2);
		System.out.println("======================");
	
		
		
		
	}


}
