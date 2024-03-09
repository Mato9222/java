package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample07_깊은복사_얕은복사 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample07_깊은복사_얕은복사 obj = new ArrayExample07_깊은복사_얕은복사();
//		obj.shallow();
		/*
		 * deepCopy : 깊은 복사
		 * 배열 공간이 별도로 확보(메모리에 신규 할당)되고 내용이 복사되는 방식.
		 * colne, System.arraycopy(), for 문을 이용.
		 */
//		obj.deepCopy01();
//		obj.deepCopy02();
		obj.deepCopy03();
		
	}

	private void deepCopy03() {
		String[] source = {"a1","a2","a3"};
		String[] target = new String[3];
		// 원본배열명, 복사해줄 위치, 복사배열명, 복사받을 위치, 개수
		// 여러 배열을 복사 붙여넣기 할수있다.
		System.arraycopy(source, 0, target, 0, source.length);
		target[0] = "bl";
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("source : "+Arrays.toString(target));
		
		
	}

	private void deepCopy02() {
		String[] source = {"a1","a2","a3"};
		String[] target = source.clone();
		// Object class의 clone 사용.
		// 배열 갯수가 맞춰서 해야함.
		target[0] = "bl";
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("source : "+Arrays.toString(target));
		
	}

	private void deepCopy01() {
		String[] source = {"a1","a2","a3"};
		String[] target = new String[source.length];
		// for 문을 이용한 방법.
		// for 를 쓰지않고  target[0] = source[0] 로 넣는다면 bl,null,null 나옴
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		target[0] = "bl";
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("source : "+Arrays.toString(target));
	}

	private void shallow() {
		//shallow copy = 얕은 복사
		//배열명이 가지고 있는 배열의 주소 값만 복사
		//부작용 발생 메서드의 매개변수 전달 방식이 이 복사 방법임.
		String[] source = {"a1","a2","a3"};
		String[] target = source;
		
		target[0] = "b1";
		System.out.println(source[0]);
		System.out.println(target[0]);
		
		
	}
}
