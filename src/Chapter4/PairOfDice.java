package Chapter4;

public class PairOfDice {
	private Die die1, die2;
	
	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public PairOfDice(int ns1, int ns2) {
		die1 = new Die(ns1);
		die2 = new Die(ns2);
	}
	
	public int[] roll() {
		int[] r = new int[2];
		r[0] = die1.roll();
		r[1] = die2.roll();
		return r;
	}
}
