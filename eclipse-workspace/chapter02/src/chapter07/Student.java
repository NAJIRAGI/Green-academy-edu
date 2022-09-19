package chapter07;

public class Student {	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
	
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	double getAverage() {
		double avg = getTotal() / 3.0;
		return avg;
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + no);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAverage());
	}

}
