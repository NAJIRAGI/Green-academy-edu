package test;

public class TV {
	private int size;
	
//	public TV () {
//		
//	}
	public TV (int n) {
		size = n;
	}
}

class ColorTV extends TV {
	private int colors;
	
	public ColorTV (int colors, int size) {
		super(size); // super = 부모 타입의 생성자 ( super = TV )
		this.colors = colors;
		
	}
}