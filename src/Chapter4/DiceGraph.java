package Chapter4;

import java.util.*;

public class DiceGraph {
	public static void main(String[] args) {
		PairOfDice d=new PairOfDice();
		Scanner scn = new Scanner(System.in);
		int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] roll = new int[2];
		int rollAmount;
		System.out.println("Enter amount of times to roll dice.");
		rollAmount = scn.nextInt();
		for(int i=0; i<rollAmount; i++) {
			roll = d.roll();
			for(int j=2; j<=12; j++) {
				if(roll[0]+roll[1]==j) {
					count[j]++;
				}
			}
		}
		for(int j=2; j<=12; j++) {
			System.out.println("Amount of times " + j + " was rolled: " + count[j]);
		}
		scn.close();
	}
}
