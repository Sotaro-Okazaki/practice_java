package practice8;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = Cleric.MAX_HP;
	}

	public int pray(int sec) {
		int gainHp;
		int correctionValue;
		correctionValue = new java.util.Random().nextInt(3);
		gainHp = sec * correctionValue;
		this.mp += gainHp;
		return gainHp;
	}
	
}
