package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample01 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample01 obj = new IfExample01();
		
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
		
		
	}
	private void method6() {
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if (score >= 90) {
			grade += "A";
			if (score == 100) { 
				grade += "+";
			} else if (score % 10 <= 2) {
				grade += "-";
			} else if (score % 10 >=6) {
				grade += "0";
			} else {
				grade += "+";
			}
		} else if (score >= 80) { 
			grade += "B";
		} else if (score >= 70) { 
			grade += "C";
		} else if (score >= 60) { 
			grade += "D";
		} else {
			grade += "F";
		}
		System.out.println(grade);
		
	}
	private void method5() {
		/* 
		 * 키보드로 점수를 입력받아
		 * A~F 학점 출력
		 * 0~2 - , 3~6 0 7~9 +
		 */
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.print("A");
			if (score <= 92) {
				System.out.println("-");
			} else if (score <= 96){
				System.out.println("0");
			} else {
				System.out.println("+");				
			}
		} else if (score >= 80) { 
			System.out.print("B");
			if (score <= 82) {
				System.out.println("-");
			} else if (score <= 86){
				System.out.println("0");
			} else {
				System.out.println("+");				
			}
		} else if (score >= 70) { 
			System.out.print("C");
			if (score <= 72) {
				System.out.println("-");
			} else if (score <= 76){
				System.out.println("0");
			} else {
				System.out.println("+");				
			}
		} else if (score >= 60) { 
			System.out.print("D");
			if (score <= 62) {
				System.out.println("-");
			} else if (score <= 66){
				System.out.println("0");
			} else {
				System.out.println("+");				
			}
		} else {
			System.out.println("F");
		}
		
	}
	private void method4() {
		/* 
		 * 키보드로 점수를 입력받아
		 * A~F 학점 출력
		 */
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) { 
			System.out.println("B");
		} else if (score >= 70) { 
			System.out.println("C");
		} else if (score >= 60) { 
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
	private void method3() {
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		if (score < 60) {
			System.out.println("불합격");
		} else if (score == 100) { 
			System.out.println("수석 합격");
		} else {
			System.out.println("합격");
		}
	}
	private void method1() {
		/*
		 * 점수를 입력 받아 60점 이하면 불합격 메세지 출력.
		 */
		int score = sc.nextInt();
		
		if(score <= 60) {
			System.out.println("불합격 입니다.");
		} 
		
	}
	private void method2() {
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		if (score < 60) {
			System.out.println("불합격");
		} else { 
			System.out.println("합격");
		}
	}
	
}
