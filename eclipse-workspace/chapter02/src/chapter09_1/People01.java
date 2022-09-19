package chapter09_1;

public class People01 {
	public void printinfo() {
		System.out.println("나는 사람 입니다.");
	}
}

class Man01 extends People01{
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("성별은 남자입니다");
	}
}
class Woman01 extends People01{
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("성별은 여자입니다");
	}
}


