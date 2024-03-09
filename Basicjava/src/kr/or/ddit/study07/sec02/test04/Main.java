package kr.or.ddit.study07.sec02.test04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* 상품 클래스
		 * Prod 
		 * 이름, 가격
		 * 
		 * 전자제품
		 * ElectroniProd 
		 * 이름, 가격, 전압, 전력 소비량
		 * 
		 * FoodProd 
		 * 이름, 가격, 유통기한
		 */
		Prod prod = null;
//		Prod prod = new Prod();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 전자제품");
		System.out.println("2. 음식");
		
		int select = sc.nextInt();
		if (select == 1) {
			System.out.println("전자제품");
			ElectroniProd ep = new ElectroniProd();
			ep.setName("이름");
			ep.setPrice(100000);
			ep.setSobi(15);
			ep.setV(220);
			ep.getName();
			System.out.println(ep);
		}
		if (select == 2) {
			System.out.println("음식");
			prod = new FoodProd();
			prod.setName("이름");
			prod.setPrice(10000);
			System.out.println(prod);
		}
	}
}