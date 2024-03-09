package kr.or.ddit.study06.sec01.test03;

public class ClassExample03 {
	public static void main(String[] args) {
		/*
		 * Pen 클래스 
		 * 색깔 , 길이, 이름
		 */
		Pen p1 = new Pen();
		p1.color = "red";
		p1.cm = 10;
		p1.name = "RedPen";
		Pen p2 = new Pen();
		p2.color = "블랙";
		p2.cm = 15;
		p2.name = "보드마카";
		Pen p3 = new Pen();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}