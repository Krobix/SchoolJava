package chapter6;

public class SubstringChecker implements Checker {
	private String substr;
	
	public SubstringChecker(String s) {
		substr = s;
	}
	
	@Override
	public boolean accept(String text) {
		int len = substr.length();
		for(int i=0; i<(text.length()-len)+1; i++) {
			if(text.substring(i, i+len).equals(substr)) {
				return true;
			}
		}
		return false;
	}

}
