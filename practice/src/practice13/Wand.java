package practice13;

public class Wand {
	private String name;
	private double power;
	
	public void setName(String name) {
		if(name.length() < 3 || name == null) {
			throw new IllegalArgumentException("杖の名前が異常です。");
		}
		this.name = name;
	}
	
	public double getPower() { return this.power; }
	
	public void setPower(double power) {
		if(power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("powerは0.5以上100.0以下です。");
		}
		this.power = power; 
	}
	
}
