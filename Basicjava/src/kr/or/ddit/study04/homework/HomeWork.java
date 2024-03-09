package kr.or.ddit.study04.homework;

import java.util.Scanner;

public class HomeWork {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork obj = new HomeWork();
		
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

	private void method4() {
		for (int h=1 ; h<6 ; h++ ) {
			for (int b=1 ; b<6-h; b++) 
				System.out.print(" ");	
			for (int w=0 ; w<h*2-1 ; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private void method3() {
		for (int h=0 ; h<5 ; h++ ) {
			for (int b=1 ; b<5-h ; b++) 
				System.out.print(" ");	
			for (int w=0 ; w<h+1 ; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	private void method2() {
		for (int h=5 ; h>0 ; h-- ) {
			for (int b=1 ; b<6-h ; b++)
				System.out.print(" ");	
			for (int w=0 ; w<h ; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
		
	private void method1() {
		/* 1)       2)       3)       4)
		 * *****    *****          *      *
		 * ****      ****         **     ***
		 * ***        ***        ***    *****
		 * **          **       ****   *******
		 * *            *      *****  *********
		 * 			공백 프린트?
		 */
		for (int h=5; h>0 ; h-- ) {
			for (int w=0 ; w<h ; w++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println("");
	}
}


