package interface01;

public interface Print {
	public void prt();
}
interface PrintCMYK extends Print {
	public void prtc(String doc);
}

class SamsungPrint implements PrintCMYK {
	@Override
	public void prt() {
		System.out.println("삼성 프린터");
		System.out.println("자바 이론 문서를 인쇄합니다");
	}		
	@Override
	public void prtc(String doc) {	
		System.out.println("삼성 프린터");
		System.out.println("색상을 " + doc + "으로 인쇄합니다.");
	}
	
}

class LGPrint implements Print {
	@Override
	public void prt() {
		System.out.println("LG 프린터");
		System.out.println("자바 이론 문서를 인쇄합니다");
	}
}

