package interface01;

public class MyClass {
	RemoCon rc = new TV();
	
	MyClass() {}
	MyClass(RemoCon rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);		
	}
	
	void methodA() {
		RemoCon rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
	}
	void methodB(RemoCon rc) {
		rc.turnOn();
		rc.setVolume(3);
		
	}
}
