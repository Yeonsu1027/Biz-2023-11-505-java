package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

// 생성자 method 를 선언하고,
// Scanner를 통하여 data.txt 파일을 열어 데이터를 읽을 준비를 하는 코드를 작성
public class ScoreServiceB {

	private Scanner scan = null;
	public List<ScoreDto> scores = null;

	// private List<Integer> nums =null; // nums의 type은 List, 요소의 타입은 Integer라는 의미

	/*
	 * ScoreServiceB 클래스의 생성자 method 어떤 도구들을 (미리)준비하는 일을 수행한다
	 */

//calss 와 이름이 같은 생성자 method/ 빈공간에서 ctrl space bar 하면 자동생성.
	public ScoreServiceB(String dataFile) { // dataFile 을 매개변수로해서 어딘가에서 dataFile 정보를 받기위함
		// String dataFile = "";
		InputStream is = null; // 파일여는 도구

		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);

		// Item(요소) 개수가 0인 상태의 List가 준비된다
		scores = new ArrayList<>(); // 요소를 선언할 준비 해두기
		// scores = new LinkedList<>(); //이 3개의 사용법은 같다
		// scores = new Vector<>();

	}// end 생성자

	public void loadScores() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			// System.out.println(line);

			String[] lines = line.split(".");
			ScoreDto scoreDto = new ScoreDto();
			try {
				scoreDto.stdnum = lines[0];

				scoreDto.kor = Integer.valueOf(lines[1]);
				scoreDto.eng = Integer.valueOf(lines[2]);
				scoreDto.math = Integer.valueOf(lines[3]);
				scoreDto.music = Integer.valueOf(lines[4]);
				scoreDto.art = Integer.valueOf(lines[5]);
				scoreDto.sw = Integer.valueOf(lines[6]);
				scoreDto.db = Integer.valueOf(lines[7]);

			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;

			}

			// List type 의 데이터 목록에
			// ScoreDto 요소를 추가하기
			// List type 의 데이터 맨끝에 추가된다.
			scores.add(scoreDto); // 배열과 마찬가지로 index 0부터 시작

		} // end while

	}// end lodaScore()

	public void countScore() {
		System.out.println(scores.size()); // size는 []배열의 length 역할
	}

	public void printScore() {

		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(100);
		for (int i = 0; i < scores.size(); i++) {
			ScoreDto scoreDto = scores.get(i); // 가진요소중에서 i번째 요소를 달라

			System.out.printf("%s\t", scoreDto.stdnum);

			System.out.printf("%3d\t", scoreDto.kor);
			System.out.printf("%3d\t", scoreDto.eng);
			System.out.printf("%3d\t", scoreDto.math);
			System.out.printf("%3d\t",scoreDto.music);
			System.out.printf("%3d\t",scoreDto.art);
			System.out.printf("%3d\t",scoreDto.sw);
			System.out.printf("%3d\t",scoreDto.db);
			System.out.printf("%3d\t", scoreDto.getTotal());
			System.out.printf("%3d\t", scoreDto.getAvg());

		}

	}// end printScore()

}