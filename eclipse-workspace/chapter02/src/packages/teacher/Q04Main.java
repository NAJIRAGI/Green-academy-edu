package packages;

import java.util.Scanner;

public class Q04Main {
	public static Scanner scan = new Scanner(System.in);
	public static Q04Board[] boards = new Q04Board[50];//DB

	public static void main(String[] args) {
		//Q04 °Ô½ÃÆÇ
		Q04Controller a = new Q04Controller();
		a.init();
	}

}
