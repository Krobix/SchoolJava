package Chapter7;

public class StretchSquare {
	private int x, y, id;
	private char letter;
	private boolean blocked, circle;
	
	public StretchSquare(int i, int n1, int n2, char c, boolean b, boolean c2) {
		id = i;
		x = n1;
		y = n2;
		letter = c;
		blocked = b;
		circle = c2;
		if(blocked) letter = 'b';
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public boolean getBlocked() {
		return blocked;
	}
	
	public boolean getCircle() {
		return circle;
	}
	
	public void setLetter(char c) {
		letter = c;
	}
	
	public void toggleBlock() {
		blocked = !blocked;
	}
	
	public void toggleCircle() {
		circle = !circle;
	}
}
