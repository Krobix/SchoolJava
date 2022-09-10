package Chapter4;

public class Rectangle {
	private Point br, tl;
	
	public Rectangle() {
		br = new Point(8, 8);
		tl = new Point(0, 0);
	}
	
	public Rectangle(double x1, double y1, double x2, double y2) {
		tl = new Point(x1, y1);
		br = new Point(x2, y2);
	}
	
	public Rectangle(Point a, Point b) {
		tl=a;
		br=b;
	}
	
	public double area() {
		return height()*width();
	}
	
	public double height() {
		return br.getY()-tl.getY();
	}
	
	public double width() {
		return br.getX()-tl.getX();
	}
	
	public Point getBR() {
		return br;
	}
	
	public Point getTL() {
		return tl;
	}
	
	public boolean inBounds(double x, double y) {
		return (x>=tl.getX()&&x<=br.getX()&&y>=tl.getY()&&y<=br.getY());
	}
	
	public boolean overlap(Rectangle r) {
		return (inBounds(r.getBR().getX(), r.getBR().getY())||inBounds(r.getTL().getX(), r.getTL().getY()));
	}
	
	public double perimeter() {
		return (width()*2)+(height()*2);
	}
	
	public void setBR(double x, double y) {
		br = new Point(x, y);
	}
	
	public void setTL(double x, double y) {
		tl = new Point(x, y);
	}
	
	public String toString() {
		return "(" + tl.getX() + ", " + tl.getY() + ") to (" + br.getX() + ", " + br.getY() + ")";
	}
}
