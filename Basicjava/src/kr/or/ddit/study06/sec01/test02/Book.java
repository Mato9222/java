package kr.or.ddit.study06.sec01.test02;

public class Book {
	int price = 0;
	String name;
	String writer;
	@Override
	public String toString() {
		return "책 : [price=" + price + ", name=" + name + ", writer=" + writer + "]";
	}
	
}