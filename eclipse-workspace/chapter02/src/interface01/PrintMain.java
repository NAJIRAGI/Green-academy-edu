package interface01;

public class PrintMain {

	public static void main(String[] args) {	
		
		PrintCMYK prtc = new SamsungPrint();		
		prtc.prt();
		prtc.prtc("파랑");
		System.out.println();
		
		Print prt = new LGPrint();
		prt.prt();

	}

}
