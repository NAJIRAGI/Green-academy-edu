package test0101;

public class SpellMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spell[] mana = new Spell[3];
		mana[0] = new Fire();
		mana[1] = new Ice();
		mana[2] = new Light();
		
		for (int i = 0; i < mana.length; i++) {
			System.out.println(mana[i].casting());
		}
		
	}

}
