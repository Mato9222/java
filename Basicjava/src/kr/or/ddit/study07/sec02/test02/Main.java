package kr.or.ddit.study07.sec02.test02;

public class Main {
	public static void main(String[] args) {
		FolderPhone fp = new FolderPhone();
		System.out.println("폴더폰-------------------");
		fp.camera();
		fp.tell();
		fp.fold();
		fp.internet();
		System.out.println("스마트폰------------------");
		SmartPhone sp = new SmartPhone();
		sp.touch();
		sp.tell();
		sp.camera();
		sp.internet();
	}	
	
}
