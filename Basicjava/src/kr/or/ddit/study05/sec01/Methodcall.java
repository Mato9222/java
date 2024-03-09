package kr.or.ddit.study05.sec01;

public class Methodcall {
	int a = 10;
	static int b =10;
	public static void main(String[] args) {
		Methodcall obj = new Methodcall();
		obj.method1();
		System.out.println(b);
		System.out.println(obj.a);
	}
	
	public void method1() {
		
	}
}
