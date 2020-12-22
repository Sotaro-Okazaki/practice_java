package practice;

public class Practice5_2 {
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	public static void main(String[] args) {
		email("謝罪の件", "abcd@gmail.com", "本日は…");
	}
	
}
