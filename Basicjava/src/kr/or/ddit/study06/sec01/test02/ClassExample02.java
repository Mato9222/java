package kr.or.ddit.study06.sec01.test02;

public class ClassExample02 {
	public static void main(String[] args) {
		/*
		 * Book 이라는 클래스 만들고
		 * Book 이라는 필드 값에
		 * 각각 가격, 이름, 저자 생성
		 */
		Book b1 = new Book();
		b1.name = "황금종이";
		b1.writer = "조정래";
		b1.price = 16650;
		Book b2 = new Book();
		Book b3 = new Book();
		
		System.out.println(b1);
	}
}
