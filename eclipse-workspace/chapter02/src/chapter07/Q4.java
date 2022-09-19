package chapter07;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		book[] name = new book[2];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("책 이름 : ");
			String book = scan.next();
			System.out.print("저자 : ");
			String writer = scan.next();
			name[i] = new book(book,writer);			
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i].name + name[i].writer);
		}
		
		scan.close();
		
	

		
		

	}

}
