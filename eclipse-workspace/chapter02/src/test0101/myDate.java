package test0101;

public class myDate {
	int year;
	int month;
	int day;
	
	public myDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString () {
		return year + "/" + month + "/" + day + " "; 
	}
}
