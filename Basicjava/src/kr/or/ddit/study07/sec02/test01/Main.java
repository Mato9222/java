package kr.or.ddit.study07.sec02.test01;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		
		a = c;
		c = (Cat)a;// a가 상위이기때문에 Cat으로 형변환
		
//cat dog는 관계가 없기때문에 아무것도 안된다. c = (Cat)d; 
	}
}
