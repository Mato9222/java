package kr.or.ddit.study06.sec04.test04;

import java.util.Arrays;

public class MethodCopy {
	public static void main(String[] args) {
		MethodCopy mc = new MethodCopy();
		int arr[] = {1,2,3};
		//배열 원본 2배 증가 시킨후 총합 *2
		int sum = mc.copy(arr);

//		System.out.println(Arrays.toString(arr));
//		System.out.println(sum);
		arr = mc.copy2(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int[] copy2(int[] arr) { //얕은복사라 원본도 바뀐다. 리턴값으로 줄것
		/*
		 * 2배로 증가하기.
		 */
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 2;
		}
		return arr;
	}
	
	public int copy(int[] arr) { //얕은복사라 원본도 바뀐다. 리턴값으로 줄것
		/*
		 * 2배로 증가하기.
		 */
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 2;
			sum += arr[i];
		}
		return sum;
	}
}
