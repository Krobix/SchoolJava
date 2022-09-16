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
	
	public static StretchShape createShape(int x, int y, char c, boolean f) {
		ArrayList<StretchSquare> s = new ArrayList<StretchSquare>();
		StretchShape shape = null;
		boolean failed = f;
		if(c=='a') {
			s.add(getSquare(x, y));
			s.add(getSquare(x+1, y));
			s.add(getSquare(x+2, y));
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) failed=true;
			}
			if(failed) {
				s = new ArrayList<StretchSquare>();
				s.add(getSquare(x, y));
				s.add(getSquare(x-1, y));
				s.add(getSquare(x-2, y));
				failed = false;
			}
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) return null;
			}
			s.get(0).toggleCircle();
			s.get(2).toggleCircle();
		}

		else if(c=='b') {
			s.add(getSquare(x, y));
			s.add(getSquare(x, y+1));
			s.add(getSquare(x, y+2));
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) failed = true;
			}
			if(failed) {
				s = new ArrayList<StretchSquare>();
				s.add(getSquare(x, y));
				s.add(getSquare(x, y-1));
				s.add(getSquare(x, y-2));
				failed = false;
			}
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) return null;
			}
			s.get(0).toggleCircle();
			s.get(2).toggleCircle();
		}
		
		else if(c=='c') {
			s.add(getSquare(x, y));
			s.add(getSquare(x, y+1));
			s.add(getSquare(x+1, y+1));
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) failed = true;
			}
			if(failed) {
				s = new ArrayList<StretchSquare>();
				s.add(getSquare(x, y));
				s.add(getSquare(x-1, y));
				s.add(getSquare(x-1, y-1));
				failed = false;
			}
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) return null;
			}
			
			s.get(0).toggleCircle();
			s.get(2).toggleCircle();
		}
		
		else if(c=='d') {
			s.add(getSquare(x, y));
			s.add(getSquare(x+1, y));
			s.add(getSquare(x+1, y+1));
			s.add(getSquare(x+1, y+2));
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) failed = true;
			}
			if(failed) {
				s = new ArrayList<StretchSquare>();
				s.add(getSquare(x, y));
				s.add(getSquare(x, y-1));
				s.add(getSquare(x, y-2));
				s.add(getSquare(x-1, y-2));
				failed=false;
			}
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) return null;
			}
			
	
			s.get(0).toggleCircle();
			s.get(3).toggleCircle();
		}
		
		else if(c=='e') {
			s.add(getSquare(x, y));
			s.add(getSquare(x+1, y));
			s.add(getSquare(x+1, y+1));
			s.add(getSquare(x+2, y+1));
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) failed = true;
			}
			if(failed) {
				s = new ArrayList<StretchSquare>();
				s.add(getSquare(x, y));
				s.add(getSquare(x-1, y-1));
				s.add(getSquare(x-1, y));
				s.add(getSquare(x-2, y-1));
				failed=false;
			}
			for(StretchSquare t:s) {
				if(t==null || t.getLetter()!='0' || t.getBlocked()) return null;
			}
	
			s.get(0).toggleCircle();
			s.get(3).toggleCircle();
		}
		
		shape = new StretchShape(x, y, c, s);
		return shape;
	}
}
