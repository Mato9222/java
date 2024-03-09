package kr.or.ddit.study06.sec06.test03;

import java.util.Scanner;

import oracle.net.aso.p;

public class Practic01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Practic01 p = new Practic01();
		
		p.start();
		
	}
	
	public void start() {
		Prod[] arr = new Prod[10];
		while(true) {
			print();
			int select = sc.nextInt();
			if (select == 1) {
				PrintProd(arr);
			} else if ( select == 2) {
				insertProd(arr); //add
			} else if (select == 3) {
				updateProd(arr);
			} else if (select == 4) {
				deleteProd(arr);
			} else if (select == 5) {
				System.out.println("종료");
				break;
			} else { 
				System.out.println("잘못 입력");
			}
			
		}
	}
	
	private void deleteProd(Prod[] arr) {
		PrintProd(arr);
		System.out.println("삭제");
		int no = sc.nextInt();
		for (int i = 0 ; i< arr.length;i++) {
			if(arr[i] == null) continue;
			if(arr[i].getNo() == no) {
				arr[i] = null;
			}
		}
	}

	int num = 1;
	private void insertProd(Prod[] arr) {
		Prod prod = new Prod();
		System.out.println("상품명을 입력하세요.");
		prod.setName(sc.next());
		System.out.println("상품가격을 입력하세요.");
		prod.setPrice(sc.nextInt());
		System.out.println("상품갯수를 입력하세요.");
		prod.setQty(sc.nextInt());
		arr[num++] = prod;
		
	}

	private void updateProd(Prod[] arr) {
		//상품 전체 출력
		PrintProd(arr);
		System.out.println("상품번호 선택");
		
		//업데이트 될 상품 정보
		Prod sel = null;
		int no = sc.nextInt();
		for(Prod p : arr) {
			if(p==null) continue;
			if (p.getNo() == no) {
				sel = p;
			}
		}
		System.out.println("상품명을 입력하세요.");
		sel.setName(sc.next());
		System.out.println("상품가격을 입력하세요.");
		sel.setPrice(sc.nextInt());
		System.out.println("상품갯수를 입력하세요.");
		sel.setQty(sc.nextInt());
		
	}
	private Prod addProd(Prod[] arr) {
		Prod p = new Prod();
		
		System.out.println("상품명을 입력하세요.");
		p.setName(sc.next());
		System.out.println("상품가격을 입력하세요.");
		p.setPrice(sc.nextInt());
		System.out.println("상품갯수를 입력하세요.");
		p.setQty(sc.nextInt());
		
		return p;
		
	}
	private void print() {
		System.out.println(" 1. 상품 조회.\r\n" + 
				" 2. 상품 신규 등록\r\n" + 
				" 3. 상품 정보 변경\r\n" + 
				" 4. 상품 삭제\n" +
				" 5. 종료");
		
	}
	private void PrintProd(Prod[] arr) {
		for (Prod prod : arr) {
			if(prod == null) continue;
			System.out.println(prod);
//		for(int i=0 ; i < arr.length ; i++) {
//			System.out.println(". 상품명 : "+prod.getName());
		
		}
		
	}
}
