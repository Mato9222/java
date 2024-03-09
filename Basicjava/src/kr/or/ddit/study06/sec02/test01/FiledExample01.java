package kr.or.ddit.study06.sec02.test01;

public class FiledExample01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "황지훙";
		s1.age = 20;
		Student s2 = new Student();
		s2.name = "정성윤";
		s2.age = 20;
		
		System.out.println(s1);
		System.out.println(s2);
	}	
}
