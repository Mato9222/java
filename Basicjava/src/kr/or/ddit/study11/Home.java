package kr.or.ddit.study11;

import java.util.Calendar;
import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Home obj = new Home();
		obj.process();
	}

	private void process() {
		/*
		 * 년 월을 스캐너를 통해 입력 받고 달력을 출력해 볼 것.
		 * 다음달, 이전달
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		Home cal = new Home();
			cal.getprevious(year, month);
		    cal.getnow(year,month);
		    cal.getnext(year, month);
		    
	}
	
	private void getprevious(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("\t\t%d년 %d월\n",year, month-1);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		cal.set(year, month-1, 1);
		cal.add(Calendar.MONTH, -1);
		int start = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t", i);
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
	}
	
	private void getnow(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println("\n");
		System.out.printf("\t\t%d년 %d월\n",year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		cal.set(year, month -1, 1);
		int start = cal.get(Calendar.DAY_OF_WEEK);
	    for (int i = 1; i < start; i++) {
	        System.out.print("\t");
	      }
	    for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
	        System.out.printf("%d\t", i);
	        if(start % 7 == 0) {
	          System.out.println();
	        }
	        start++;
	    }
	}
	
	private void getnext(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println("\n");
		System.out.printf("\t\t%d년 %d월\n",year, month+1);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		cal.set(year, month -1, 1);
		cal.add(Calendar.MONTH, 1);
		int start = cal.get(Calendar.DAY_OF_WEEK);
	    for (int i = 1; i < start; i++) {
	        System.out.print("\t");
	      }
	    for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
	        System.out.printf("%d\t", i);
	        if(start % 7 == 0) {
	          System.out.println();
	        }
	        start++;
	    }
	}
	
}
