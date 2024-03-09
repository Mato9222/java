package kr.or.ddit.study06.Homework;

import java.util.Scanner;

public class GradecClass {
		
	int kor;
	int meth;
	int eng;
	int sum=0;
	double avg = 0;

	public GradecClass(int kor, int meth, int eng) {
		this.kor = kor;
		this.meth = meth;
		this.eng = eng;
		this.sum = kor+meth+eng;
		this.avg = sum/3.0;
		
	}

	@Override
	public String toString() {
		return "GradecClass [국어= " + kor + ", 수학= " + meth + ", 영어= " + eng + "총점= " + sum + "평균= "+avg+"]";
	}
	
}
