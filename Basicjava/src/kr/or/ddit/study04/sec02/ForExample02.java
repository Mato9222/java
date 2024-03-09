package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.method1();
//		obj.method2();
//		obj.method3();
	}

	private void method3() {
		for (int h=0; h<5; h++) {
			for (int w = 0; w<h+1 ; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	private void method2() {
		/*1)       2)       3)       4)       5)       6)
		 * *****   *        *****    *****          *      *
		 * *****   **       ****      ****         **     ***
		 * *****   ***      ***        ***        ***    *****
		 * *****   ****     **          **       ****   *******
		 * *****   *****    *            *      *****  *********
		 */
		for (int h = 0 ; h<5 ; h++) {
			for (int w = 0 ; w<5 ; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	private void method1() {
		int j=2;
		for (int i=2; i<10; i++) {
			for(j=2; j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}
		
	}
}
