package chapter6;

import java.util.Arrays;

public class TokenPass {
	private int[] board;
	private int currentPlayer;
	
	public static void main(String[] args) {
		TokenPass tk = new TokenPass(10);
		for(int i=0; i<10; i++) {
			System.out.println(Arrays.toString(tk.getBoard()));
			tk.distributeCurrentPlayerTokens();
		}
		System.out.println(Arrays.toString(tk.getBoard()));
	}
	
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		int p = ((int)(Math.random()*10));;
		p = p % (playerCount-1);
		for(int i=0; i<playerCount; i++) {
			int n = ((int)(Math.random()*10));
			n = n % 10;
			n += 1;
			board[i] = n;
		}
	}
	
	public void distributeCurrentPlayerTokens() {
		int n = board[currentPlayer];
		board[currentPlayer] = 0;
		for(int i=0; i<n; i++) {
			int ind=currentPlayer+i;
			while(ind>=board.length) {
				ind -= board.length;
			}
			board[ind]++;
		}
		currentPlayer++;
		if(currentPlayer>=board.length) {
			currentPlayer=0;
		}
	}
	
	public int[] getBoard() {
		return board;
	}
}
