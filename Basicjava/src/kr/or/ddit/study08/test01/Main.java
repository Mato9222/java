package kr.or.ddit.study08.test01;

import java.util.Scanner;

public class Main { //추상클래스와 하는 방식은 동일하다. 서로 통신한다. 여러개 동시 상속받을수있다. 협업할때는 인터페이스를 하면 장점이 있다.
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
