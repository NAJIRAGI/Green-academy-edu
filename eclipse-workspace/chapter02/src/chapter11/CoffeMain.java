package chapter11;

import java.util.Iterator;
import java.util.TreeSet;

class Coffee implements Comparable<Coffee> {
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void prt() {
		System.out.println(name + " : " + price);
	}
	
	@Override
	public int compareTo(Coffee o) {
		if (this.price < o.getPrice()) {
			return -1;
		} else if (this.price > o.getPrice()) {
			return 1;			
		} else return 0;
	}
	
	public int getPrice() {
		return price;
	}
	
}

public class CoffeMain {

	public static void main(String[] args) {
		TreeSet<Coffee> tree = new TreeSet<>();
		
		tree.add(new Coffee("아메리카노",3600));
		tree.add(new Coffee("푸라푸치노",5300));
		tree.add(new Coffee("라떼",4100));
		tree.add(new Coffee("에소프레소",5400));
		tree.add(new Coffee("마끼야또",3300));
		tree.add(new Coffee("민트초코",4600));
		
		Iterator<Coffee> Itr = tree.iterator();
		while(Itr.hasNext()) {
			Itr.next().prt();
		}
	}

}
