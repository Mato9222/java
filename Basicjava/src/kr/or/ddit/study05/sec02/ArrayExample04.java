package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample04 obj = new ArrayExample04();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();	
		
	}

	
	private void method4() {
		int[][] scores = new int [3][3];
		/* 
		 * 스캐너를 통해 첫번째 ,2,3 학생 국어,영어,수학 점수 입력받기
		 */
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"학생의 국어, 영어, 수학 점수를 입력하세요.");
			int kscore = sc.nextInt();
			int escore = sc.nextInt();
			int mscore = sc.nextInt();
			scores[i][0] = kscore;
			scores[i][1] = escore;
			scores[i][2] = mscore;
			
			for (int j = 0; j < scores.length; j++) {
				scores[i][j] = scores[i][j];
				System.out.println(scores[i][j]);
			}
		}
		
	}


	private void method3() {
		/*
		 * 1번째 학생에 영어 점수
		 * 2번째 학생에 영어 수학 점수
		 * 3번째 학생에 국어점수 각각 출력해보기.
		 */
		int[][] arr = new int [3][3];
		
		int [] s1 = {85,95,77,0};
		int [] s2 = {91,76,68,0};
		int [] s3 = {100,90,89,0};
		int[][] scores = new int[3][4];
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
		
		int s1e = scores[0][1];
		int s2e = scores[1][1];
		int s2m = scores[1][2];
		int s3k = scores[2][0];
		
	}


	private void method2() {
		int [] s1 = {70,65,90,0};
		int [] s2 = {80,90,62,0};
		int [] s3 = {100,100,100,0};
		/*
		 * 2차원 배열 
		 * 
		 * int[][]	<- 타입
		 * scores	<- 변수명
		 * new		<- 객체 생성
		 * int [3]	<-1차원 배열의 수 [3] <-1차원 배열 길어;
		 */
		int[][] scores = new int[3][4];
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
			
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			for (int j=0; j<scores.length ; j++) {
				sum += scores[i][j];
			}
			scores[i][3] = sum;
		}
		for (int i=0; i<scores.length; i++) {
			for(int j = 0; j<scores.length ;j++) {
				System.out.println(scores[i][j]+"\t");
			}
			System.out.println("평균 : "+scores[i][3]/3.0);
		}
	}


	//출력값 다시 한번 보기
	private void method1() {
		/*
		 * 학생 3명 국어, 영어, 수학 점수 저장
		 * 스캐너 사용 x
		 */
		int [] score1 = {70,65,90};
		int [] score2 = {80,90,62};
		int [] score3 = {100,100,100};
		double avg = 0;
		
		double sum1 = 0;
		for (int i = 0; i < score1.length; i++) {
			sum1 += score1[i];
			System.out.print(score1[i]+"\t");
		}
		avg = (double)sum1/3;
		System.out.println("합계 : "+sum1+"평균 : "+avg);
		
		double sum2 = 0;
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i]+"\t");
			sum2 += score2[i];
		}
		avg = (double)sum2/3;
		System.out.println("합계 : "+sum2+"평균 : "+avg);
		
		
		double sum3 = 0;
		for (int i = 0; i < score3.length; i++) {
			System.out.print(score3[i]+"\t");
			sum3 += score3[i];
		}
		avg = (double)sum3/3;
		System.out.println("합계 : "+sum3+"평균 : "+avg);
		
	}
}
