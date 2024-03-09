package kr.or.ddit.study06.sec06.test01;

import java.util.Scanner;

public class GetterSetterExam01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GetterSetterExam01 obj = new GetterSetterExam01();
		/* 
		 * 멤버에 
		 * 이름, 나이, 국가, 메일, 필드 만들것 
		/* 
		 * 스캐너 통해 각 데이터입력받기.
		 *
		/* 1. 멤버추가.
		 * 2. 멤버 조회. -> 입력된 멤버 정보 출력.
		 * 3. 종료
		 */
		Member[] arr = new Member[10]; 
		int cnt = 0;
		while(true) {
			System.out.println("1. 멤버추가");
			System.out.println("2. 멤버조회");
			System.out.println("3. 종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				Member m = obj.inputmember();
				arr[cnt++] = m;
			} else if (sel == 2) {
				obj.printMember(arr);
			} else if (sel == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		//obj.inputmember();
		//Member m = obj.inputmember();
	}
	
	public Member inputmember() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
//		if(age<0) { 
//			System.out.println("0보다 작을수 없습니다.");
//			age = sc.nextInt();
//		}
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("메일 : ");
		String mail = sc.next();
		
		Member m =new Member();
		m.setName(name);
		m.setAge(age);
		m.setNation(nation);
		m.setMail(mail);
		
		return m;
		
	}

	public void printMember(Member[] arr ) {
		for (Member member : arr) {
			if(member == null) break;
			System.out.println(member);
		}
	}
}
