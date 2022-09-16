package Chapter7;
import java.util.*;

public class StretchShape {
	private ArrayList<StretchSquare> squares;
	private char letter;
	private int x, y, squaresAmount;
	
	public StretchShape(int n1, int n2, char c, ArrayList<StretchSquare> s) {
		squaresAmount = 0;
		x = n1;
		y = n2;
		letter = c;
		squares = s;
		for(StretchSquare t:s) {
			t.setLetter(c);
			squaresAmount++;
		}
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
	
	public int len() {
		return squaresAmount;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public boolean overlapX(StretchShape other) {
		for(StretchSquare i:squares) {
			for(int j=0; j<other.len(); j++) {
				if(i.getX()==other.getSquare(j).getX()) return true;
			}
		}
		return false;
	}
	
	public boolean circlesTouching(StretchShape other) {
		for(StretchSquare i:squares) {
			for(int j=0; j<other.len(); j++) {
				int thisX=i.getX(), thisY=i.getY(), otherX=other.getSquare(j).getX(), otherY=other.getSquare(j).getY();
				if((thisX==otherX+1 || thisX==otherX-1 || thisY==otherY+1 || thisY==otherY-1) && (i.getCircle() && other.getSquare(j).getCircle())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public int amountTouching(StretchShape other) {
		int n=0;
		for(StretchSquare i:squares) {
			for(int j=0; j<other.len(); j++) {
				int thisX=i.getX(), thisY=i.getY(), otherX=other.getSquare(j).getX(), otherY=other.getSquare(j).getY();
				if(thisX==otherX+1 || thisX==otherX-1 || thisY==otherY+1 || thisY==otherY-1) {
					n++;
				}
			}
		}
		return n;
	}
	
	public void erase() {
		for(StretchSquare s:squares) {
			s.setLetter('0');
			if(s.getCircle()) s.toggleCircle();
		}
	}
}
