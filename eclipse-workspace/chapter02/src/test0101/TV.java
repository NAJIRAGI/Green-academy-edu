package test0101;

class ColorTV extends TV {
	int size;
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	void prt() {
		System.out.println("출력결과 : " + this.getSize() + "인치" + color + "컬러");
	}
}


public class TV {
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV myTV = new ColorTV(32, 1024);		
		myTV.prt();
	}

}
