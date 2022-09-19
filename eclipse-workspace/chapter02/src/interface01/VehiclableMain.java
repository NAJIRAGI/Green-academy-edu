package interface01;

public class VehiclableMain {

	public static void main(String[] args) {
		Drivers driver = new Drivers();
		Bus01 bus = new Bus01();
		Taxi01 taxi = new Taxi01();
		
		bus.setSpeed(-50); // BUS 클래스의 setSpeed 매개변수 값을 음수로 설정
		bus.setSpeed(80); // BUS 클래스의 setSpeed 매개변수 값을 80으로 설정
		driver.drive(bus); // Drivers 클래스의 drive 메서드의 매개변수를 Bus로 설정
						   // 메서드 매개변수.run(); 실행
		driver.stop(bus);  // Drivers 클래스의 stop 메서드의 매개변수를 Bus로 설정
						   // 메서드 매개변수.stop(); 실행
		
		System.out.println();
		
		driver.drive(new Taxi01()); // Drivers 클래스의 매개변수 값을 객체로 지정
									// 매개변수값이 재지정되면 설정된 값은 다시 초기화된다.
									// 따라서 setSpeed 구문의 값은 0
		driver.drive(new Bus01());
		
		System.out.println();
		
		// Drivers 클래스의 newCarMethod 메서드의 매개변수값을 객체값으로 지정하고
		// 해당 메서드 구문에 의해(매개변수가 Taxi클래스로 변환가능하면 Taxi를 리턴) Taxi를 타는 것으로 출력
		Vehiclable vehiclable = driver.newCarMethod(new Taxi01());
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();

		// Drivers 클래스의 newCarMethod 메서드의 매개변수값을 객체값으로 지정하고
		// 해당 메서드 구문에 의해(매개변수가 Bus클래스로 변환가능하면 Bus를 리턴) Bus를 타는 것으로 출력
		vehiclable = driver.newCarMethod(new Bus01());
		vehiclable.run();
		vehiclable.stop();
		

	}

}
