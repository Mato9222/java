package kr.or.ddit.study06.sec03.test01;

public class Book {
	int price;
	String name;
	String writer;
	
	Book() {
		
	}
	
	Book(int price, String name, String writer){
		this.price = price;
		this.name = name;
		this.writer = writer;
		}

	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + ", writer=" + writer + "]";
	}

}
