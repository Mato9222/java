package kr.or.ddit.study06.sec05.test01;

public class SingleTon_싱글톤_기본생성 {
	//싱글톤 객체를 저장하기 위한 곳  
	private static SingleTon_싱글톤_기본생성 singleTon = null;
	
	//기본 생성자를 만들어 외부에 접근을 금지함.
	private SingleTon_싱글톤_기본생성( ) {}
	
	//외부에서 객체 생성을 위해서는 반드시 getInstance를 통해서 가져가야함.
	public static SingleTon_싱글톤_기본생성 getInstance() {
		
		// singleton 객체가 생성 안됐을 경우
		if (singleTon == null) {
			//싱글톤 객체를 새로 만들다.
			singleTon = new SingleTon_싱글톤_기본생성();
		}
		//singleton 객체를 리턴한다.
		return singleTon;
		
	}
}
