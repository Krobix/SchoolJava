package Chapter4;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double circumference() {
		return 2.0 * Math.PI * radius;
	}
	
	public boolean equals(Circle c) {
		return (c.radius==radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return "Circle with radius of " + radius;
	}
}
