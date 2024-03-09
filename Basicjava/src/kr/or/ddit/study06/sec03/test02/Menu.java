package kr.or.ddit.study06.sec03.test02;

public class Menu {
	/*
	 * 가게이름, 가격, 메뉴이름
	 * 을 필드로 선언하고 
	 * 생성자를 통해서 데이터를 넣어 볼것 
	 * 
	 * 생성자 만드는법 
	   	클래스명 (입력할 파라미터 1,2,3,) {
	        this.param1 = param1;
	 */
	String name;
	int price;
	String menu;
	
	public Menu(String name, int price, String menu) {
		super();
		this.name = name;
		this.price = price;
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + ", menu=" + menu + "]";
	}
	
	
	
}
