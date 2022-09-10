package Chapter4;

import java.util.*;

public class UsingCircle {
	public static void main(String[] args) {
		Circle c1, c2, c3;
		Random r = new Random();
		c1 = new Circle(10);
		c2 = new Circle(r.nextInt(7)+8);
		c3 = new Circle(r.nextInt(7)+8);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.area()+c1.circumference());
		System.out.println(c2.area()+c2.circumference());
		System.out.println(c2.area()+c2.circumference());
		System.out.println(c2==c3);
	}
}
