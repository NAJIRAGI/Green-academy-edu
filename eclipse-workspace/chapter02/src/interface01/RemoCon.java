package interface01;

public interface RemoCon {
	// 상수
	int MAX_VOLUME = 10; // 최대값 설정 (아무리 커져도 10이상 안됨)
	int MIN_VOLUME = 0; // 최소값 설정 (아무리 작아져도 0이하로 안됨)
	
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
