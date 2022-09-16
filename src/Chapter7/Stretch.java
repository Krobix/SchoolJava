package Chapter7;
import java.util.*;

public class Stretch {
	public static ArrayList<StretchSquare> board;
	public static ArrayList<StretchShape> shapes;
	
	public static void initBoard(int h, int l) {
		int count = 0;
		board = new ArrayList<StretchSquare>();
		for(int i=0; i<h; i++) {
			for(int j=0; j<l; j++) {
				board.add(new StretchSquare(count, j, i, '0', false, false));
			}
		}
	}
	
	public static StretchSquare getSquare(int x, int y) {
		for(StretchSquare s:board) {
			if(x==s.getX()&&y==s.getY()) {
				return s;
			}
		}
		return null;
	}
	
	public static StretchShape createShape(int x, int y, char c) {
		ArrayList<StretchSquare> s = new ArrayList<StretchSquare>();
		StretchShape shape = null;
		if(c=='a') {
			s.add(getSquare(x, y));
			s.add(getSquare(x+1, y));
			s.add(getSquare(x+2, y));
			
		}
	}
}
