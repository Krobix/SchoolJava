package Chapter3;
import java.util.*;

public class RationalOperation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, d1, n2, d2;
		int ans[];
		System.out.println("Enter the numbers of the fractions in the following order: numerator 1, denominator 1, numerator 2, denominator 2");
		n1 = scn.nextInt();
		d1 = scn.nextInt();
		n2 = scn.nextInt();
		d2 = scn.nextInt();
		ans = rationalOp(n1, d1, n2, d2);
		System.out.println(""+ans[0]+"/"+ans[1]);
		scn.close();
	}
	public static int[] rationalOp(int n1, int d1, int n2, int d2) {
		int ans[] = new int[2];
		ans[0] = (n1*d2)+(n2*d1);
		ans[1] = d1*d2;
		return ans;
	}
}
