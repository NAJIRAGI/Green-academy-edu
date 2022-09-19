package chapter07;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double Average() {
		double sum = math + science + english;
		double avg = (sum / 3);
		return avg;
	}
}
