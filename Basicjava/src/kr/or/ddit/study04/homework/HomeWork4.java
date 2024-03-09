package kr.or.ddit.study04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork4 obj = new HomeWork4();
//		obj.process();
		obj.process2();
		
		
	}

	private void process2() {
		/*
		 * 각 변수에 로또 숫자 6개 넣을것 
		 */
		int a1=0;
		int a2=0;
		int a3=0;
		int a4=0;
		int a5=0;
		int a6=0;
				
		for(int i=0; i<6; i++) {
			int random = new Random().nextInt(45)+1;
			if (i==0) a1 = random;
			if (i==1) a2 = random;
			if (i==2) a3 = random;
			if (i==3) a4 = random;
			if (i==4) a5 = random;
			if (i==5) a6 = random;
			for(int j=0; j<i; j++) {
				if (i==0) {
					if(a1 == random) {
						i--;
						break;
					}
				}
				if (i==1) {
					if(a2 == a1) {
						i--;
						break;
					}
				}
				if (i==2) {
					if(a3 == a2||a3 == a1) {
						i--;
						break;
					}
				}
				if (i==3) {
					if(a4 == a3||a4 == a2||a4 == a1) {
						i--;
						break;
					}
				}
				if (i==4) {
					if(a5 == a4||a5 == a3||a5 == a2||a5 == a1) {
						i--;
						break;
					}
				}
				if (i==5) {
					if(a6 == a5||a6 == a4||a6 == a3||a6 == a2||a6 == a1) {
						i--;
						break;
					}
				}
			}					
		}
		System.out.println(a1+"\t"+a2+"\t"+a3+"\t"+a4+"\t"+a5+"\t"+a6);
		
	}

	private void process() {
		//숫자 맞추기 게임을 완성해보자.
		int random = new Random().nextInt(100);
		
		int dap = random;
		int i = 0;
		
		while(true) {
			System.out.println("정답을 입력하세요: ");
			int num = sc.nextInt();
			if (dap == num) {
				System.out.println("정답입니다.");
				i++;
				break;
			} else if (dap > num) {
				System.out.println("더 큰수 입니다.");
				i++;
//				continue;
			} else {
				System.out.println("작은수 입니다.");
				i++;
//				continue;
			}
		}
		System.out.println(i+"번째 정답입니다.");
		
	}
}
