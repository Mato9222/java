package kr.or.ddit.study06.sec05.test01;

public class BigLoadSingleTon {
	private static BigLoadSingleTon instance = null;
	public static long sum = 0;
	
	public BigLoadSingleTon() {
		
		for(long i= 1; i<100000;i++) {
			sum +=i;
		}
		
	}
	
	public static BigLoadSingleTon getInstance() { 
		
		if(instance == null) {
			instance = new BigLoadSingleTon() ;
			
		}
		
		return instance;
	}
}
