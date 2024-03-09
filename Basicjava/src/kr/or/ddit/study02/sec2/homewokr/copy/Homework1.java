package kr.or.ddit.study02.sec2.homewokr.copy;

import java.util.Date;

public class Homework1 {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime()/1000;
		/* 
		 * date 란 객체는 1970년 기준 시간으로 부터 지난 시간을 가져옵니다.
		 * 오늘 날짜는 1970년 기준  시간을 기준으로 현재
		 * 
		 * 몇년 몇월 몇일이... 몇초가 지났는지 출력해보세요.
		 */
		System.out.println(time);
//		int day = 60*60*24;
//		System.out.println(day);
		
		int min = 60;		//60
		int hour = min*60;	//3,600
		int day = hour*24;	//86,400
		int year = day*365;	//31,536,000
//		int years = (int)(time/60/60/24/365);
		
		int years = (int)time/year;
		System.out.println(years+"년");
				
		int days = (int)(time/(years*year))/day;
		System.out.println((int)days+"일");
				
		int hours = (int)(time-(years*year)-(days*day))/hour;
		System.out.println(hours+"시");
		
		int mins = (int)(time-(years*year)-(days*day)-(hours*hour))/min;
		System.out.println(mins+"분");
		
		int sec = (int)(time-(years*year)-(days*day)-(hours*hour)-(mins*min));
		System.out.println(sec+"초");
		
		
//		yaers = time/year*years;
//				
	}
}
