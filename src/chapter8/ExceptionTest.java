package chapter8;

public class ExceptionTest {
	
	public static int asbestosAmount = 3;
	public static String s = "I LOVE ASBESTOS"; //This will be used for testing NullPointerException later
	
	public static void main(String[] args) {
		//We use a try loop, because the method we are going to use throws an exception
		try {
			//The function is called four times to lower asbestosAmount to zero
			consumeAsbestos();
			consumeAsbestos();
			consumeAsbestos();
			consumeAsbestos(); //This call causes the error
			
		}
		catch(OutOfAsbestosException e) {
			System.out.println(e); //we directly print out error info so we know what's going on
			asbestosAmount = 100; //We also are able to fix what caused the error
			
		}
		//Since the error was handled, execution can continue
		s = null; //Pretend I made some mistake while programming so s is now accidentally zero
		//We do another try loop when calling again
		try {
			consumeAsbestos();
		}
		catch(Exception e2) {
			//Because we use Exception instead of the specific type here, it can catch NullPointerException
			System.out.println(e2); 
			asbestosAmount = 100; 
		}
		
	}
	
	
	public static void consumeAsbestos() throws OutOfAsbestosException { //See OutOfAsbestosException.java in this directory
		//We check to see if necessary conditions are met
		if(s==null) {
			//If s is also important for some reason, it should be an actual String instead of null.
			//We throw NullPointerException because of this.
			throw new NullPointerException("null pointer exception");
		}
		else if(asbestosAmount>0) {
			//If yes, then everything is fine so we continue as normal
			asbestosAmount--;
			System.out.println("Asbestos consumed");
		}
		else {
			//If not, then the necessary task of this function (consuming asbestos) cannot be completed
			//So an exception is thrown
			throw new OutOfAsbestosException("Not enough asbestos");
		}
	}
}
