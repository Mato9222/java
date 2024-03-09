package kr.or.ddit.study03.homework;

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
		
		obj.process();
	}
	public void process() {
		//윤년인지 판단하기. 
		
//		100으로 떨어지면 X 400으로 떨어지면 윤년 O
//		배수 % 만들기
		// && || !=
		System.out.println("년도를 입력하세요.");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}
		else { 
			System.out.println("평년입니다.");
		}
		/*
		 * if(year % 4==0) { System.out.println("윤년"); } else if (year % 100 == 0) {
		 * System.out.println("윤달이 아닙니다"); } else if (year % 400 == 0) {
		 * System.out.println("윤년"); } else { System.out.println("윤달이 아닙니다"); }
		 */
	}

}
