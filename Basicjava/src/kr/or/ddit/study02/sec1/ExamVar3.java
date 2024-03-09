package kr.or.ddit.study02.sec1;

public class ExamVar3 {
	
	int a = 10;
	
	public static void main(String[] args) {
		ExamVar3 ev = new ExamVar3();
		
		System.out.println("main 메소드에서 부른 a값" +ev.a);
		
		int b = 7;
		System.out.println("main 메소드에서 부른 b값" +b);
		
		ev.test();
	}
	
	public void test() {
		int b = 5;
		System.out.println("test 메소드에서 부른 b값" +b);
		System.out.println("test 메소드에서 부른 a값"+a);
		int c = 10;
		if (true) {
			int d = 3;
			System.out.println("if 메소드에서 부른 a값"+a);
			System.out.println("if 메소드에서 부른 d값"+d);
			System.out.println("if 메소드에서 부른 c값"+c);
			
		}
		System.out.println("test 메소드에서 부른 c값" +c);
	}
}
