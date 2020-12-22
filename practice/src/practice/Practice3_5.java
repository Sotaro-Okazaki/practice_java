package practice;

public class Practice3_5 {
	public static void main(String[] args) {
		System.out.println("[Menu] 1:Search 2:Register 3:Delete 4:Change");
		int selected;
		selected = new java.util.Scanner(System.in).nextInt();
		
		switch(selected) {
			case 1:
				System.out.println("Searching...");
				break;
				
			case 2:
				System.out.println("Registering...");
				break;
				
			case 3:
				System.out.println("Deleting...");
				break;
				
			case 4:
				System.out.println("Changing...");
				break;
				
			default:
				System.out.println("Choose between 1 and 4.");
		}
	
	}

}
