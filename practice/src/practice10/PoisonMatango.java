package practice10;

public class PoisonMatango extends Matango {
	int remainOfPoison = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h) ;
		if(remainOfPoison > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			h.hp = h.hp - h.hp / 5;
			System.out.println(h.hp / 5 + "ポイントのダメージ！");
			this.remainOfPoison--;
		}
	}

}
	

