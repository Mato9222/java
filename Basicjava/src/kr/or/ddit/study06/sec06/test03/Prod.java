package kr.or.ddit.study06.sec06.test03;

public class Prod {
	private static int prodno = 1;
	private int no;
	
	Prod() {
		no = prodno++;
	}
	
	private String name;
	private int price;
	private int qty;
	
	public static int getProdno() {
		return prodno;
	}

	public static void setProdno(int prodno) {
		Prod.prodno = prodno;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Prod [no=" + no + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
}
