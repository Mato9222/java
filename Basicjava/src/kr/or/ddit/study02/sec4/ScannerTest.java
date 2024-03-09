package kr.or.ddit.study02.sec4;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ScannerTest obj = new ScannerTest();		
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		System.out.println("메소드1입니다.");
		System.out.print("입력받을 문자를 입력해주세요 : ");
		String s = sc.nextLine();
		System.out.println("입력받은 문자 값입니다."+s);
	}
	
	private void method2() {

		System.out.println("메소드2입니다.");
		/*줄바꿈 기능 없음.
		 * System.out.print();
		 */
		System.out.print("홍길동");
		System.out.print("대전");
		System.out.print("중구");
		System.out.println();
		/*줄바꿈 기능.
		 * System.out.println();
		 */
		System.out.println("홍길동");
		System.out.println("대전");
		System.out.println("중구");
		/*
		 *  형식지정 문자열
		 *  %[[-|0]n]d : 10진 정수
		 *  - : 왼쪽 정렬
		 *  0 : 남은 왼쪽 빈공간에 0 채움
		 *	System.out.printf();
		 */
		System.out.printf("나이 : %d\n",20);
		System.out.printf("나이 : %8d\n",20);
		System.out.printf("나이 : %-8d\n",20);
		System.out.printf("나이 : %08d\n",20);
		/*
		 *  형식지정 문자열
		 *  %[[-|0]n]pf : 실수
		 *  n : 전체 자리수
		 *  p : 소수점이하의 자리수
		 *	System.out.printf();
		 */
		System.out.printf("키 : %8.2f\n",177.8);
		System.out.printf("키 : %-8.2f\n",177.8);
		System.out.printf("키 : %08.2f\n",177.8);
		/*
		 *  형식지정 문자열
		 *  %[[-|0]n]s : 문자열
		 */ 
		System.out.printf("이름 : %s \n","양형운");
		System.out.printf("이름 : %-8s \n","양형운");
		System.out.printf("이름 : %8s \n","양형운");
		
	}

	private void method3() {
		/* 
		 * 이름 나이 키 입력 받아서 출력해보기.
		 */
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		int k = sc.nextInt();
		
		System.out.println("이름 : "+name+"\t나이 : "+age+"\t 키 : "+k);
		System.out.printf("이름 : %s\t 나이 : %d\t 키 : %d",name, age, k);
	
	}
	
	private void method4() {
		/*
		 * 국어, 영어, 수학 점수 입력 받고
		 * 각 점수 출력후 총점, 평균 출력.
		 */
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		double ave = (double)sum/3;
		
		System.out.println("국어 : "+kor+" 영어 : "+eng+" 수학 : "+mat);
		System.out.printf("시험 합계 : %d, 평균 : %.2f ",sum,ave);
		
	}
	
}
