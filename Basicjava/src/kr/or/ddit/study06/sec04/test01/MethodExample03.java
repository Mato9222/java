package kr.or.ddit.study06.sec04.test01;

public class MethodExample03 {
	public static void main(String[] args) {
		MethodExample03 obj = new MethodExample03();
		int add = obj.add(10, 3);
		System.out.println("add 받은 리턴 값 : "+add );
		//뺴기, 나누기, 곱하기 해보기
		int m = obj.m(10,3);
		System.out.println("m 받은 리턴 값 : "+m);
		double n = obj.n(10,3);
		System.out.println("m 받은 리턴 값 : "+n);
		int k = obj.k(10,3);
		System.out.println("m 받은 리턴 값 : "+k);
	}
	public int add(int a, int b) {
		return a+b;
	}
	public int m(int a, int b) {
		return a-b;
	}
	public int n(int x, int y) {
		return x/y;
	}
	public int k(int x, int y) {
		return x*y;
	}
}
	