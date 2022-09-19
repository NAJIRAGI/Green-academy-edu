package test0101;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer run = new Racer();
		Car[] car = new Car[2];
		car[0] = new Maserati();
		car[1] = new Ferrari();
		
		for (int i = 0; i < car.length; i++) {
			run.drive(car[i]);
		}
		

	}

}
