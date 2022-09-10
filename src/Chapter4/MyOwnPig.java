package Chapter4;

import java.util.*;

//Brendon Shaw
//12/28/2021
//My version of pig game

public class MyOwnPig {
	public static int pLucky, pUnlucky, cLucky, cUnlucky, pScore=0, cScore=0, pTurn=0, cTurn=0;
	public static PairOfDice d = new PairOfDice();
	public static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int[] a;
		System.out.println("generating lucky and unlucky numbers.");
		a = d.roll();
		while(a[0]==a[1]) a = d.roll(); //Incase lucky and unlucky are the same
		pLucky = a[0];
		pUnlucky = a[1];
		a = d.roll();
		while(a[0]==a[1]) a = d.roll();//in case lucky and unlucky are the same
		cLucky = a[0];
		cUnlucky = a[1];
		System.out.println("Player lucky number: " + pLucky);
		System.out.println("Player unlucky number: " + pUnlucky);
		System.out.println("Computer lucky number: " + cLucky);
		System.out.println("Computer unlucky number: " + cUnlucky);
		player();//Game always starts with player's role
	}
	
	public static void displayScores() {
		//just for convenience, self-explanatory
		System.out.println("Your score is: " + pScore);
		System.out.println("Computer's score is: " + cScore);
	}
	
	public static void player() {
		//check if game has ended and display scores
		winCheck();
		displayScores();
		//declarations and roll
		int[] a = d.roll();
		int sum = a[0] + a[1], c;
		System.out.println("Your roll: " + sum + " (" + a[0] + " and " + a[1] + ")");
		pTurn += sum; //gets added to turn value; not part of full score yet
		if(a[0]==pUnlucky||a[1]==pUnlucky) {
			System.out.println("You got an unlucky roll!");
			pTurn = 0;
			if(a[0]==a[1]) { //this means that both rolls were unlucky; total score is removed
				pScore = 0;
			}
			cScore += cTurn;
			cTurn = 0;
			computer();
		}
		else if(a[0]==pLucky||a[1]==pLucky) {
			System.out.println("You got a lucky roll!");
			cTurn = 0;
			if(a[0]==a[1]) { //both rolls were lucky
				cScore = 0;
			}
		}
		cScore += cTurn;
		cTurn = 0; //reset turn score
		System.out.println("Enter zero to roll again, 1 to pass on the dice.");
		c = scn.nextInt();
		if(c==0) player();
		else if(c==1) computer();
	}
	
	public static void computer() {
		//this is basically a copy with adjustments of player(). read comments there to figure out what's going on.
		winCheck();
		displayScores();
		int[] a = d.roll();
		int sum = a[0] + a[1];
		System.out.println("The Computer's roll: " + sum + " (" + a[0] + " and " + a[1] + ")");
		cTurn += sum;
		if(a[0]==cUnlucky||a[1]==cUnlucky) {
			System.out.println("The computer got an unlucky roll!");
			cTurn = 0;
			if(a[0]==a[1]) {
				cScore = 0;
			}
			pScore += pTurn;
			pTurn = 0;
			computer();
		}
		else if(a[0]==cLucky||a[1]==cLucky) {
			System.out.println("The computer got a lucky roll!");
			pTurn = 0;
			if(a[0]==a[1]) {
				pScore = 0;
			}
		}
		pScore += pTurn;
		pTurn = 0;
		player(); //Computer always chooses player by default because otherwise them winning would be almost impossible, because they would always go until they got unlucky
	}
	
	public static void winCheck() {
		if(cScore>=50) {
			System.out.println("The computer won!");
			System.exit(0); //quits
		}
		else if(pScore>=50) {
			System.out.println("Player won!");
			System.exit(0); //quits
		}
	}
}
