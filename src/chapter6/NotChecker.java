package chapter6;

public class NotChecker implements Checker {
	
private Checker c;

public NotChecker(Checker a) {
	c = a;
}

	@Override
	public boolean accept(String text) {
		return !(c.accept(text));
	}

}
