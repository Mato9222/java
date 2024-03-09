package kr.or.ddit.study06.Homework;

public class Tv {
	
	String compa="LG";
	int cre = 2311;
	int inch = 32;
	
	public Tv(String compa, int cre, int inch) {
		
		this.compa = compa;
		this.cre = cre;
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [제조사=" + compa + ", 생산년도 =" + cre + ", 크기=" + inch + " inch]";
	}
	
	
}
