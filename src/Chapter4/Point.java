package Chapter4;

public class Point {
	private Rational x, y;
	
	public Point() {
		x=new Rational(0);
		y=new Rational(0);
	}
	
	public Point(double n1, double n2) {
		x=new Rational(n1);
		y=new Rational(n2);
	}
	
	public double getX() {
		return x.decimalValue();
	}
	
	public double getY() {
		return y.decimalValue();
	}
	
	public double changeX(double nx) {
		x = new Rational(nx+x.decimalValue());
		return x.decimalValue();
	}
	
	public double changeY(double ny) {
		y = new Rational(ny+y.decimalValue());
		return y.decimalValue();
	}
	
	public double distanceTo(Point p) {
		return Math.sqrt(Math.pow(p.getX()-getX(), 2) + Math.pow(p.getY()-getY(), 2));
	}
	
	public boolean equals(Point p) {
		return (getX()==p.getX()&&getY()==p.getY());
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
