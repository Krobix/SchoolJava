package Chapter3;
import java.util.*;


public class SolvingQuadratics {
	
	public static double a, b, c;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a");
		a = scn.nextDouble();
		System.out.println("enter b");
		b = scn.nextDouble();
		System.out.println("Enter c");
		c = scn.nextDouble();
		System.out.println("Roots are " + plusRoot() + " and " + minusRoot());
	}
	public static double discriminant() {
		return Math.pow(b, 2) - (4*a*c);
	}
	public static double plusRoot() {
		return (-b+discriminant())/2*a;
	}
	public static double minusRoot() {
		return (-b-discriminant())/2*a;
	}
}
