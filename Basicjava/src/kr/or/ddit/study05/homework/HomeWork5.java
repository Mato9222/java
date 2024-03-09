package kr.or.ddit.study05.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork5 obj = new HomeWork5();
		obj.process();
	}

	private void process() {
		String[] words = {"apple", "banana", "melon", "strawberry"};
		int ran = new Random().nextInt(words.length);
		String ans = words[ran];
		//단어 문자를 섞기
		char[] cArray = ans.toCharArray(); // tocharArray 문자열을 하나하나 쪼개서 배열로 넣어줌.
		for(int i=0; i<100000; i++) {
			int suffle = new Random().nextInt(ans.length());
			char temp = cArray[0];
			cArray[0] = cArray[suffle];
			cArray[suffle] = temp;
		}
		/*
		 * 맞출때 까지 실행할 것.
		 * 맞출경우 종로후  실행 횟수 출력.
		 */
		int count = 0;
		
		for (int i=0; i<cArray.length;i++) {
			System.out.print(cArray[i]);
		}
		System.out.println("");
		
		while(true) {
			System.out.println("정답 : ");
			String s = sc.nextLine();
			count++;
			if (s.equals(ans)) {
				System.out.println("정답입니다.");
				System.out.println(count+"번째 정답입니다.");
				break;
			} else { 
				System.out.println("틀렸습니다. 다시 :");
			}
		}
	}
}
