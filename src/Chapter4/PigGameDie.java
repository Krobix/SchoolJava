package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class PigGameDie {
	public static int d1, d2, pt=0, ct=0, pr=0, cr=0, ch;
	public static Die die1, die2;
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		player();
	}
	
	public static void player(){
		System.out.println("PLAYER");
		System.out.println("Total: " + pt);
		rollDice();
		displayRolls();
		if(isSE()){
			pt=0;
			pr=0;
			computer();
		}
		else if(isHSE()){
			pr=0;
			computer();
		}
		else {
			pr += sumRoll();
			System.out.println("roll (enter 0) or hold (enter any other number)?");
			ch = scn.nextInt();
			if(ch==0) player();
			else computer();
		}
		
	}
	public static void computer() {
		System.out.println("COMPUTER");
		System.out.println("Total: " + ct);
		rollDice();
		displayRolls();
		if(isSE()) {
			ct=0;
			cr=0;
			player();
		}
		else if(isHSE()) {
			cr=0;
			player();
		}
		else ct += sumRoll();
		player();
	}
	public static void rollDice(){
		d1 = die1.roll();
		d2 = die2.roll();
	}
	public static int sumRoll(){
		return d1+d2;
	}
	public static void displayRolls(){
		System.out.println(""+d1 + ", " + d2);
	}
	
	public static void displayTotals(){
		System.out.println("Player points this round: " + pr);
		System.out.println("Player point total: " + pt);
		System.out.println("AI points this round: " + cr);
		System.out.println("AI points total: " + ct);
	}
	public static boolean isSE(){
		return d1==1&&d2==1;
	}
	public static boolean isHSE(){
		return (d1==1&&d2!=1) || (d2==1&&d1!=1);
	}
}
