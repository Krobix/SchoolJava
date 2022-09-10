package Chapter4;

public class RationalRunner {
	public static void main(String[] args) {
		Rational r1 = new Rational(5.0);
		Rational r2 = new Rational(1, 2);
		Rational r3 = r1.add(r2);
		Rational r4 = r1.multiply(r2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}
