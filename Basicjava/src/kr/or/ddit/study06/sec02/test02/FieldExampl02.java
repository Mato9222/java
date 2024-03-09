package kr.or.ddit.study06.sec02.test02;

public class FieldExampl02 {
	public static void main(String[] args) {
		/* 
		 * Computer 객체 생성
		 * name = "컴퓨터"
		 * cpu, ram, hdd
		 */
		Computer com1 = new Computer();
		com1.cpu = "E13400";
		com1.ram = "16Gb";
		Computer com2 = new Computer();
		com2.cpu = "i7";
		com2.hdd = "큰거";
		com2.ram = "32gb";
		Computer com3 = new Computer();
		com3.ram = "16Gb";
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}
}
