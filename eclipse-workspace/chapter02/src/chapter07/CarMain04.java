package chapter07;

public class CarMain04 {

	public static void main(String[] args) {
		Car04 car1 = new Car04();
		System.out.println("제조사 : " + car1.company);
		System.out.println();
		
		Car04 car2 = new Car04("싼타페");
		System.out.println("제조사 : " + car2.company);
		System.out.println("모델 : " + car2.Model);
		System.out.println();
		
		Car04 car3 = new Car04("아반떼","gold");
		System.out.println("제조사 : " + car3.company);
		System.out.println("모델 : " + car3.Model);
		System.out.println("색상 : " + car3.color);
		System.out.println();
		
		Car04 car4 = new Car04("제네시스","white",3000);
		System.out.println("제조사 : " + car4.company);
		System.out.println("모델 : " + car4.Model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고 속력 : " + car4.maxSpeed);

		

	}

}
