package kr.or.ddit.study10.sec02;

import java.util.Scanner;

/*
 *  throw : 예외 강제 발생
 *  		- 일반 메소드, 내부에서 사용.
 *  		- 사용형식
 *    		  throw 예외클래스 객체명
 *    		  	  IoException ie = new IoException();
 *    		   ex throw new Excetion();
 *    			  throw ie;	
 *    
 *    throws : 예외 미루기
 *    			thy ~ catch 블록을 예외발생 가능성이 있는 명령문이 기술된 곳에서 처리하지않고,
 *     			해당 메서드를 호출하는 곳에서 예외처리를 강요할때 사용 
 *     
 *     			메소드명() throws 예외클래스명  { 
 *     
 *     			}
 *     			위 메소드를 호출하는 명령 문은 try catch나 throws로 처리 하여야 함.
 */				  
public class ExceptionExample05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample05 obj = new ExceptionExample05();
		obj.process();
		
	}

	private void process() {
		while (true) {
			try {
				int num = inputDate();
				System.out.println("점수는 : "+num);
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력: ");
			}
		}
	}
	
	public int inputDate() throws NumberFormatException {
		System.out.println("점수를 입력 하세요.");
		int num = Integer.parseInt(sc.next());
		return num;
	}
}
