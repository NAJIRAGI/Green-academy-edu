package chapter07;

public class Television02 {
	int Channel;
	int Volume;
	boolean Power;
	
	public void prt() { // 메서드 prt
			System.out.println("텔레비젼 채널은 " + Channel + ", " + "볼륨은 " + Volume + ", " + "현재 상태는 " + Power + " 입니다");
			
		}
	int getChannel() {
		return Channel;
	}
	void setChannel(int a) {
		Channel = a;
	}

}
