package Chapter4;
import java.util.*;

public class UsingArrays {
	public static void main(String[] args) {
		int[] n = new int[10];
		Random r=new Random();
		for(int i=0; i<10; i++) {
			n[i] = r.nextInt(99)+1;
		}
		output(n);
		System.out.println("avg: " + average(n));
		System.out.println("min: " + min(n));
		System.out.println("max: " + max(n));
		output(swap(n, 0, 1));
		output(maxFirstMinLast(n));
		System.out.println("evens: " + countEven(n));
		System.out.println("odds: " + countOdd(n));
	}
	
	public static void output(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println();
	}
	
	public static double average(int[] n) {
		double sum=0;
		for(int i=0; i<n.length; i++) {
			sum+=n[i];
		}
		return sum/n.length;
	}
	
	public static int min(int[] n) {
		int m=n[0];
		for(int i=0; i<n.length; i++) {
			if(n[i]<m) m=n[i];
		}
		return m;
	}
	
	public static int max(int[] n) {
		int m=n[0];
		for(int i=0; i<n.length; i++) {
			if(n[i]>m) m=n[i];
		}
		return m;
	}
	
	public static int[] swap(int[] n, int a, int b) {
		int[] n2 = n.clone();
		n2[a]=n[b];
		n2[b]=n[a];
		return n2;
	}
	
	public static int[] maxFirstMinLast(int[] n) {
		int[] n2 = n.clone();
		int m=0;
		for(int i=0; i<n.length; i++) {
			if(n[i]>n[m]) m=i;
		}
		n2 = swap(n2, 0, m);
		for(int i=0; i<n.length; i++) {
			if(n[i]<n[m]) m=i;
		}
		n2 = swap(n2, n2.length-1, m);
		return n2;
	}
	
	public static int countEven(int[] n) {
		int e=0;
		for(int i=0; i<n.length; i++) {
			if(n[i]%2==0) e++;
		}
		return e;
	}
	
	public static int countOdd(int[] n) {
		int e=0;
		for(int i=0; i<n.length; i++) {
			if(!(n[i]%2==0)) e++;
		}
		return e;
	}
}
