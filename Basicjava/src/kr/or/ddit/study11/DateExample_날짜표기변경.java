package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample_날짜표기변경 {
	boolean debug = false; // 보고싶은 메세지만 ture 아니면 false
	public static void main(String[] args) {
		DateExample_날짜표기변경 de = new DateExample_날짜표기변경();
//		de.dateMethod1();
//		de.dateMethod2();
//		de.dateMethod3();
//		de.dateMethod4();
//		de.dateMethod5();
		de.dateMethod6();
//		de.dateMethod7();
	}

	private void dateMethod7() {
		
		
	}

	private void dateMethod6() {
		Calendar cal = Calendar.getInstance(); //getInstance - 싱글톤 많이쓰임.
		//기준값을 셋으로 변경
		cal.set(Calendar.YEAR, 1990); // 1990년도로 변경
		cal.set(Calendar.MONTH, 11);  // 11월로 변경
		cal.set(Calendar.MONTH, 1);	  
		cal.set(Calendar.MONTH, 2);
		
		//add = 기준값에서 +값 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
				cal.add(Calendar.DATE, 1);
		cal.add(Calendar.YEAR, 2);
		cal.add(Calendar.HOUR, 1);
		cal.add(Calendar.MINUTE, -30);
		
		Date date = cal.getTime();
		System.out.println(date);
		
	}

	private void dateMethod5() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		// 1주일 뒤 날짜 구해보기.
		Date date = new Date();
		long time = date.getTime()+(long)86400*1000*207;
		
		
		Date add = new Date (time);
		String date_t = sdf.format(add); 
		System.out.println(date_t);
		
		//2023.12.01 <- 출력 되도록 해볼것.
		
	}

	private void dateMethod4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		Date date = new Date();
		System.out.println(date); //이렇게 보면 보기 힘들기 때문에 
		String date_Str = sdf.format(date);
		System.out.println(date_Str); // SimpleDateFormat에서 내가 원하는 출력방법으로 출력
		
	}

	private void dateMethod3() {
		String dateStr = "2023/11/23 09:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		
		try {
			Date date = sdf.parse(dateStr);
			
			Date cur = new Date ();
			long time = cur.getTime() - date.getTime();
			int min = (int)(time/1000/60);
			System.out.println(min+"분 지각입니다.");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void dateMethod2() {
		String dateStr = "2023/11/23";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			// 어제 시간
			Date yesterDay = sdf.parse(dateStr);
			
			//현재시간 
			Date date = new Date();
			System.out.println(yesterDay);
			//1일 10시간 30분 15초 형태로 나타내 볼것.
			long time = (date.getTime() - yesterDay.getTime())/1000;
			int day = 60*60*24;
//			System.out.println(day);
			int days = (int)(time/day);
			time = time%day;
			System.out.print(days+"일, ");
			
			int hour = 60*60;
			int hours = (int)(time/hour);
			time = time%hour;
			System.out.print(hours+"시간, ");
			
			int min = 60;
			int mins = (int)(time/min);
			time = time%min;
			System.out.print(mins+"분, ");
			System.out.print(time+"초");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void dateMethod1() {
		if(debug)System.out.println("dataMethod1");
		
		Date d1 = new Date();
		System.out.println("현재시간");
		System.out.println(d1);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		System.out.println(d2);
		//1979년부터 현재까지 진행된 시간
		System.out.println(d2.getTime());
		System.out.println(d1.getTime());
		
		long time = d2.getTime() - d1.getTime();
		
		System.out.println(time+"ms");
	}
}
