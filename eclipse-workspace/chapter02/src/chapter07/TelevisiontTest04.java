package chapter07;

public class TelevisiontTest04 {
	
	public static void main(String[] args) {
		// 서로 다른 객체 불러오기
				Television02 mytv = new Television02(); // 클래스 객체화				
				
				mytv.Channel = 7; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 0 => 7)
				mytv.Volume = 9; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 0 => 9)
				mytv.Power = true; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 false => true)
				mytv.setChannel(11);
				int ch = mytv.getChannel();
				System.out.println("현재 채널은  " + ch + "입니다.");			
				
	}

}
