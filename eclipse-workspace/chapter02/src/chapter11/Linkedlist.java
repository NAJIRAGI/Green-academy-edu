package chapter11;


import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("고길동");
		list.add("김길동");
		list.add("홍길동");
		list.add("박길동");
		list.add("홍길동");
		System.out.println("리스트의 길이 : " + list.size());
		System.out.println("------------------------------");
		String name = list.get(3);
		System.out.println("4번째(index number = 3) 객체 이름 : " + name);
		System.out.println("------------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 이름 : " + list.get(i));
		}
		
		System.out.println("리스트의 길이 : " + list.size());
		System.out.println("------------------------------");
		System.out.println("4번째(index number = 3) 객체에 이길동을 추가");
		list.add(3,"이길동");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 이름 : " + list.get(i));
		}
		System.out.println("리스트의 길이 : " + list.size());
		System.out.println("------------------------------");
		System.out.println("2번째(index number = 1) 객체의 김길동을 삭제");
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 이름 : " + list.get(i));
		}
		System.out.println("리스트의 길이 : " + list.size());
		System.out.println("------------------------------");
		System.out.println("리스트 클리어");
		list.clear();		
	}

}