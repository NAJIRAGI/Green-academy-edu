package interface01;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver(); // 드라이버 클래스 객체화
		
		Bus bus = new Bus(); // 버스 클래스 객체화 (인터페이스 구현되어 있는 상태)
		Taxi taxi = new Taxi(); // 택시 클래스 객체화 (인터페이스 구현되어 있는 상태)
		
		driver.drive(bus); // 드라이버 클래스의 메서드 drive의 매개변수를 버스 객체를 사용
		driver.drive(taxi); // 드라이버 클래스의 메서드 drive의 매개변수를 버스 객체를 사용
	}

}
