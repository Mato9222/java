package kr.or.ddit.study06.sec06.test01;

import java.util.Scanner;

public class Member {
		private String	name;
		private int 	age;
		private String 	nation;
		private String	mail;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age<0) { 
				System.out.println("0보다 작을수 없습니다.");
				Scanner sc = new Scanner(System.in);
				age = sc.nextInt();
			}else if (age > 100 ) {
				System.out.println("100보다 큰 수는 입력할 수 없습니다.");
				Scanner sc = new Scanner(System.in);
				age = sc.nextInt();
			}
		this.age = age;
		}

		public String getNation() {
			return nation;
		}

		public void setNation(String nation) {
			this.nation = nation;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + ", nation=" + nation + ", mail=" + mail + "]";
		}
}
