package kr.or.ddit.study06.sec02.test01;

public class FieldVarExample {
	static int a = 10;
	int b = 11;
	int c = 12;
	public static void main(String[] args) {
		System.out.println(a);
		FieldVarExample obj = new FieldVarExample();
		System.out.println(obj.b);
		obj.method1();
	}
	
	public static void method2 () {
		System.out.println(a);
		//객체가 생성되지 않아  부를수없다System.out.println(b);
	}
	public void method1() {
		System.out.println(b);
		System.out.println(a);
	}
}
