package kr.or.ddit.study10.sec01;

import java.util.Scanner;

public class ExceptionExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample03 obj = new ExceptionExample03();
		obj.test1();
	}

	private void test1() {
		test2();
		
	}
	private void test2() {
		test3();
		
	}
	private void test3() {
		System.out.println("문자를 입력하세요 : ");
//			int num = sc.nextInt();
		try {
			String str = sc.next();
			int num = Integer.parseInt(str);
			
			int[] arr = new int [2];
			for(int i=0; i<10;i++) {
				arr[i] = i;
			}
			
		} catch (Exception e) { // 여러개 가능 
			System.out.println("배열 길이가 올바르지 않음.");
			
		}
		
		System.out.println("프로그램 실행 되고있음.");
	}
}
