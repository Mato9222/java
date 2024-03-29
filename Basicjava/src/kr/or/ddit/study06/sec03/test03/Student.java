package kr.or.ddit.study06.sec03.test03;

public class Student {
	String nation;
	String group;
	String name;
	int age;
	
	
	
	//오버로딩(매개변수가 다름) 매세드,생성자에 둘다 가능
	public Student(String nation, String group, String name, int age) {
		this.nation = nation;
		this.group = group;
		this.name = name;
		this.age = age;
		System.out.println("파라미터 4개 생성자 호출 ");
	}

	public Student(String group, String name, int age) {
//		this.nation = "한국";
//		this.group = group;
//		this.name = name;
//		this.age = age;
		this("한국",group, name, age); // 여기서 this는 생성자
		System.out.println("파라미터 3개 생성자 호출 ");
	}

	public Student(String name, int age) {
//		this.nation = "한국";
//		this.group = "402호";
//		this.name = name;
//		this.age = age;
		this("402",name,age);
		System.out.println("파라미터 2개 생성자 호출 ");
	}

	@Override
	public String toString() {
		return "Student [nation=" + nation + ", group=" + group + ", name=" + name + ", age=" + age + "]";
	}


}
