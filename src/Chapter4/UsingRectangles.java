package Chapter4;
import java.util.*;

public class UsingRectangles {
	public static void main(String[] args) {
		Rectangle r1, r2, r3, r4;
		Random r = new Random();
		r1 = new Rectangle(r.nextInt(4), r.nextInt(4), r.nextInt(4)+4, r.nextInt(4)+4);
		r2 = new Rectangle(r.nextInt(4), r.nextInt(4), r.nextInt(4)+4, r.nextInt(4)+4);
		r3 = new Rectangle(r.nextInt(4), r.nextInt(4), r.nextInt(4)+4, r.nextInt(4)+4);
		r4 = new Rectangle(r.nextInt(4), r.nextInt(4), r.nextInt(4)+4, r.nextInt(4)+4);
		System.out.println("R1 is " + r1);
		System.out.println("R2 is " + r2);
		System.out.println("R3 is " + r3);
		System.out.println("R4 is " + r4);
		System.out.println("R1 overlaps: ");
		if(r1.overlap(r2)) System.out.println("R2");
		if(r1.overlap(r3)) System.out.println("R3");
		if(r1.overlap(r4)) System.out.println("R4");
		System.out.println("R2 overlaps: ");
		if(r2.overlap(r1)) System.out.println("R1");
		if(r2.overlap(r3)) System.out.println("R3");
		if(r2.overlap(r4)) System.out.println("R4");
		System.out.println("R3 overlaps: ");
		if(r3.overlap(r1)) System.out.println("R1");
		if(r3.overlap(r2)) System.out.println("R2");
		if(r3.overlap(r4)) System.out.println("R4");
		System.out.println("R4 overlaps: ");
		if(r4.overlap(r1)) System.out.println("R1");
		if(r4.overlap(r2)) System.out.println("R2");
		if(r4.overlap(r3)) System.out.println("R3");
	}
}
