package Chapter4;

public class Line {
	//how do you define a line? y =mx+b
	private Rational m;
	private Rational b;
	private boolean isVertical;
	private Rational xIntercept;
	
	//Constructors
	//default y = x
	public Line() {
		m= new Rational(1);
		b= new Rational(0);
		isVertical=false;
	}
	
	//Slope-intercept
	public Line(double slope, double yIntercept) {
		m = new Rational(slope);
		b = new Rational(yIntercept);
		isVertical = false;
		setXintercept();
	}
	
	//Point Slope
	public Line(Point p, double slope) {
		m=new Rational(slope);
		b = new Rational(p.getY() - (m.decimalValue() * p.getX()));
		isVertical=false;
		setXintercept();
	}
	
	//Two Points
	public Line(Point p, Point q) {
		m= new Rational((p.getX()/p.getY())-(q.getX()/q.getY()));
		b = new Rational(p.getY() - (m.decimalValue() * p.getX()));
		isVertical = false;
		setXintercept();
	}
	
	//Standard Form:  Ax+By=C
	public Line(double n1, double n2, double n3) {
		m=new Rational(n1/n2);
		b=new Rational(n3/n2);
		isVertical=false;
		setXintercept();
	}
	
	public boolean vertical() {
		return isVertical;
	}
	
	public double xInt() {
		return xIntercept.decimalValue();
	}
	
	public double getB() {
		return b.decimalValue();
	}
	
	public double getM() {
		return m.decimalValue();
	}

	private void setXintercept() {
		if(m.decimalValue()==0) {
			System.out.println("Horizontal line, no x Intercept");
		}else {
			xIntercept = new Rational(-1*b.decimalValue()/m.decimalValue());
		}
	}
	
	public Point interception(Line l) {
		double x, y, m1, b1;
		if(isVertical && l.vertical() && xIntercept.decimalValue()==l.xInt()) {
			System.out.println("Infinite solutions");
			return null;
		}
		
		else if(isVertical && l.vertical() && xIntercept.decimalValue()!=l.xInt()) {
			System.out.println("No solutions");
			return null;
		}
		
		else {
			b1 = b.decimalValue() - l.getB();
			m1 = m.decimalValue() - l.getM();
			x = (0-b1) / m1;
			y = (m1 * x) + b.decimalValue();
			return new Point(x, y);
		}
	}
	
	public String toString() {
		return "y = "+m+"x + "+b;
	}

}
