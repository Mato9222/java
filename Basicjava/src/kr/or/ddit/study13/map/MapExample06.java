package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample06 {
	public static void main(String[] args) {
		MapExample06 obj = new MapExample06();
		obj.process();
	}

	private void process() {
		List<Map<String, Object>> data = dataInput();
		
		System.out.println("차량번호 입력:");
		Scanner sc = new Scanner(System.in);
		String carNumber = sc.next();
		
//		int time = getTime(str2) - getTime(str);
//		String str = (String) data.keySet().get("car");
		
		// 차 번호를 입력 했을때 주차한 시간을 구하기
		int min = getMin(carNumber, data);
		System.out.println(carNumber+" : "+min+"분 주차하였습니다.");
		
		
//		carTime(data);
		// 주차한 시간을 구한 후 요금 정산하기
		int price = getPrice(min);
		System.out.println("주차요금은 : "+price);
		
		
		
	}
	
	private int getPrice(int min) {
		// 180분 이내 5000원
		// 180분 이상일때 10분당 600원
		int price = 0;
		
		if( min < 180) {
			price = 5000;
		} else if (min >= 180 ) {
			price = 5000+(min-180)/10*600;
		}
		
		return price;
	}

	private int getMin(String carNumber, List<Map<String, Object>> data) {
		
		String temp = "";
		int sum = 0;
		
		for (int i=0; i < data.size() ; i++ ) {
			Map<String, Object> map = data.get(i);
			String car = (String )map.get("car");
			if (!car.equals(carNumber)) continue; 
			
			String in = (String) map.get("in");
			if(in.equals("입차")) {
				temp = (String) map.get("time");
			}
			if(in.equals("출차")) {
				String out = (String) map.get("time");
				int time = getTime(out) - getTime(temp);
				sum+=time;
			}
			
			System.out.println(map);
//				getTime((String) data.get(i).get("time"));
		}
		
		return sum;
	}

	public int getTime(String time) {
		String h1 = time.split(":")[0];
		String m1 = time.split(":")[1];
		
		return Integer.parseInt(h1) * 60 + Integer.parseInt(m1);
	}
	
//	private void carTime(List<Map<String, Object>> data) {
//		Scanner sc = new Scanner(System.in);
//		String carNumber = sc.next();
//		
//		if ( carNumber == data.keySet().get("car")) {
//			
//		}
//	}

	public List<Map<String, Object>> dataInput() {
		List<Map<String, Object>> list = new ArrayList();
		Map<String,Object> t1 = new HashMap();
		t1.put("time","05:34");
		t1.put("car","5961");
		t1.put("in", "입차");
		
		Map<String,Object> t2 = new HashMap();
		t2.put("time","06:00");
		t2.put("car","0000");
		t2.put("in", "입차");
		
		Map<String,Object> t3 = new HashMap();
		t3.put("time","06:34");
		t3.put("car","0000");
		t3.put("in", "출차");
		
		Map<String,Object> t4 = new HashMap();
		t4.put("time","07:59");
		t4.put("car","5961");
		t4.put("in", "출차");
		
		Map<String,Object> t5 = new HashMap();
		t5.put("time","07:59");
		t5.put("car","0148");
		t5.put("in", "입차");
		
		Map<String,Object> t6 = new HashMap();
		t6.put("time","18:59");
		t6.put("car","0000");
		t6.put("in", "입차");
		
		Map<String,Object> t7 = new HashMap();
		t7.put("time","19:09");
		t7.put("car","0148");
		t7.put("in", "출차");
		
		Map<String,Object> t8 = new HashMap();
		t8.put("time","22:59");
		t8.put("car","5961");
		t8.put("in", "입차");
		
		Map<String,Object> t9 = new HashMap();
		t9.put("time","23:00");
		t9.put("car","5961");
		t9.put("in", "출차");
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		
		
		return list;
	}
}
