package test0101;

public class OneDay extends Event{
	public myDate date;
	
	public OneDay(String title, myDate date) {
		super(title);
		this.date = date;
	}
	public String toString() {
		return title + ", " + date;
	}
}

class Duration extends Event{
	public myDate begin;
	public myDate end;
	
	public Duration(String title, myDate begin, myDate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	public String toString() {
		return title + ", " + begin + end;
	}
}

class Deadlined extends Event{
public myDate deadline;
	
	public Deadlined(String title, myDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	public String toString() {
		return title + ", " + deadline;
	}	
	
}
