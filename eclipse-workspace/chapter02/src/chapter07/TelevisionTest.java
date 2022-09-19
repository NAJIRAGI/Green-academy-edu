package chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television test = new Television(); // 클래스 객체화
		
		test.Channel = 7; // Television 클래스의 필드값 변경
		test.Volume = 9; // Television 클래스의 필드값 변경
		test.Power = true; // Television 클래스의 필드값 변경
		
		System.out.println("텔레비젼 채널은 " + test.Channel + ", " + "볼륨은 " + test.Volume + ", " + "현재 상태는 " + test.Power + " 입니다");
	}

}
