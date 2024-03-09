package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}

	private void method4() {
		int[] s = new int[3];
	
		for(int i =0; i<s.length; i++) {
			s[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0;

		for (int i =0; i<s.length ; i++) {
			sum += s[i];
		}
		avg = sum/3;
		
		System.out.println(sum+" "+avg);
	}

	private void method3() {
		/*
		 * 배열 선언후  
		 */
		String[] arr = new String[3];
		for(int i=0; i<arr.length ; i++) {
			//System.out.println(arr[i]);
			arr[i] = sc.nextLine();
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void method2() {
		/*
		 * 
		 */
		String[] name = {"홍길동", "강감찬"	};
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		
	}

	private void method1() {
		/*
		 * char		<- 배열타입
		 * [] 		<- 변수 앞이나 뒤에
		 * alpabet 	<- 변수명
		 * new 		<- 객체 생성
		 * char 	<- 배열 타입
		 * [26]		<- 생성 숫자 
		 */
		char[] alpabet = new char[26];
		
	}
}
