package Chapter4;

public class Die {
	//Data members
	private int numSides;
	private int faceValue;
	
	//Methods
	//default constructor
	public Die(){
		numSides = 6;
		roll();
	}
	
	//overloaded constructor
	public Die(int ns){
		numSides = ns;
		roll();
	}
	
	public int getNumSides(){
		return numSides;
	}
	
	public int getFaceValue(){
		return faceValue;
	}
	
	public int roll(){
		faceValue = (int)(Math.random()*numSides)+1;
		return faceValue;
	}
	
	public String toString(){
		return "Number of Sides: " + numSides +
				"\nFace Value: " + faceValue;
	}
}
