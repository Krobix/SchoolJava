package Chapter7;
import java.util.*;

public class NumeralTriangle {
	
	public static void main(String[] args) {
		printTriangle(2, 3, 5);
		printTriangle(221, 2, 4);
	}
	
	public static void printTriangle(int s, int d, int r) {
		int last, current;
		s=addDigits(s);
		last=s;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<=i; j++) {
				if(i!=0) {
					current = last + d;
					while(current>=10) {
						current = addDigits(current);
					}
				}
				else current=last;
				System.out.print(""+current+" ");
				last=current;
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int addDigits(int n) {
		int sum=0;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(n>0) {
			digits.add(Integer.valueOf(n%10));
			n = n / 10;
		}
		for(Integer i: digits) {
			sum += i;
		}
		return sum;
	}
}
