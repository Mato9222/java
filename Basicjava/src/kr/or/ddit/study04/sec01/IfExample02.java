package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample02 obj = new IfExample02();
		
		obj.method1();
		
	}
	private void method1() {
		/* 
		 * 수도 요금을 계산하시오.
		 * 사용량 별 단가.
		 * 1-9	 : 200
		 * 10-19 : 250
		 * 20-29 : 350
		 * 30-39 : 500
		 * 그 이상 	 : 750
		 * 
		 * 하수도 사용량 : 톤당150원
		 * 
		 * 수도 요금 = 사용량별 요금  + 물 이용 분담금(3000) + 하수도 요금
		 * ex ) 26톤 사용시 (200*9+250*10+7*350) + (3000) + (26*150)
		 */
		
		int ton = sc.nextInt();
		int price = 3000;
		
		if (ton >= 9) {
			int sudo = 200*ton;
			int hasu = 150*ton;
			price += sudo+hasu;
		} else if (ton >= 19) {
			int sudo = 200*9 + 250*(ton-9);
			int hasu = 150*ton;
			price += sudo+hasu;
		} else if (ton >= 29) {
			int sudo = 200*9 + 250*10 + 350*(ton-19);
			int hasu = 150*ton;
			price += sudo+hasu;
		} else if (ton >= 39) {
			int sudo = 200*9 + 250*10 + 350*10 + 500*(ton-29);
			int hasu = 150*ton;
			price += sudo+hasu;
		} else {
			int sudo = 200*9 + 250*10 + 350*10 + 500*10 + 750*(ton-39);
			int hasu = 150*ton;
			price += sudo+hasu;
		}
		
		System.out.println("사용 요금은 : "+price);
	}
}
