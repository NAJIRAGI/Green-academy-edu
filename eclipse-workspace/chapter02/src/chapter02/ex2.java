package chapter02;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 6;

		System.out.println(a * b);
		System.out.println(a * b / 2);

		System.out.println("--------------------");
		int c = 40;
		int d = 30;
		int e = 10;
		int f = (c + d + e);
		System.out.println(f / 3);

		System.out.println("--------------------");
		int g = 100;
		int g2 = g*12;
		double g3 = g2 *(0.8);
		System.out.println(g3);

		System.out.println("--------------------");
		int h = 286;
		int minute = (h / 60);
		double sec = (h % 60);
		System.out.println(minute + "분 " + sec + "초");

		System.out.println("--------------------");
		int x = 10;
		int y = 5;
		boolean result;

		result = (x > 7) && (y <= 5);
		System.out.println(result);
		System.out.println(x);
		System.out.println(y);

		result = (x % 3 == 0) || (y % 2 != 1);
		System.out.println(result);
		System.out.println(x);
		System.out.println(y);

		System.out.println("--------------------");
		int i = 543;
		System.out.println(i / 30);
		System.out.println(i % 30);

		System.out.println("--------------------");
		int j = 356;
		System.out.println(j / 100 * 100);

		System.out.println("--------------------");
		int k = 176840;
		int k1 = (k / 50000);
		int k2 = ((k % 50000)/10000);
		int k3 = ((k % 10000)/5000);
		int k4 = ((k % 5000)/1000);
		int k5 = ((k % 1000)/500);
		int k6 = ((k % 500)/100);
		int k7 = ((k % 100)/50);
		int k8 = ((k % 50)/10);
		System.out.println("오만"+k1);
		System.out.println("만"+k2);
		System.out.println("오천"+k3);
		System.out.println("천"+k4);
		System.out.println("오백"+k5);
		System.out.println("백"+k6);
		System.out.println("오십"+k7);
		System.out.println("십"+k8);
	}

}
