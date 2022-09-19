package chapter09_1;

public class People02 {
	public void printinfo() {
		System.out.println("나는 사람 입니다.");
	}
}

class Man02 extends People02{
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("성별은 남자입니다");
	}
	public void enlist() {
		System.out.println("내일 입대합니다");
		System.out.println("충성");
	}
}
class Woman02 extends People02{
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("성별은 여자입니다");
	}
	public void working() {
		System.out.println("일을 합니다");
		System.out.println("최선을 다해");
	}
}


