package chapter10_test;

public interface Task {
	public void work();
	public void test();

}

abstract class Member implements Task {
	String m_name;
	String m_id;
	String m_pwd;
	int m_position;
	
	Member(String m_name, String m_id, String m_pwd, int m_position) {
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_pwd = m_pwd;
		this.m_position = m_position;
	}
}

class Student extends Member {
	String m_subject;
	
	Student(String m_name, String m_id, String m_pwd, int m_position, String m_subject) {		
		super(m_name, m_id, m_pwd, m_position);
		this.m_subject = m_subject;
	}
	
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}
	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}
}

class Teacher extends Member {
	String m_subject;
	
	Teacher(String m_name, String m_id, String m_pwd, int m_position, String m_subject) {
		super(m_name, m_id, m_pwd, m_position);
		this.m_subject = m_subject;
	}
	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}
	@Override
	public void test() {
		System.out.println("채점을 합니다.");
	}
}