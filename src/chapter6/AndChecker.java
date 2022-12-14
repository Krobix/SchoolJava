package chapter6;

public class AndChecker implements Checker {
	private Checker c1, c2;
	
	public AndChecker(Checker a, Checker b) {
		c1 = a;
		c2 = b;
	}
	
	@Override
	public boolean accept(String text) {
		return c1.accept(text)&&c2.accept(text);
	}

}
