package kr.or.ddit.study13.test02;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank=1;
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = sum/3.0;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	@Override
	public String toString() {
		return "Student [이름 =" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 합계=" + sum + ", 평균="
				+ avg + ", 등수=" + rank + "]";
	}

	
	
}
