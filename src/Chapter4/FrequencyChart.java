package Chapter4;
import java.util.*;

public class FrequencyChart {
	public static void main(String[] args) {
		int[] n, freq={0,0,0,0,0,0,0,0,0,0};
		Random r = new Random();
		n = new int[100];
		for(int i=0; i<100; i++) {
			n[i] = r.nextInt(99)+1;
			System.out.print(n[i]);
			if((i+1)%10==0) System.out.println();
			else System.out.print("    ");
			freq[n[i]/10]++;
		}
		
		System.out.println("1  - 10 | " + stars(freq[0]));
		System.out.println("11 - 20 | " + stars(freq[1]));
		System.out.println("21 - 30 | " + stars(freq[2]));
		System.out.println("31 - 40 | " + stars(freq[3]));
		System.out.println("41 - 50 | " + stars(freq[4]));
		System.out.println("51 - 60 | " + stars(freq[5]));
		System.out.println("61 - 70 | " + stars(freq[6]));
		System.out.println("71 - 80 | " + stars(freq[7]));
		System.out.println("81 - 90 | " + stars(freq[8]));
		System.out.println("91 - 100| " + stars(freq[9]));
	}
	
	public static String stars(int n) {
		String s="";
		for(int i=0; i<n; i++) {
			s+="*";
		}
		return s;
	}
}
