package chapter11;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		
		System.out.println("첫번째 이름 : " + set.first());
		System.out.println("마지막 이름 : " + set.last());
		System.out.println("E 아래 : " + set.lower("E"));
		System.out.println("E 위 : " + set.higher("E"));
		System.out.println("C or 위  : " + set.ceiling("C"));
		System.out.println("C or 아래  : " + set.floor("C"));
//		System.out.println("H or 위  : " + set.ceiling("H"));
//		System.out.println("H or 아래  : " + set.floor("H"));

	}

}
