package practice;

public class Practice3_3 {
	public static void main(String[] args){
		int isHungry;
		isHungry = new java.util.Random().nextInt(2);
		String food = "apple";
		System.out.println("Hello");
		
		if(isHungry == 0) {
			System.out.println("I'm full");
		} else {
			System.out.println("I'm hungry");
			System.out.println("I eat " + food);
		}
	System.out.println("I'm done");
	}
}
