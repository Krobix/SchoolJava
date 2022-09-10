package Chapter4;
import java.util.*;

public class ChoiceSort {
	
	public static void main(String[] args) {
		Integer[] n = new Integer[10], n2 = new Integer[10];
		String[] s = new String[5], s2 = new String[5];
		int typeOpt, orderOpt, sortOpt, againOpt;
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Choose what type of array to use.");
		typeOpt = menu(new String[] {"String", "Integer"});
		if(typeOpt==0) {
			System.out.println("Enter five Strings to be used.");
			for(int i=0; i<5; i++) {
				s[i] = scn.nextLine();
			}
			System.out.println("Using Strings:");
			strOutput(s);
		}
		else {
			for(int i=0; i<10; i++) {
				n[i] = r.nextInt(100)+1;
				System.out.println("Randomly generated integers:");
			}
			intOutput(n);
		}
		
		System.out.println("Ascending (low to high) or descending (high to low) order?");
		orderOpt = menu(new String[] {"Ascending", "Descending"});
		System.out.println("Selection or Insertion sort?");
		sortOpt = menu(new String[] {"Selection sort", "insertion sort"});
		if(orderOpt==1) {
			n = reverseArr(n);
			s = reverseArr(s); //by just reversing array and reversing it again at the end number of conditionals can be reduced
		}
		
		if(sortOpt==0) { //selection sort
			if(typeOpt==0) { //string
				int min =0;
				for(int i=0; i<5; i++) {
					if(s[i].toLowerCase().charAt(0)<s[min].toLowerCase().charAt(0)) {
						s = (String[]) swap(s, 0, i);
						min = i;
					}
				}
			}
			else if(typeOpt==1) { //integer
				int min=0;
				for(int i=0; i<10; i++) {
					if(n[i].intValue()<n[min].intValue()) {
						n = (Integer[]) swap(s, 0, i);
						min = i;
					}
				}
			}
		}
		
		else if(sortOpt==1) { //insertion sort
			if(typeOpt==0) {
				for(int i=0; i<5; i++) {
					for(int j=i; j>0; j--) {
						if(s[j].toLowerCase().charAt(0)<s[j-1].toLowerCase().charAt(0)) {
							s = (String[]) swap(s, j, j-1);
						}
					}
				}
			}
			
			if (typeOpt==1) {
				for(int i=0; i<10; i++) {
					for(int j=i; j>0; j--) {
						if(n[j].intValue()<n[j-1].intValue()) {
							n = (Integer[]) swap(n, j, j-1);
						}
					}
				}

			}
		}
		if(orderOpt==1) {
			n = reverseArr(n);
			s = reverseArr(s); //by just reversing array and reversing it again at the end number of conditionals can be reduced
		}
		
		System.out.println("Results:");
		if(typeOpt==0) strOutput(s);
		else intOutput(n);
		againOpt = menu(new String[] {"Continue", "Exit"});
		if(againOpt==0) {
			main(null);
		}
		else {}
	}
	
	public static Object[] swap(Object[] n, int a, int b) {
		Object[] n2 = n.clone();
		n2[a]=n[b];
		n2[b]=n[a];
		return n2;
	}
	
	public static <T> T[] reverseArr(T[] arr) {
		T[] arr2 = arr.clone();
		for(int i=arr.length-1; i>=0; i--) {
			arr2[arr.length-i-1] = arr[i];
		}
		return arr2;
	}
	
	public static void intOutput(Integer[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.println("[" + i + "] : " + n[i]);
		}
		System.out.println();
	}
	
	public static void strOutput(String[] s) {
		for(int i=0; i<s.length; i++) {
			System.out.println("[" + i + "] : " + s[i]);
		}
		System.out.println();
	}
	
	public static int menu(String[] s) {
		int opt;
		Scanner scn = new Scanner(System.in);
		strOutput(s);
		System.out.println("Enter the number of your choice.");
		opt = scn.nextInt();
		return opt;
	}
}
