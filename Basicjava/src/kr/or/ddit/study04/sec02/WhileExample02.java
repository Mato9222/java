package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample02 obj = new WhileExample02();
		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		
	}

	private void method4() {
		out : while (true) {
			System.out.println("바깥쪽 while문");
			while(true) {
				System.out.println("안쪽 while문 ");
				break out;
			}
		}
		System.out.println("모든 와일문이 종료");
	}

	private void method3() {
		int sign = 1;
		int sum = 0;
		int i = 1;
		
		while(sum > -100) {
			sum += i*sign;
			sign = sign*-1;
			i++;
			System.out.println("while 진행중 : "+sum);
		}
		System.out.println(i+"번 실행됨."+sum);
	}

	private void method2() {
//		1-2+3-4...10=?
//		int i = 0;
//		int w =0;
//		while(i<=10) {
//			if(i%2==0) {
//				w = -i;
//			} else {
//				w = +i;
//			} 
//			System.out.println(i);
//		}
		int sign = 1;
		int sum = 0;
		for (int i=1; i<=10;i++) {
			sum += i*sign;
			sign = sign*-1;
		}
		System.out.println(sum);
	}
	

	private void method1() {
		/*
		 * 첫날에 100원, 그 다음날부터 전날의 2배씩 저축을 할때최초로 100만원을 넘는 날과 
		 * 그날까지 저축한 액수를 구하시오.
		 */
		int sum = 0;
		int amount = 100;
		int day = 0;
		
		while(sum<=1000000) {
			//전날의 2배씩저축을
			sum += amount;
			amount *= 2;
			day++;
			System.out.println(sum);
		}
		System.out.println("날짜수 : "+day);
		System.out.println("저축액 : "+sum);
	}
}
