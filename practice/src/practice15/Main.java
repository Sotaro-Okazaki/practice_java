package practice15;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(s); 
		String[] a = s.split("[,]");
		for (int i = 0; i < 100; i++) {
		System.out.println(a[i]);
		}
	}

	public String concatPath(String folder, String file) {
		if ( !folder.endsWith("/") ) {
			folder += "/";
		}
		return folder + file;
	}
}
