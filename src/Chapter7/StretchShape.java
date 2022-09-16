package Chapter7;
import java.util.*;

public class StretchShape {
	private ArrayList<StretchSquare> squares;
	private char letter;
	private int x, y;
	
	public StretchShape(int n1, int n2, char c, ArrayList<StretchSquare> s) {
		x = n1;
		y = n2;
		letter = c;
		squares = s;
	}
	
	public StretchSquare getSquare(int n) {
		return squares.get(n);
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
}
