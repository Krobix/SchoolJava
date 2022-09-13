package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class LightsOutL2 extends LightsOut {
	
	public LightsOutL2(int n1, int n2) {
		super(n1, n2);
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
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r, n, onCount=0;
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
			for(String s:turnedOn) {
				char[] c = s.toCharArray();
				int x = Character.getNumericValue(c[0])-1;
				for(int k=1; k<c.length; k++) {
					int y = Character.getNumericValue(c[k])-1;
					getLight(x, y).toggle();
				}
			}
			n = scn.nextInt();
			for(int j=0; j<n; j++) {
				scn = new Scanner(System.in);
				toPress = scn.nextLine();
				toPressChar = toPress.toCharArray();
				hitLight(Character.getNumericValue(toPressChar[0])-1, Character.getNumericValue(toPressChar[1])-1);
			}
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
