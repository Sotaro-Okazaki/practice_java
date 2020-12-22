package practice9;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String plName, int initHp, int initMp) {
		this.name = plName;
		this.hp = initHp;
		this.mp = initMp;
	}
	
	public Thief(String plName, int initHp) {
		this(plName, initHp, 5);
	}

	public Thief(String plName) {
		this(plName, 40, 5);
	}

}
