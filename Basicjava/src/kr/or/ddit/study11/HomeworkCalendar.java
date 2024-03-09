package kr.or.ddit.study11;

import java.util.Calendar;
import java.util.Scanner;

public class HomeworkCalendar {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeworkCalendar obj = new HomeworkCalendar();
		obj.process();
	}

	private void process() {
		/* 
		 * 년 월을 스캐너를 통해 입력 받고 달력을 출력해 볼것.
		 * 다음달 , 이전달 
		 */
		
		Calendar cal = Calendar.getInstance();
		
		System.out.print("년도 : ");
		int year = sc.nextInt(); // 년도 받기
		System.out.print("월 : ");
		int month = sc.nextInt(); // 월 받기
		
		startcal(year,month);
		
//		System.out.println(dayOfMonth); // 이번달 마지막 날 30
//		int day = cal.get(Calendar.DAY_OF_WEEK); // 오늘 요일 숫자 표현 6
//		System.out.println(day); 
//		System.out.println(Calendar.DAY_OF_WEEK); // 일주일 숫자 표현 7
//		int mon = cal.get(Calendar.DAY_OF_MONTH); // 오늘 날짜  24
//		System.out.println(mon); 
//		int years = cal.get(Calendar.WEEK_OF_MONTH); //이번달 주 4 
//		System.out.println(years);
//		int mons = 1+cal.get(Calendar.MONTH);//현재 10+1 월달
//		System.out.println("ㅇ"+mons); 
//		System.out.println(cal.DAY_OF_WEEK_IN_MONTH); // 8
//		System.out.println(cal.WEEK_OF_YEAR); // 3
//		System.out.println(cal.SATURDAY); 
//		int y = cal.get(cal.YEAR);
//		System.out.println(y); // 2023
//		System.out.println(cal.DATE); // 5
//		System.out.println(cal.getActualMaximum(cal.DATE));
		
	}
	
	private void startcal(int year, int month) {

		
		Calendar cal = Calendar.getInstance();
		while(true) {
			
			cal.set(year,month-1,1);
			int dayOfMonth = cal.getActualMaximum(Calendar.DATE);
												//DATE ? DAY_OF_MONTH ? 		
			int y = cal.get(cal.YEAR);
			int m = 1+cal.get(cal.MONTH);
//		
			int start = cal.get(Calendar.DAY_OF_WEEK);
			
			System.out.println();
			System.out.println("<이전달 \t\t"+y+"년 "+m+"월 \t\t다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for( int j = 1 ; j < start; j++) {
				System.out.print("\t");
			}
			
			for ( int i = 1 ; i <= dayOfMonth; i++ ) { // 이번달 말일까지
				System.out.print(i+"\t"); // 마지막 날까지 출력 
				if (start % 7 == 0 ) { // 
				System.out.println();
				}
				start++; 
//				if(i!=dayOfMonth)cal.add(Calendar.DATE, 1);
			}
			String i = sc.next();
			if ( i.equals(">") ) { // > 입력하면 다음달 표시 
				month++;
			} else if ( i.equals("<")) {
				month--;
			}
//			if(i.equals(">")) cal.add(Calendar.MONTH, -1);
//			if(i.equals("<")) cal.add(Calendar.MONTH, 1);
		}
	}

	
}
