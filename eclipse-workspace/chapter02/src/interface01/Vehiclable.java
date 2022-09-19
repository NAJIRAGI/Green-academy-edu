package interface01;

public interface Vehiclable {
	public void run();
	public void stop();
	public void setSpeed(int speed); // 여기서 값을 받게되면 변경불가(상수)

}

class Bus01 implements Vehiclable {
	private int speed; // 인터페이스는 상수만 필드값에 사용 가능하므로
					   // 구현되는 클래스에서 변수로 설정하여 값을 인터페이스의 필드로 전달한다.
	@Override
	public void run() {
		System.out.println("버스가" + this.speed + "Km로 달립니다");
	}
	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
	@Override
	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("속도는 0이하로 떨어지지 않습니다.");
			return;
		}
		this.speed = speed;
	}
}

class Taxi01 implements Vehiclable {
	private int speed;
	@Override
	public void run() {
		System.out.println("택시가" + this.speed + "Km로 달립니다");
	}
	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}
	@Override
	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("속도는 0이하로 떨어지지 않습니다.");
			return;
		}
		this.speed = speed;
	}
}

class Drivers {
	public void drive(Vehiclable vehiclable) {
		vehiclable.run();
	}
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}
	public Vehiclable newCarMethod(Vehiclable vehiclable) {
		if (vehiclable instanceof Taxi01) {
			Taxi01 taxi = (Taxi01)vehiclable;
			return taxi;
		} else if (vehiclable instanceof Bus01) {
			Bus01 bus = (Bus01)vehiclable;
			return bus;
		}
		return null;
	}
}