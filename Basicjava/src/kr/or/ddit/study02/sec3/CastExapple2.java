package kr.or.ddit.study02.sec3;

public class CastExapple2 {
	public static void main(String[] args) {
		/*
		 * 문자형 String 객체
		 * -> 기본형 (byte, short ,int ,long, float, 
		 *         double, char, boolean)
		 *         
		 *         앞글자 대문자로 
		 *         
		 * 기존 타입 Wrapper 클래스
		 * byte -> Byte 
		 * 
		 * int -> Integer
		 * char -> Character
		 * 
		 */
		
//		String val = "16";
//		
//		// Wrapper 클래스.parse 기본타입 이름(값);
//		int i1 = Integer.parseInt(val)+3;
//		System.out.println(i1);
//		
//		String s = val+3;
//		System.out.println(s);
//		
//		String val2 = "16.12313";
//		
//		double d1 = Double.parseDouble(val2);
//		System.out.println(d1);
		
		/*
		 * 기본 타입 변수 선언하고 문자 값 넣어서 변환해볼것.
		 */
		
		byte b1 = Byte.parseByte("13");
		System.out.println(b1);
		
		float f1 = Float.parseFloat("13");
		System.out.println(f1);
		
		short s1 = Short.parseShort("13");
		System.out.println(s1);
		
		int i1 = Integer.parseInt("13");
		long l1 = Long.parseLong("13");
		double d1 = Double.parseDouble("13");
		System.out.println(i1+","+l1+","+d1);
//		char c1 = Character.DIRECTIONALITY_PARAGRAPH_SEPARATOR
//		boolean
		
		
	}

	
}
