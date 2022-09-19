package chapter07;

public class TelevisionTest02 {

	public static void main(String[] args) {
		// 서로 다른 객체 불러오기
		Television mytv = new Television(); // 클래스 객체화
		Television yourtv = new Television(); // 클래스 객체화
		
		mytv.Channel = 7; // Television 클래스의 객체 mytv의 필드값 변경
		mytv.Volume = 9; // Television 클래스의 객체 mytv의 필드값 변경
		mytv.Power = true; // Television 클래스의 객체 mytv의 필드값 변경
		
		yourtv.Channel = 9; // Television 클래스의 객체 yourtv의 필드값 변경
		yourtv.Volume = 12; // Television 클래스의 객체 yourtv의 필드값 변경
		yourtv.Power = true; // Television 클래스의 객체 yourtv의 필드값 변경
		
		System.out.println("나의 텔레비젼 채널은 " + mytv.Channel + ", " + "볼륨은 " + mytv.Volume + ", " + "현재 상태는 " + mytv.Power + " 입니다");
		System.out.println("너의 텔레비젼 채널은 " + yourtv.Channel + ", " + "볼륨은 " + yourtv.Volume + ", " + "현재 상태는 " + yourtv.Power + " 입니다");
	}

}
