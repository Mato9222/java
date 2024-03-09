package kr.or.ddit.study06.Homework;

import java.util.Scanner;

import org.w3c.dom.css.Rect;

public class Homework8 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Homework8 obj = new Homework8();
		/*문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
		· String형의 학과와 정수형의 학번을 필드로 선언
		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에
		 적당한 값을 입력 후 출력

		문제 2 – main 메서드에서 실행시켰을 때 제조사, 생산년도, 크기를 출력하는 Tv클래스를 생성하시오.

		문제 3 – 세 과목의 성적을 입력 받고 총점과 합을 출력할 수 있는 Grade class를 설계하시오.

		문제 4 – 정수형 원점의 좌표(x,y)와 실수 타입의 가로와 세로를 입력받아 사각형을 만드는 클래스를
	 	설계하고, 3개의 사각형을 만든 뒤 첫 번째 사각형에 나머지 두 개의 사각형이 포함되었는지
		 여부를 판단할 수 있는 메서드를 포함시키시오.*/
		
	//		Student s1 = new Student("컴퓨터공학과",901125);
	//		System.out.println(s1);
	//
	//		Tv t1 = new Tv("LG", 2311, 32);
	//		System.out.println(t1);
	//		Tv t2 = new Tv("삼성", 2310,24);
	//		System.out.println(t2);
			
	//		System.out.println("국어, 수학, 영어 점수를 입력해주세요.");
	//		int kor = sc.nextInt();
	//		int meth = sc.nextInt();
	//		int eng = sc.nextInt();
	//		GradecClass g1 = new GradecClass(kor, meth, eng);
	//		System.out.println(g1);
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int w1 = sc.nextInt();
			int h1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int w2 = sc.nextInt();
			int h2 = sc.nextInt();
			
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int w3 = sc.nextInt();
			int h3 = sc.nextInt();
			
			Rectangle r1 = new Rectangle(x1,y1,w1,h1);
			Rectangle r2 = new Rectangle(x2,y2,w2,h2);
			Rectangle r3 = new Rectangle(x3,y3,w3,h3);
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
	}
}