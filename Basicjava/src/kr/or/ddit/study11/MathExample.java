package kr.or.ddit.study11;

public class MathExample {
	public static void main(String[] args) {
		double ran = Math.random();
		System.out.println(ran);
		
		int abs = Math.abs(-100);
		System.out.println(abs);
		
		int a = 30;
		int b = 10;
		
		int max = Math.max(a, b);
		System.out.println("최대값: " +max);
		
		int min = Math.min(a, b);
		System.out.println("최소값 : " +min);
		
		double pow = Math.pow(2, 4);
		System.out.println(pow);
		
		double log10 = Math.log10(100);
		System.out.println(log10);
		
		double sqrt = Math.sqrt(2);
		System.out.println(sqrt);
		
		double data = 12.5154654;
		double round = Math.round(data);
		MathExample me = new MathExample();
		double result = me.round(data,2);
		System.out.println(result);
		
		//자연 상수
		double E = Math.E;
		// 3.14~
		double PI = Math.PI;
		
	}
	
	public double round(double data, int num) {
		int temp = 1;
		for (int i=0; i<num;i++) {
			temp *= 10;
		}
		return (double)Math.round(data*temp)/temp;
	}
}
