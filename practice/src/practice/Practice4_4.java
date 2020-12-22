package practice;

public class Practice4_4 {
	public static void main (String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("Input a number with one digit.");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for ( int i = 0; i < 3; i++) {
			if (input == numbers[i]) {
				System.out.println("You're right.");
			}
		}
	}
}