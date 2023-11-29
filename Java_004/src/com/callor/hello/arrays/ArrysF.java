package com.callor.hello.arrays;

public class ArrysF {
	//10명학생의 국어, 영어, 수학점수를 저장할배열
	//scoreKor..Math, Eng 선언
	//51뷰토 100까지 범위의 임의의 점수를 생성하여 배열 각 요소에 할당
	
public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
	
		
		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];
		int sumsK = 0;
		int sumsE = 0;
		int sumsM = 0;
		int sumsS = 0;
		int sumsA = 0;
		
		
		for(int i =0; i < scoreKors.length; i++) {
			scoreKors[i]= (int)(Math.random()*50)+51;
			sumsK += scoreKors[i];
		}
		for(int i =0; i < scoreEngs.length; i++) {
			scoreEngs[i]= (int)(Math.random()*50)+51;
			sumsE += scoreEngs[i];
		}
		for(int i =0; i < scoreMaths.length; i++) {
			scoreMaths[i]= (int)(Math.random()*50)+51;
			sumsM += scoreMaths[i];
		}
		
		for(int i =0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreEngs[i];	
			
			sumsS += sums[i];
		}
		for(int i =0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float)sums[i] /3;	
			sumsA += avgs[i]; 
		}
		
		
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표 ");
		System.out.println("-".repeat(80));
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i<STUDENT_LENGTH;i++) {
			System.out.printf("%3d\t",i+1);
			System.out.printf("%3d\t",scoreKors[i]);
			System.out.printf("%3d\t",scoreEngs[i]);
			System.out.printf("%3d\t",scoreMaths[i]);
			System.out.printf("%4d\t",sums[i]);
			System.out.printf("%5.2f\n",avgs[i]);
					
					
		}
		System.out.println("=".repeat(80));
		
			System.out.printf("총점\t%3d\t",sumsK);
			System.out.printf("%3d\t",sumsE);
			System.out.printf("%3d\t",sumsM);
			System.out.printf("%3d\t\n",sumsS);
		
			
			System.out.printf("평균\t%3d\t%3d\t%3d\t\t%3d\n",sumsK/STUDENT_LENGTH,sumsE/STUDENT_LENGTH,sumsM/STUDENT_LENGTH,sumsA/STUDENT_LENGTH);
			System.out.println("=".repeat(80));
			
			
		
		
	}

}
