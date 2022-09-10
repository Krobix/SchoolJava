package Chapter4;

public class Rational {
	private int p, q;
	private boolean defined;
	
	private int deciToFracHelper(double d) {
		while(d!=(int)d) {
			d *= 10;
		}
		return (int) d;
	}
	
	public Rational() {
		p = 1;
		q=1;
		defined = true;
		
	}
	
	public Rational(int n, int d) {
		p=n;
		q=d;
		defined = (d!=0);
	}
	
	public Rational(double d) {
		p = deciToFracHelper(d);
		q = 1;
	}
	
	public Rational(double n, double d) {
		p = deciToFracHelper(n/d);
		q = 1;
	}
	
	public int getP() {
		return p;
	}
	
	public int getQ() {
		return q;
	}
	
	public void setP(int newP) {
		p = newP;
	}
	
	public void setQ(int newQ) {
		q = newQ;
	}
	
	public Rational add(Rational r) {
		int c = q*r.getQ(), p1, p2;
		Rational n = new Rational();
		p1 = p*r.getQ();
		p2 = r.getP()*q;
		n.setP(p1+p2);
		n.setQ(c);
		return n;
	}
	
	public Rational subtract(Rational r) {
		int c = q*r.getQ(), p1, p2;
		Rational n = new Rational();
		p1 = p*r.getQ();
		p2 = r.getP()*q;
		n.setP(p1-p2);
		n.setQ(c);
		return n;
	}
	
	public Rational multiply(Rational r) {
		return new Rational(p*r.getP(), q*r.getQ());
	}
	
	public Rational divide(Rational r) {
		return new Rational(p*r.getQ(), q*r.getP());
	}
	
	public double decimalValue() {
		return ((double) p) / ((double) q);
	}
	
	public String toString() {
		return String.valueOf(decimalValue());
	}
	
}
