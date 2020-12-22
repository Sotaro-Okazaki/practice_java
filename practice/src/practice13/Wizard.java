package practice13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}
	this.hp = hp;
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("MPは0以上です。");
		}
	this.mp = mp;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が異常です。");
		}
	this.name = name;
	}
	
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖がnullです。");
		}
	this.wand = wand;
	}
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

}
