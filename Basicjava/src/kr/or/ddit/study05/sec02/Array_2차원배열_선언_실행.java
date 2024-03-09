package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class Array_2차원배열_선언_실행 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Array_2차원배열_선언_실행 obj = new Array_2차원배열_선언_실행();
//		obj.method1();
		obj.method2();
	
	}

	private void method2() { // 2차원 배열 출력 방법
		int [][] arr = new int [3][3];
		
		/*
		 * 1. 원하는 값  하나 가져오기
		 */
		int a = arr[0][2];
	
		/*
		 * 2. 1차원 배열 가져오기;
		 */
		int [] ar = arr[0];
		
		/*
		 * for 문을 통해 전체 값 가져오기.
		 */
		for(int i=0; i<arr.length; i++) {
			int[] ar2 = arr[i];
			for(int j =0; j < arr[i].length;j++) {
//				int b = arr[i][j];
				int b = ar2[j];
			}
		}
		
	}

	private void method1() {  // 2차원 배열 선언 종류
		/* 
		 * 2차원 배열 선언 방법
		 */
		
		/*
		 * 1. new int [1차원 배열의 숫자][1차원 배열의 길이]
		 */
		int arr1[][] = new int [5][5];
		
		/*
		 * 2. new int [1차원 배열의 숫자][1차원 배열의 길이]
		 */
		int[][] arr2; 
		arr2= new int[5][5];
		
		/*
		 * 3. {{},{},{}}
		 */
		int[][] arr3 = {{1,2}, {1,2},{1,2}};
		
		/*
		 * 4. new int[3][];
		 */
		int[][] arr4 = new int [3][];
		arr4[0] = new int [] {1,2,3};
		arr4[0] = new int [] {1,2};
		arr4[0] = new int [] {1};
		
	}
}
