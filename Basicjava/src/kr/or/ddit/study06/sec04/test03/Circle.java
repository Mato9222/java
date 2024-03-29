package kr.or.ddit.study06.sec04.test03;

public class Circle {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		Circle c1 = new Circle();
		double round = c1.round(10);
		System.out.println(round);
		double area = c1.round(10);
		System.out.println(area);
		
	}
	//원의 둘레 구하는 메소드 작성.
	//2*PI*반지름
	public double round(int r) {
		return 2*Math.PI*r;
	}

	//원의 넓이 구하는 메소드 작성.
	//PI*반지름*반지름
	public double area(int r) { 
		return Math.PI*r*r;
	}
}
