package Chapter4;

public class Box {
	private double sideLength;
	
	public Box() {
		sideLength = 2;
	}
	
	public Box(double l) {
		sideLength = l;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public double surfaceArea() {
		return (sideLength * sideLength)*6;
	}
	
	public String toString() {
		return String.valueOf(sideLength);
	}
	
	public double volume() {
		return sideLength * sideLength * sideLength;
	}
}
