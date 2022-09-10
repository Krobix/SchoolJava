package chapter6;

public class RouteCipherRunner {
	public static void main(String[] args) {
		RouteCipher rc = new RouteCipher(2, 3);
		String msg = "I just love computer science so much!!!!";
		String encrypted = rc.encryptMessage(msg);
		System.out.println(encrypted);
	}
}
