package kr.or.ddit.study06.sec06.test04;

import java.util.Scanner;

public class Practic04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Practic04 obj = new Practic04();
			obj.start();
	}	/*
		 * 심화 과제 
		 * 1. 초기배열 5개
		 * 	  5개보다 증가한다면 
		 *    5개 추가
		 * 2. 책 정보  삭제시
		 *    빈공간 앞으로 당겨오기
		 *    ex ) b1 b2 b3 b4
		 *         1. b2 삭제
		 *         2. b1 null b3 b4 null
		 *         3. b1 b3 b4 null null 
		 */
	public void start() {
		Book[] arr = new Book[5];
		while(true) {
			startprint();
			int select = sc.nextInt();
			if(select==1) {
				printbook(arr); 
			} else if(select==2) {
				intsertbook(arr);
			} else if(select==3) {
				updatebook(arr);
			} else if(select==4) {
				deletebook(arr);
			} else if(select==5) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	private void deletebook(Book[] arr) {
		printbook(arr);
		System.out.println("삭제할 책을 선택해주세요 : ");
		int sel = sc.nextInt();
		for (int i = 0; i <arr.length;i++) {
			if(arr[i]==null) {
				continue;
			} else if ( arr[i].getBookno()==sel) {
				arr[i] = null;
			}
		}
	}
	private void updatebook(Book[] arr) {
		printbook(arr);
		System.out.println(" 변경할 책 선택  : ");
		
		Book book = null;
		int sel = sc.nextInt();
		for (Book b : arr) {
			if (b == null) continue;
			if(b.getBookno() == sel) {
				book = b;
			}
		}
		System.out.println("책이름 : ");
		book.setName(sc.next());
		System.out.println("가격    : ");
		book.setPrice(sc.next());
		System.out.println("내용   : ");
		book.setContent(sc.next());
		
	}
	int num=0;
	private Book intsertbook(Book[] arr) {
		Book b = new Book();
		System.out.print("책이름 : ");
		b.setName(sc.next());
		System.out.print("가격    : ");
		b.setPrice(sc.next());
		System.out.print("내용   : ");
		b.setContent(sc.next());
		arr[num++] = b;
		
		return b;
		
	}
	private void printbook(Book[] b) {
		for (Book book : b) {
			if(book==null) {
				continue; 
			}
				System.out.println(book);
		}
	}
	
	
	public void startprint() {
		System.out.println("* 책\r\n" + 
				"* 1. 전체조회\r\n" + 
				"* 2. 신규 책 등록\r\n" + 
				"* 3. 책 정보 변경\r\n" + 
				"* 4. 책 정보  삭제\r\n" + 
				"* 5. 종료");
	}
}
