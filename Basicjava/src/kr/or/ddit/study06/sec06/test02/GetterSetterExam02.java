package kr.or.ddit.study06.sec06.test02;

import java.util.Scanner;

public class GetterSetterExam02 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			GetterSetterExam02 obj = new GetterSetterExam02();
		/*
		 * 1. 전화번호 추가
		 * 2. 전화번호 전체 조회
		 * 3. 전화번호 수정
		 * 4. 전화번호 삭제
		 * 5. 종료
		 */
		Phone[] arr = new Phone[10];
		int cnt=0;
		while(true) {
			System.out.println("1. 전화번호 추가 ");
			System.out.println("2. 전화번호 조회");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 전화번호 삭제");
			System.out.println("5. 종료");
			int num = sc.nextInt();
			if(num == 1) {
				//PhoneAdd
				Phone p = obj.PhoneAdd();
				arr[cnt++] = p;
			} else if (num == 2) {
			 	obj.printPhone(arr);
			} else if (num == 3) {
				obj.updatePhone(arr);
			} else if (num == 4) {
				obj.deletePhone(arr);
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셧습니다.");
			}
		}
	}
	private void updatePhone(Phone[] arr) {
		printPhone(arr);
		System.out.println("수정할 번호 선택 : ");
		int select = sc.nextInt()-1;
		Phone p = arr[select];
		// 입력출력.
		System.out.println("핸드폰번호 : ");
		p.setPhoneNum(sc.nextInt());
		//하나씩 와일문 if문 
		System.out.println("이름 : ");
		p.setName(sc.next());
		System.out.println("그룹 : ");
		p.setGroup(sc.next());
		System.out.println("단축키 : ");
		p.setKey(sc.nextInt());
		
	}
	private Phone PhoneAdd() {
		Phone p = new Phone();
		
		System.out.println("핸드폰번호 : ");
//		int PhoneNum = sc.nextInt();
		p.setPhoneNum(sc.nextInt());
		System.out.println("이름 : ");
		p.setName(sc.next());
		System.out.println("그룹 : ");
		p.setGroup(sc.next());
		System.out.println("단축키 : ");
		p.setKey(sc.nextInt());
		
		return p;
	}
	
	private void printPhone (Phone[] arr) {

		int num = 1;
		for( Phone phone : arr) {
			if(phone == null) break;
				System.out.println(num+". "+phone);
//				System.out.println(num+". "p.getNumer()+p.getName()+);
				num++;
			}
	}
	
	public void deletePhone (Phone[] arr) {
		
		 int select = sc.nextInt() -1;
		 arr[select] = null;
		 System.out.println();
	 
	 
//		
//		for (int i=0 ; i<arr.length ; i++) {
//			Phone p = arr[i];
//			if(p==null)
//			continue;
//			System.out.printf("%d. 번호 : %d 이름 :%s\n",i,p.PhoneNum, p.name);
//		}
//		System.out.println("삭제할 번호를 입력해주세요.");
//		int select = sc.nextInt();
//		Phone p = arr[select];
//		p.PhoneNum = 0;
//		p.name = null;
//		p.group = null;
//		p.key = 0;
//		
//		arr[select] = null;
	}
	
}
