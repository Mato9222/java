package kr.or.ddit.study06.Homework;

public class Student {
		String	학과;
		int 	학번;
		
		public Student(String 학과, int 학번) {
			this.학과 = 학과;
			this.학번 = 학번;
		}

		@Override
		public String toString() {
			return "Student [학과=" + 학과 + ", 학번=" + 학번 + "]";
		}
		
}
