package kr.or.ddit.study13.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample02 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayListExample02 ale = new ArrayListExample02();
		ale.process();
	}

	private void process() {
		/*
		 * n명의 국어 영어 수학 점수를
		 * 리스트을 이용해 선언 및 값을 저장하세요.
		 * 
		 * Student 클래스 만들어서 리스트에 넣을것.
		 */
		/* 
		 * 1. 학생 추가
		 * 2. 학생 조회
		 *     -> 평균, 총점, 석차 조회
		 * 3. 학생 수정
		 * 4. 학생 삭제 
		 */
		ArrayList list = new ArrayList();
		while(true) {
			start();
			int select = sc.nextInt();
			if(select == 1) {
				Student s = insertStudent();
				list.add(s);
			} else if (select == 2) { 
				printstudent(list);
			} else if (select == 3) { 
				updatestudent(list);
			} else if (select == 4) { 
				deletestudent(list);
			} else if (select == 5) { 
				System.out.println("시스템을 종료.");
				break;
			} else { 
				System.out.println("잘못 입력.");
			}
		}
		
	}
	private void deletestudent(ArrayList list) {
		printstudent(list);
		System.out.println("삭제할 학생 번호 선택 : ");
		int index = sc.nextInt();
		Student s = (Student) list.remove(index);
		System.out.println("삭제완료");
		System.out.println(s);
	}

	private void updatestudent(ArrayList list) {
		printstudent(list);
		System.out.println("변경할 학생 선택");
		
		Student s = null;
		for (int i=0; i <= list.size();i++) {
			insertStudent();
		}
		
	}

	private void printstudent(ArrayList list) {
		System.out.println("   이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균 \t");
		for(int i=0; i<list.size();i++) {
			Student s = (Student) list.get(i);
			System.out.println((i+1)+"."+s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMath()+"\t"+s.getSum()+"\t"+s.getAvg());
			
		}
	}

	public Student insertStudent() {
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		return new Student(name, kor, eng, math);
	}


	public void start() { 
		System.out.println( "* 1. 학생 추가\r\n" + 
				"* 2. 학생 조회\r\n" +  
				"* 3. 학생 수정\r\n" + 
				"* 4. 학생 삭제 \r\n" + 
				"* 5. 종료  ");
	}
}
