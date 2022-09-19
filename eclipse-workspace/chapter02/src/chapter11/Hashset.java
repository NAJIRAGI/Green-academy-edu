package chapter11;

import java.util.HashSet;
import java.util.Set;

class Ex03 {
	String name;
	int snum;
	
	public Ex03(String name, int snum) {
		this.name = name;
		this.snum = snum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSnum() {
		return snum;
	}
	
	public void setSnum(int snum) {
		this.snum = snum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex03) {
			Ex03 stu = (Ex03)obj;
			return (stu.getName().equals(this.name)) && (stu.getSnum() == this.getSnum());
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return snum;
	}
}

public class Hashset {
	
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		
//		set.add("유길동");
//		set.add("홍길동");
//		set.add("김길동");
//		set.add("이길동");
//		set.add("박길동");
//		set.add("최길동");
//		set.add("이길동");
//		
//		System.out.println("Set의 길이 : " + set.size());
//		
//		set.remove("박길동");
//		System.out.println("Set의 길이 : " + set.size());
//		
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str);
//		}
		
		Set<Ex03> set = new HashSet<>();
		
		set.add(new Ex03("김길동",13));
		set.add(new Ex03("이길동",22));
		set.add(new Ex03("박길동",12));
		set.add(new Ex03("최길동",15));
		set.add(new Ex03("박길동",12));
		
		System.out.println("Set의 길이 : " + set.size());
		
		set.add(new Ex03("최길동",15));
		System.out.println("Set의 길이 : " + set.size());
		
	}

}
