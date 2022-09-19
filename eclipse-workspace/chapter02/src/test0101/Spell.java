package test0101;

public class Spell {
	public String casting() {
		return "주문을 외운다.";
	}
}

class Fire extends Spell {
	@Override
	public String casting() {
		return "화염 " + super.casting();
	}
}

class Ice extends Spell {
	@Override
	public String casting() {
		return "얼음 " + super.casting();
	}
}

class Light extends Spell {
	@Override
	public String casting() {
		return "빛 " + super.casting();
	}
}