package kr.or.ddit.study06.sec04.test03;

public class Rectangle {
	public static void main(String[] args) {
		/*
		 * 사각형 넓이를 구하는 메소드 만들어보기
		 * 파라미터 높이, 너비
		 */
		Rectangle a1 = new Rectangle();
		int area = a1.area(10, 10);
		System.out.println(area);
	}
	
	public int area(int height, int width) {
		return height*width;
	}
}
