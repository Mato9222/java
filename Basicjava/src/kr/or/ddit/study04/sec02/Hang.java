package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class Hang {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Hang obj = new Hang();
		obj.method1();
		
	}

	private void method1() {
		/*
		 * 문자열 맞추는게임 
		 * □□□□□□
		 * ex ) 정답 apple 
		 * a입력시 
		 * a□□□□
		 * 완료될떄까지 시행
		 */
		String question = "apple";
		char[] answer = new char[question.length()];
		for (int i = 0; i<question.length(); i++) {
			answer[i] = 'ㅁ';
		}
		while(true) {
			for (int i =0; i<question.length();i++) {
				System.out.println(answer[i]); //빈칸출력
			}
			System.out.println();
			// 문자열입력.
			System.out.println("단어를 맞춰보세요 (입력 문자 하나)");
			String str = sc.nextLine();
			
			// 문자열에서 문자 첫번째 문자 하나 꺼내기.
			char ch = str.charAt(0);
			//같은 문자열 있다면 빈칸을 영어로 바꿔주기
			for (int i = 0 ; i < question.length(); i++) {
				if ( ch == question.charAt(i)) {
					answer[i] = ch;
				}
				//ch값과 같다면 answer 값 바꿔주기 
			}
			// 정답을 맞춘다면 완료.
		}
		// 싫행하는데 걸린 획수 출력.
	}
}
