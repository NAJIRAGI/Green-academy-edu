package interface01;

public class TV implements RemoCon {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("tv의 전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("tv의 전원을 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoCon.MAX_VOLUME) {
			this.volume = RemoCon.MAX_VOLUME;
		} else if (volume < RemoCon.MIN_VOLUME) {
			this.volume = RemoCon.MIN_VOLUME;
		} else this.volume = volume;
		System.out.println("현재 tv의 볼륨은 " + this.volume + "입니다.");
	}

}
