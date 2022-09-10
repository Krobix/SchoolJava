package Chapter4;
import java.util.*;

public class NumSame {
	public static void main(String[] args) {
		int[] a=new int[20], b=new int[20];
		int shared=0;
		Random r = new Random();
		for(int i=0; i<20; i++) {
			a[i] = r.nextInt(99)+1;
			b[i] = r.nextInt(99)+1;
			if(a[i]==b[i]) {
				System.out.println("Index " + i + " is the same for both arrays (" + a[i] + ")");
				shared++;
			}
		}
		System.out.println(shared);
	}
}
