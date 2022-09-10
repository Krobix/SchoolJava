package Chapter4;

import java.util.*;

public class EquationSystem {
	public static Line l1, l2;
	public static double m1, b1, m2, b2;
	public static Scanner scn;
	
	public static void main(String[] args) {
		boolean exit = false;
		while(!exit) {
			int pl;
			scn = new Scanner(System.in);
			System.out.println("Welcome! Please enter the info for your first and second lines in the system.");
			l1 = lineMenu();
			l2 = lineMenu();
			System.out.println("The equations you chose are: ");
			System.out.println(l1);
			System.out.println(l2);
			System.out.println("Their solution is " + l1.interception(l2));
			System.out.println("Enter 0 to exit, 1 to run again.");
			pl = scn.nextInt();
			if(pl==0) exit=true;
			else exit=false;
		}
	}
	
	public static Line lineMenu() {
		int choice;
		double m, a, b, c, x, y, x2, y2;
		System.out.println("Please choose how you will enter the values for your line by entering a number.");
		System.out.println("1:Slope and y intercept\n2:Two points\n3:One point and slope\n4:A, B, and C for standard equation of line");
		choice = scn.nextInt();
		if(choice==1) {
			System.out.println("Enter the slope.");
			m = scn.nextDouble();
			System.out.println("Enter y-intercept.");
			b = scn.nextDouble();
			return new Line(m, b);
		}
		else if(choice==2) {
			System.out.println("Enter x1, hit enter, then y1:");
			x=scn.nextDouble();
			y=scn.nextDouble();
			System.out.println("Now x2 and then y2:");
			x2=scn.nextDouble();
			y2=scn.nextDouble();
			return new Line(new Point(x, y), new Point(x2, y2));
		}
		else if(choice==3) {
			System.out.println("Enter x and y of point");
			x = scn.nextDouble();
			y = scn.nextDouble();
			System.out.println("enter slope.");
			m = scn.nextDouble();
			return new Line(new Point(x, y), m);
		}
		else if(choice==4) {
			System.out.println("Enter a, b, and c in order, hitting enter after each:");
			a=scn.nextDouble();
			b=scn.nextDouble();
			c=scn.nextDouble();
			return new Line(a, b, c);
		}
		else {
			System.out.println("Invalid choice.");
			return lineMenu();
		}
	}
}
