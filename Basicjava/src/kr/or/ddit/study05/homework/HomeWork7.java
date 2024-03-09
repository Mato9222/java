package kr.or.ddit.study05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork7 obj = new HomeWork7();
		obj.method1();
		
	}


	private void method1() {
		/*
		 * 5명의 국어 영어 수학 점수를
		 * 2차원 배열을 이용해 선언 및 값을 저장하세요.
		 * score <-
		 * 스캐너 x
		 * 
		 * 5명의 이름을 저장한 배열 선언
		 * name <- 
		 */
		int[][] score = {{70,90,50,0,0,1},
						 {70,80,50,0,0,1},
						 {60,83,58,0,0,1},
						 {65,87,24,0,0,1},
						 {65,87,69,0,0,1}};
		String[] name = {"미연","민니","소연","우기","슈화"};
		
		/*
		 * 총점구하기, 평균, 등수 구하기
		 */
		for (int i = 0; i<score.length; i++) {
			score[i][3] = score[i][0]+score[i][1]+score[i][2];  //합계
			score[i][4] = score[i][3]/3; 						//평균
			for (int j = 0; j < score[i].length; j++) {
			}
		}
		
		// 등수 구하기
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if(score[i][3] < score[j][3]) score[i][5]++;
			}
		}
		//등수 교체 값 
		for (int i = 0; i < score.length-1; i++) {
			for (int j = 0; j < score.length-1; j++) {
				if (score[j][5] > score[j+1][5]) {
					int[] temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					
					String Temp2 = name[i];
					name[i] = name[j];
					name[j] = Temp2;
				}
			}
		}
		
		// 출력문
		System.out.println("이름:\t국어\t  영어\t 수학\t 총점\t평균\t랭크");
		for (int i = 0; i<score.length; i++) {
			System.out.print(name[i]+ " : ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"  \t");
			}
			System.out.println();
		}
	}
}
