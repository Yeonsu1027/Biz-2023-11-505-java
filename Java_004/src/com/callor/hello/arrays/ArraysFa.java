package com.callor.hello.arrays;



public class ArraysFa {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
	
		
		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];
		
		int[] totalSum = new int[STUDENT_LENGTH];
		float[] totalavgs = new float[STUDENT_LENGTH];
		
		
		for(int i =0; i < scoreKors.length; i++) {
			scoreKors[i]= (int)(Math.random()*50)+51;
		}
		for(int i =0; i < scoreEngs.length; i++) {
			scoreEngs[i]= (int)(Math.random()*50)+51;
		}
		for(int i =0; i < scoreMaths.length; i++) {
			scoreMaths[i]= (int)(Math.random()*50)+51;
		}
		
		for(int i =0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreEngs[i];		
		}
		for(int i =0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float)sums[i] /3;	
		}
		
		for(int i=0; i <STUDENT_LENGTH; i++) {
			totalSum[0] += scoreKors[i];
			totalSum[1] += scoreEngs[i];
			totalSum[2] += scoreMaths[i];
		}
		
		//과목별평균
		for(int i = 0; i <SUBJECT_COUNT; i++) {
		 totalavgs[i] = (float)totalSum[i] / STUDENT_LENGTH;
		}
		
		
		
		
		
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표 ");
		System.out.println("-".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i<STUDENT_LENGTH;i++) {
			System.out.printf("%4d", i+1);
			System.out.printf("%4d\t",scoreKors[i]);
			System.out.printf("%4d\t",scoreEngs[i]);
			System.out.printf("%4d\t",scoreMaths[i]);
			System.out.printf("%5d\t",sums[i]);
			System.out.printf("%5.2f\n",avgs[i]);
					
					
		}
		System.out.println("-".repeat(80));
		System.out.print("총점\t");
		
		int totalOfTotalSum =0;
		
		for(int i =0; i <SUBJECT_COUNT; i++) {
			System.out.printf("%4d\t",totalSum[i]);
			totalOfTotalSum += totalSum[i];
		}
		
		System.out.printf("%5d\n",totalOfTotalSum);
		
		for(int i=0; i<SUBJECT_COUNT; i++) {
	//		System.out.printf("%4.0f\t", totalavg[i]);
	//		avgOfTotalavg += totalavg[i];
		}
		System.out.printf("%5d\n",totalOfTotalSum);
		
		System.out.println("=".repeat(80));
	}

}
