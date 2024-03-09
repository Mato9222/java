package kr.or.ddit.study07.sec03.test02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R: RoundRobin");
		System.out.println("L: LeastJob");
		System.out.println("P: PriorityAllocation");
		
		Scanner sc = new Scanner(System.in);
		String select = sc.next();
		Schedular schedular = null;
		if( select.contentEquals("R")) {
			schedular = new RoundRobin();
		}
		if( select.contentEquals("L")) {
			schedular = new LeastJob();
		}
		if( select.contentEquals("P")) {
			schedular = new PriorityAllocation();
		}
		schedular.getNextCall();
		schedular.sendCallToAgent();
		
	}
}
