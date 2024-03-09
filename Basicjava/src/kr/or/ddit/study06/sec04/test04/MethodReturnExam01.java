package kr.or.ddit.study06.sec04.test04;

public class MethodReturnExam01 {
	public static void main(String[] args) {
		MethodReturnExam01 m = new MethodReturnExam01();
//		m.printTest();
		/*
		 * 1을 입력하면 출력1
		 * 3을 입력하면 출력1,2,3
		 */
//		m.printTest2(3);
		int re = m.addNum(10);
		
		System.out.println(re);
	}
	public int addNum(int n) {
		/* 
		 * 1~n까지 값을 더하다가
		 * 100보다 커지면 현재까지 더해진값을 리턴해보기.
		 * 만약에 100보다 커지지 않으면 n까지 전체합을 리턴
		 */
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
			if (sum >= 100) {
			}
		}
		return sum;
		
	}
	
	private void printTest2(int num) {
		System.out.println("출력1");
		if (num==1) return;
		System.out.println("출력2");
		if (num==2) return;
		System.out.println("출력3");
		if (num==3) return;
		System.out.println("출력4");
		if (num==3) return;
	}

	public void printTest() { 
		System.out.println("출력1");
		if (false) return;
		System.out.println("출력2");
	}
}
