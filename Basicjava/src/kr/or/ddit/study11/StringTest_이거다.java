package kr.or.ddit.study11;

import java.io.File;
import java.util.Scanner;

public class StringTest_이거다 {
	public static void main(String[] args) {
		StringTest_이거다 st = new StringTest_이거다();
//		st.method1();
//		st.method2();
//		st.method3();
//		st.method4();
//		st.method5();
//		st.method6();
//		st.method7();
		st.method8();
	}

	public boolean equalsIgnoreCase(String str1, String str2) { // 따로 만들어본 equalsIgnoreCase 
		str1 = str1.toLowerCase().trim();
		str2 = str2.toLowerCase().trim();
		return str1.equals(str2);
	}
	
	private void method8() { // equalsIgnorecase , 대소문자 equal 비교
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램 종료 하시곘습니까(y/n)");
			String input = sc.next();
			if(input.equalsIgnoreCase("y")) {
				break;
			}
		}
	}

	private void method7() { // startsWith, endsWith파일 이름 검사할때 / 회사명 or 2023 시작프로그램 찾기 / .java 파일 찾기 등등
		String str = "0123456789";
		String start = "";
		if(str.startsWith(start)) {
			System.out.println("'"+start+"'로 시작하는 문자열.");
		} 
		String end = "";
		if(str.endsWith(end)) {
			System.out.println("'"+end+"'로 끝나는 문자열.");
		}
		File src = new File("D:\\D_setting\\A_TeachingMaterial\\01_BasicJava\\workspace\\Basicjava\\src");
		subList(src);
	}
	
	public void subList(File src) {
		for(File f: src.listFiles()) {
			if(f.isDirectory()) {
				subList(f);
			}
			if(f.getName().endsWith(".java")) {
				System.out.println(f);
				System.out.println("자바 파일");
			}
		}
	}
	

	private void method6() { //substring  데이터 빼기 , 시작점, 끝점 
		String str = "0123456789";
		str = str.substring(3,7);
		System.out.println(str);
		
	}

	private void method5() { // replace * 필터링, 단어 한번에 바꿀때 사용. 
		String str = "바보 멍청이 dddd";
		String answer = "";
		String my_string = ""; 
		str = str.replace("바보", "**");
		str = str.replace("멍청이", "***");
		System.out.println(str);
		answer = my_string.replace("a","").replace("e","").replace("i","").replace("o","").replace("u",""); // 이런식으로 여러가지 같이 할수도있다.
		answer = my_string.replaceAll("[aeiou]", ""); // a e i o u 제거 and [] =>정규표현 
		String str2 = "100	100	100	11000	1000\r\n";
		str2 = str2.replace("\t",", ");
		System.out.println(str2);
		
	}

	private void method4() { // split 구분하기. 탭 or 엑셀데이터? 많이 사용 
		String str = "언제 잘릴지 모를 파리 목숨이던 피시방에서 본업 대신 라면 부업으로 인생 역전 스토리를 쓴 대학생이 뒤늦게 화제다.\r\n" + 
				"2년 전 온라인 커뮤니티 루리웹에 올라왔던 사연이 최근 에펨코리아 등 다른 커뮤니티에서 재조명되고 있다.\r\n" + 
				"피시방 아르바이트 자리가 여자는 프리패스고 남자는 학점, 토익, 인·적성 다 빡빡히 체크하던 시절. 복학생 A(남)씨는 2명을 뽑는 학교 근처 피시방 알바에 2명의 여성 지원자와 함께 맨 꼴찌로 붙었다. 누가 봐도 스페어용(대비용)이었다.";
		String str2 = "100	100	100	11000	1000\r\n";
		String str3 = "100, 100, 100, 11000,1000\r\n";
		String[] lines = str3.split(",");
		for(int i=0; i<lines.length;i++) {
			System.out.println((i+1)+"."+lines[i]);
		}
	}

	private void method3() { // trim 중요  앞뒤 공백 없애기
		String str = "	aB   cDe  F\t\r   ";
		System.out.println("---------------");
		System.out.println(str);
		System.out.println("---------------");
		//********
		str = str.trim();
		System.out.println(str);
		
	}

	private void method2() { // toLowerCase , toIpperCase  대소문자 구분을 하지않는 경우, 대소문자로 변경후  중복 확인.
		String str = "aBcDeF";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
	}

	private void method1() { // contains 문자 포함 비교
		String str = "문자열 테스트 입니다.";
		String search = "테스트 ";
		if ( str.contains(search)) {  
			System.out.println("'"+search + "'문구가 포함 되어 있습니다.");
		}
		
	}
}
