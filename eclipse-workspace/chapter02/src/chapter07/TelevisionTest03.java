package chapter07;

public class TelevisionTest03 {

	public static void main(String[] args) {
		// 서로 다른 객체 불러오기
				Television02 mytv = new Television02(); // 클래스 객체화
				Television02 yourtv = new Television02(); // 클래스 객체화
				
				mytv.Channel = 7; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 0 => 7)
				mytv.Volume = 9; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 0 => 9)
				mytv.Power = true; // Television 클래스의 객체 mytv의 필드값 변경 (초기값 false => true)
				
				mytv.prt(); // mytv 변수의 내용을 prt 메서드 안의 변수에 적용하여 출력하라
								
				
				yourtv.Channel = 9; // Television 클래스의 객체 yourtv의 필드값 변경 (초기값 0 => 9)
				yourtv.Volume = 12; // Television 클래스의 객체 yourtv의 필드값 변경 (초기값 0 => 12)
				yourtv.Power = true; // Television 클래스의 객체 yourtv의 필드값 변경	(초기값 false => true)	
				
				yourtv.prt(); // yourtv 변수의 내용을 prt 메서드 안의 변수에 적용하여 출력하라
				
			
				
	}

}
