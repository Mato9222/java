package kr.or.ddit.study05.homework;

import java.util.Scanner;

public class HomeWork6 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork6 obj = new HomeWork6();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}


	private void method1() {
		/*
		 *  원하는 구구단을 입력하고 출력해보기.
		 *  ex ) 2 -> 2단 출력
		 */
		System.out.println("원하는 구구단을 입력하세요.");
		int dan = sc.nextInt();
		
		for (int i = 1 ; i <= 9 ; i++ ) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
	
	private void method2() {
		/*
		 *  구구단을 다음과 같이 출력해보기.
		 *  2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9	
			2 * 2 = 4	3 * 2 = 6	4 * 2 = 8	5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16	9 * 2 = 18	
			2 * 3 = 6	3 * 3 = 9	4 * 3 = 12	5 * 3 = 15	6 * 3 = 18	7 * 3 = 21	8 * 3 = 24	9 * 3 = 27	
			2 * 4 = 8	3 * 4 = 12	4 * 4 = 16	5 * 4 = 20	6 * 4 = 24	7 * 4 = 28	8 * 4 = 32	9 * 4 = 36	
			2 * 5 = 10	3 * 5 = 15	4 * 5 = 20	5 * 5 = 25	6 * 5 = 30	7 * 5 = 35	8 * 5 = 40	9 * 5 = 45	
			2 * 6 = 12	3 * 6 = 18	4 * 6 = 24	5 * 6 = 30	6 * 6 = 36	7 * 6 = 42	8 * 6 = 48	9 * 6 = 54	
			2 * 7 = 14	3 * 7 = 21	4 * 7 = 28	5 * 7 = 35	6 * 7 = 42	7 * 7 = 49	8 * 7 = 56	9 * 7 = 63	
			2 * 8 = 16	3 * 8 = 24	4 * 8 = 32	5 * 8 = 40	6 * 8 = 48	7 * 8 = 56	8 * 8 = 64	9 * 8 = 72	
			2 * 9 = 18	3 * 9 = 27	4 * 9 = 36	5 * 9 = 45	6 * 9 = 54	7 * 9 = 63	8 * 9 = 72	9 * 9 = 81	
		 */
		for (int i = 1 ; i<=9 ; i++) {
			for (int j = 2; j<=9;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println("");
		}
	}
	
	private void method3() {
		/*
		 *  구구단 중 입력한 숫자를 제외하고 출력 
		 *  다음과  같이 출력해보기.
		 *  ex) 4 -> 
		 *  2 * 1 = 2	3 * 1 = 3		5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9	
			2 * 2 = 4	3 * 2 = 6		5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16	9 * 2 = 18	
			2 * 3 = 6	3 * 3 = 9		5 * 3 = 15	6 * 3 = 18	7 * 3 = 21	8 * 3 = 24	9 * 3 = 27	
			2 * 4 = 8	3 * 4 = 12		5 * 4 = 20	6 * 4 = 24	7 * 4 = 28	8 * 4 = 32	9 * 4 = 36	
			2 * 5 = 10	3 * 5 = 15		5 * 5 = 25	6 * 5 = 30	7 * 5 = 35	8 * 5 = 40	9 * 5 = 45	
			2 * 6 = 12	3 * 6 = 18		5 * 6 = 30	6 * 6 = 36	7 * 6 = 42	8 * 6 = 48	9 * 6 = 54	
			2 * 7 = 14	3 * 7 = 21		5 * 7 = 35	6 * 7 = 42	7 * 7 = 49	8 * 7 = 56	9 * 7 = 63	
			2 * 8 = 16	3 * 8 = 24		5 * 8 = 40	6 * 8 = 48	7 * 8 = 56	8 * 8 = 64	9 * 8 = 72	
			2 * 9 = 18	3 * 9 = 27		5 * 9 = 45	6 * 9 = 54	7 * 9 = 63	8 * 9 = 72	9 * 9 = 81	
		 */

		System.out.println("빠질 단을 입력하세요.");
		int dan = sc.nextInt();
		
		for (int i = 1 ; i<=9 ; i++) {
			for (int j = 2; j<=9;j++) {
				if (j == dan) {
					continue;
				}
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println("");
		}
	
	}
}
