package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample08 obj = new ArrayExample08();
		obj.method1();
	}

	private void method1() {
		Student s1 = new Student();
		s1.name= "미연";
		s1.kor = 72;
		s1.eng = 70;
		s1.math = 81;
		s1.sum = s1.eng+s1.kor+s1.math;
		s1.avg = s1.sum/3.0;
		s1.rank = 1;
		
		Student s2 = new Student();
		s2.name= "민니";
		s2.kor = 85;
		s2.eng = 92;
		s2.math = 72;
		s2.sum = s2.eng+s2.kor+s2.math;
		s2.avg = s2.sum/3.0;
		s2.rank = 1;

		Student s3 = new Student();
		s3.name= "소연";
		s3.kor = 69;
		s3.eng = 82;
		s3.math = 79;
		s3.sum = s3.eng+s3.kor+s3.math;
		s3.avg = s3.sum/3.0;
		s3.rank = 1;

		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

//		for(int i=0; i<students.length; i++) {
//			Student s= students[i];
//			System.out.println(s.name+" 수학 : "+s.math);
//		}
//		for(int i=0; i<students.length; i++) {
//			Student s= students[i];
//			System.out.println(s.name+" 평균 : "+s.avg);
//		}
		for( Student students1 : students) {
			for (Student studnet2 : students) {
				if ( students1.sum < studnet2.sum) {
					students1.rank++;
				}
			}
		}
		
		for (int i=0; i<students.length-1 ; i++) {
			for (int j = 0; j<students.length-1;j++ ) {
				if (students[j].rank > students[j+1].rank) {
					Student s = students[j];
					students[j] = students[j+1];
					students[j+1] = s;
				}
			}
		}
		for (Student student : students) {
			System.out.println(student);
		}

	}
}

class Student {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
}