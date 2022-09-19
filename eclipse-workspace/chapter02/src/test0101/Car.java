package test0101;

public class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}

}

class Ferrari extends Car {
	@Override
	public void run() {
		System.out.println("페라리가 달린다");
	}
}

class Maserati extends Car {
	@Override
	public void run() {
		System.out.println("마세라티가 달린다");
	}
}

class Racer {
	public void drive(Car car) {
		car.run();
	}
}