package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample03 obj = new ForExample03();
		
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
		
	}

	private void method7() {
		for(int i=0; i<10; i++) {
			if(i<2) {
				continue;
			}
			System.out.println("i값은 : "+i);
		}
		
	}

	private void method6() {
		/* 
		 * 숫자를 입력 받고해당 숫자까지의 곱을 구해보기.
		 * 
		 * ex) 5 -> 1*2*3*4*5
		 */
		int num = sc.nextInt();
		long gop = 1;
		for (int i = 1; i<=num; i++) {
			gop *= i;
			System.out.printf("%d * %d = %d\t",i,gop,gop);
		}
	}

	private void method5() {
		/* 
		 * 소문자 문자열을 입력 받고  모음을 제거하기
		 * apple -> ppl
		 */
		String str = sc.nextLine();
		
		String result ="";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u') {
//				continue;
			} else {
				result += str.charAt(i);
				
			}
		}
		System.out.println(result);
	}

	private void method4() {
		/*
		 * 스캐너를 통해 숫자를 입력 받고 
		 * 홀수라면 1부터 해당 숫자까지 홀수의 합,
		 * 짝수라면 2부터 해당숫자까지 짝수의 합.
		 * 
		 * ex) 9 1~9까지 홀수의 합.
		 */
		int num = sc.nextInt();
		int sum = 0;
		
		if ( num % 2 == 0 ) {
			for (int i=2 ; i<=num ; i=i+2) {
				sum += i;
				System.out.println(i+"+"+sum+"="+sum);
			}
		} else {
			for (int i=1 ; i<=num ; i=i+2) {
				sum += i;
				System.out.println(i+"+"+sum+"="+sum);
			}
		}
//		System.out.println(sum);
		
	}

	private void method3() {
		/* 
		 * 여러 문자를 입력 받아.
		 * a -> A변환.
		 * A -> a변환.
		 */
		String str = sc.nextLine();
		for(int i=0; i< str.length(); i++) {
			char c= str.charAt(i);
			int cp = 'a'-'A';
			char change = ' ';
			if ('a'<= c && c<='z') {
				change = (char)(c-cp);
			}
			if ('A'<= c && c<='Z') {
				change = (char)(c+cp);
			} 
				System.out.print(change);
		}
		
	}

	private void method2() {
		/*
		 * a -> A 변환 .
		 * A -> a 변환.
		 */
		char c = sc.nextLine().charAt(0);
//1		int cp = 'a'-'A';
		
		if (c>='a'&& c<='z') {
			System.out.println((char)(c-32));
//1			char change = (char)(c-cp); 
		} 
		if (c>='A'&& c<='Z') {
			System.out.println((char)(c+32));
		}
		
	}

	private void method1() {
		/*
		 *  a~z까지 출력해주는 프로그램 만들기.
		 */
//		char a ='a';
//		int i = a+0;
//		char a0 = (char) i;
		
//		for (i = 0 ; i <= 23 ; i++ ) {
//			System.out.println((char)(a+i));
//		}
		
		for (char c='a'; c <= 'z' ; c++) {
			System.out.print(c+"\t");
		}
	}
	
}
