package kr.or.ddit.study06.sec04.test05;

public class MethodRecursion {
	public static void main(String[] args) {
		MethodRecursion mr = new MethodRecursion();
		int result1 = mr.pow(10);
		int result2 = mr.sum(10);
		int result3 = mr.pebonachi(100001);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
	public int pow(int t) {
		//1번째 종료 조건.
		if(t==0) {
		 return 1;
		}
		//2번째 반복 조건
		return 2*pow(t-1);
	}
	public int sum (int t) {
		if(t==0) {
			return 0;
		}
		return t+sum(t-1);
	}
	public int pebonachi(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return pebonachi(n-1)+pebonachi(n-2);
	}
}
