package chapter04;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("언어를 입력 하세요");
		String lang = a.next();
		
		switch(lang) {
		case "Python" : 
			System.out.println("파이썬 언어");
			break;
		case "JAVA" : 
			System.out.println("자바 언어");
			break;
		case "C#" :
			System.out.println("C# 언어");
			break;
		case "C++" :
			System.out.println("C++ 언어");
			break;
		default : 
			System.out.println("기타 언어");
		}
		a.close();
	}

}
