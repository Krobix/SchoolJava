package Chapter7;
import java.util.*;

public class LightsOut {
	private int x, y, id;
	private boolean isOn=false;
	
	public static LightsOut[] board = new LightsOut[64];
	
	public LightsOut(int n1, int n2) {
		x=n1;
		y=n2;
		id=(y*8)+x;
	}
	
	public int getId() {
		return id;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void toggle() {
		isOn = !isOn;
	}
	
	public static void setupBoard() {
		board = new LightsOut[64];
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				LightsOut l = new LightsOut(j, i);
				int n = l.getId();
				board[n] = l;
			}
		}
	}
	
	public static LightsOut getLight(int x, int y) {
		for(LightsOut l:board) {
			if(l.getX()==x&&l.getY()==y) return l;
		}
		return null;
	}
	
	public static void hitLight(int x, int y) {
		int[][] coordList = {{x, y}, {x+1, y}, {x, y+1}, {x-1, y}, {x, y-1}, {x-1, y-1}, {x+1, y-1}, {x-1, y+1}, {x+1, y+1}, {x+2, y}, {x, y+2}, {x-2, y}, {x, y-2}};
		for(int i=0; i<coordList.length; i++) {
			int[] c = coordList[i];
			for(LightsOut l:board) {
				//System.out.println(c[0]);
				if(l.getX()==c[0]&&l.getY()==c[1]) {
					//System.out.println("Hit succeded!");
					l.toggle();
				}
			}
		}
	}
	
	public static int onInBoard() {
		int n=0;
		for(LightsOut l:board) {
			if(l.getIsOn()) n++;
		}
		return n;
	}
	
	public static void printBoard() {
		for(int i=0; i<8; i++) {
			System.out.println("------------------------");
			for(int j=0; j<8; j++) {
				int n=0;
				if(getLight(j, i).getIsOn()) n=1;
				System.out.print("| " + n);
			}
			System.out.println(" |");
		}
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r, onCount=0;
		ArrayList<String> turnedOn = new ArrayList<String>();
		String toPress;
		char[] toPressChar;
		
		setupBoard();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter input line " + i + ", separating each individual input with enter:");
			r = scn.nextInt();
			for(int j=0; j<r; j++) {
				scn = new Scanner(System.in);
				String str = scn.nextLine();
				turnedOn.add(str);
			}
			toPress = scn.nextLine();
			toPressChar = toPress.toCharArray();
			for(String s:turnedOn) {
				char[] c = s.toCharArray();
				int x = Character.getNumericValue(c[0])-1;
				for(int k=1; k<c.length; k++) {
					int y = Character.getNumericValue(c[k])-1;
					getLight(x, y).toggle();
				}
			}
			//printBoard();
			hitLight(Character.getNumericValue(toPressChar[0])-1, Character.getNumericValue(toPressChar[1])-1);
			//printBoard();
			for(LightsOut l:board) {
				//System.out.println("LIGHT: id=" + l.getId() + ", x=" + l.getX() + ", y=" + l.getY() + ", isOn=" + l.getIsOn());
				if(l.getIsOn()) onCount++;
			}
			System.out.println(onCount);
			System.out.println();
			setupBoard();
			onCount=0;
			turnedOn = new ArrayList<String>();
		}
	}
	
}
