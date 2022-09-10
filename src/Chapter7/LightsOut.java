package Chapter7;
import java.util.*;

public class LightsOut {
	private int x, y, id;
	private boolean isOn=false;
	
	public static LightsOut[] board = new LightsOut[64];
	
	public LightsOut(int n1, int n2) {
		x=n1;
		y=n2;
		id=(y*8)+x-1;
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
		int[][] coordList = {{x+1, y}, {x, y+1}, {x-1, y}, {x, y-1}, {x-1, y-1}, {x+1, y-1}, {x-1, y+1}, {x+1, y+1}, {x+2, y}, {x, y+2}, {x-2, y}, {x, y-2}};
		for(int[] c:coordList) {
			for(LightsOut l:board) {
				if(l.getX()==c[0]&&l.getY()==c[1]) {
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
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
	}
	
}
