package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample05 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MapExample05 obj = new MapExample05();
		obj.process();
	}

	private void process() {
		List<Map<String,Object>> data = dataInput();
		
//		int max =0;
		
		//a. 전체 출력 메소드 만들어 보기.
		printmember(data);
		
		//b. 월급 제일 많은 사람 정보 출력 해보기.
		// 포문 전체출력 후 월급 비교 max값 구하기.
		int max = maxsalary(data);
		
		//c. 입력된 부서 salaly 총합 구해보기.
		int sum = sumsalary(data);
		
		//d. 입력된 emp_no 정보 전체 출력해보기.
		// ex) 101 입력하면 홍성범 출력
		selectprint(data);
		
	}


	private int sumsalary(List<Map<String, Object>> data) {
		System.out.println("부서를 입력해주세요.");
						
		int sum=0;
		String select = sc.next();
		for (int i = 0 ; i<data.size(); i++) {
			Map<String, Object> m = data.get(i);
			String dept = (String) m.get("dept");
			if(dept.equals(select)) {
				sum += (int)m.get("salary");
			}
		}
		System.out.println(sum);
		
		return sum;
	}

	private void selectprint(List<Map<String, Object>> data) {
		System.out.println("조회할 emp_no를 입력하세요. ");
		int select = sc.nextInt();
		for(int i=0; i<data.size();i++) { 
			Map m1 = data.get(i);
			int emp = (int)m1.get("emp_no");
			if(emp == select) {
				System.out.println(data.get(i));
				
				Iterator it = m1.keySet().iterator();
				while(it.hasNext()) {
					String key = (String) it.next();
					System.out.print(m1.get(key)+"\t");
				}
			}
		}
	}
	
	private void printmember(List<Map<String, Object>> data) {
//		String key = (String)m.next();
//		System.out.println(key);
		System.out.println("dept\t이름 \t폰번호 \t\t부서 \t월급");
		for (int i = 0 ; i<data.size(); i++) {
			Map map = data.get(i);
			Iterator m = map.keySet().iterator();
			while(m.hasNext()) {
				String key = (String) m.next();
				System.out.print(map.get(key)+"\t");
			}
			System.out.println();
		}
	}

	private int maxsalary(List<Map<String, Object>> data) {
		int max=0;
		for (int i = 0 ; i<data.size(); i++) {
			Map m = data.get(i);
			if((int)m.get("salary") > max) {
				max = (int)m.get("salary");
			}
		}
		System.out.println(max);
		return max;
	}

	public List<Map<String, Object>> dataInput() {
		
		List<Map<String, Object>> list = new ArrayList();
		Map<String, Object> m1 = new HashMap();
		m1.put("emp_no",100);
		m1.put("emp_name","장승수");
		m1.put("dept","영업부");
		m1.put("tel","8422-8117");
		m1.put("salary", 300);
				
		Map<String, Object> m2 = new HashMap();
		m2.put("emp_no",101);
		m2.put("emp_name","홍성범");
		m2.put("dept","기획부");
		m2.put("tel","7562-3217");
		m2.put("salary", 350);
		
		Map<String, Object> m3 = new HashMap();
		m3.put("emp_no",102);
		m3.put("emp_name","이만수");
		m3.put("dept","기획부");
		m3.put("tel","5562-6677");
		m3.put("salary", 500);
		
		Map<String, Object> m4 = new HashMap();
		m4.put("emp_no",103);
		m4.put("emp_name","강나미");
		m4.put("dept","영업부");
		m4.put("tel","4442-5614");
		m4.put("salary", 350);
		
		Map<String, Object> m5 = new HashMap();
		m5.put("emp_no",109);
		m5.put("emp_name","민병철");
		m5.put("dept","총무부");
		m5.put("tel","2542-8211");
		m5.put("salary", 250);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		
		return list;
	}
	
}
