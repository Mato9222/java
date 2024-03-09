package kr.or.ddit.study07.sec02.test02;

public class SmartPhone extends Phone {

	
	public void touch() {
		System.out.println("터치 기능 ");
	}
	
	@Override // 재정의 
	public void camera() {
		//super.camera(); // 부모 클래스의 내용을 가져오겟다 
		System.out.println("1000만 화소 사진 기능");
	}

}
