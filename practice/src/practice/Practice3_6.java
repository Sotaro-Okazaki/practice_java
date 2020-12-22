package practice;

public class Practice3_6 {
	public static void main(String[] args) {
		System.out.println("Guess a number.");
		int ans;
		ans = new java.util.Random().nextInt(10);
		for ( int i = 0; i < 5; i++) {
			System.out.println("Input a number between 0 and 9.");
			int num;
			num = new java.util.Scanner(System.in).nextInt();
			if ( ans == num ) {
				System.out.println("You're right.");
			} else {
				System.out.println("You're wrong.");
			}	
		}
	System.out.println("End the game.");
	}
}
