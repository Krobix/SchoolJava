package Chapter4;

public class SelectionSort {
	public static void main(String[] args) {
		int[] n = new int[15], n2, reversed=new int[15];
		for(int i=0; i<15; i++) {
			n[i] = (int)(Math.random()*99)+1;
		}
		output(n);
		n2=n.clone();
		for(int i=0; i<15; i++) {
			n2=selectionSort(n2, i);
			//output(n2);
		}
		output(n2);
		for(int i=14; i>=0; i--) {
			reversed[i]=n2[14-i];
		}
		output(reversed);
	}
	
	public static void output(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println();
	}
	
	public static int[] swap(int[] n, int a, int b) {
		int[] n2 = n.clone();
		n2[a]=n[b];
		n2[b]=n[a];
		return n2;
	}
	
	public static int minIndex(int[] n, int start) {
		int m=start;
		for(int i=start; i<n.length; i++) {
			if(n[i]<n[m]) m=i;
		}
		return m;
	}
	
	public static int[] selectionSort(int[] n, int start) {
		int min = minIndex(n, start);
		return swap(n, min, start);
	}
}
