package kr.or.ddit.study06.sec01.test01;

public class ClassExample {
	public static void main(String[] args) {
		Product Prod1 = new Product();
		Prod1.prodname="컴퓨터";
		Prod1.prodno = 101;
		Product Prod2 = new Product();
		Prod2.prodname="TV";
		Prod2.prodno = 102;
		Product Prod3 = new Product();
		Prod3.prodname="스마트폰";
		Prod3.prodno = 103;
		
		System.out.println(Prod1);
		System.out.println(Prod2);
		System.out.println(Prod3);
	}
}
