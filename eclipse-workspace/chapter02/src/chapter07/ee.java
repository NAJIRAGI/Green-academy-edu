package chapter07;

public class ee {

	public static void main(String[] args) {
		
		ee [] car = new ee[8];
		
		System.out.println(car[0]);
		
		for(int i = 0; i < car.length; i++) {
			car[i] = new ee();
		}
		
		System.out.println(car[0]);
	}

}
