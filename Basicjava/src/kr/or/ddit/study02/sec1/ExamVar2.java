package kr.or.ddit.study02.sec1;

public class ExamVar2 {
	public static void main(String[] args) {
		//1년은 365.2422일이다. 이것을 xx일 xx시간 xx분 xx초로 나타내라.
		
		double days = 365.2422;
		int day = (int)days;
		
		double hours = (days - day)*24;
		int hour = (int)hours;
		System.out.println(hour + "시간");

		double min = (hours - hour)*60;
		int min_i = (int)min;
		System.out.println(min_i + "분");
				
		double second = (min - min_i)*60;
		int sec = (int)second;
		System.out.println(sec + "초");
		
	}
}
