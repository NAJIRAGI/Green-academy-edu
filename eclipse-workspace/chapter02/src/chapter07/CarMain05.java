package chapter07;

public class CarMain05 {

	public static void main(String[] args) {
		Car05 car1 = new Car05();
		System.out.println("제조사 : " + car1.company);
		System.out.println("모델 : " + car1.Model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고 속력 : " + car1.maxSpeed);
		System.out.println();
		
		Car05 car2 = new Car05("싼타페");
		System.out.println("제조사 : " + car2.company);
		System.out.println("모델 : " + car2.Model);
		System.out.println("색상 : " + car2.color);
		System.out.println("최고 속력 : " + car2.maxSpeed);
		System.out.println();
		
		Car05 car3 = new Car05("아반떼","gold");
		System.out.println("제조사 : " + car3.company);
		System.out.println("모델 : " + car3.Model);
		System.out.println("색상 : " + car3.color);
		System.out.println("최고 속력 : " + car3.maxSpeed);
		System.out.println();
		
		Car05 car4 = new Car05("제네시스","white",3000);
		System.out.println("제조사 : " + car4.company);
		System.out.println("모델 : " + car4.Model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고 속력 : " + car4.maxSpeed);

		

	}

}
