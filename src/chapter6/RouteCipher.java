package chapter6;

public class RouteCipher {
	private String[][] letterBlock;
	private int numRows, numCols;
	
	public RouteCipher(int rows, int cols) {
		numRows = rows;
		numCols = cols;
		letterBlock = new String[rows][cols];
	}

	private void fillBlock(String str) {
		for(int i=0;i<letterBlock.length; i++) {
			for(int j=0; j<letterBlock[0].length; j++) {
				if((i+1)*(j+1)<=str.length()) {
					letterBlock[i][j] = String.valueOf(str.charAt((i+1)*(j+1)-1));
				}
			}
		}
	}
	
	private String encryptBlock() {
		String e = "";
		for(int j=0; j<letterBlock[0].length; j++) {
			for(int i=0; i<letterBlock.length; i++) {
				e += letterBlock[i][j];
			}
		}
		return e;
	}
	
	public String encryptMessage(String msg) {
		int blockLen = numCols * numRows;
		String encrypted = "";
		for(int i=0; i<msg.length(); i++) {
			if(i%blockLen==0) {
				int end = i+blockLen;
				if(end>msg.length()) end=msg.length();
				fillBlock(msg.substring(i, end));
				encrypted += encryptBlock();
			}
		}
		return encrypted;
	}
}
