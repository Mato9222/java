package kr.or.ddit.study06.sec06.test04;

public class Book {
	private static int no = 1;
	private int bookno;
	private String name;
	private String price;
	private String Content;
	
	Book() {
		bookno = no++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
	@Override
	public String toString() {
		return "Book [no=" + bookno + ", name=" + name + ", price=" + price + ", Content=" + Content + "]";
	}
	
}
