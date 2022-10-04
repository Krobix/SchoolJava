package Chapter7;

public class Quiz1 {
	static int f=10;
	
	static class Person{
		static int pid=0;
	}
	
	public static void main(String[] args) {
		//QUESTION 1
		int[] a = {1,2,3,4,5,6};
		int i = a.length - 1;
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
		
		//QUESTION 2
		//This errors unless the print staement in the middle is commented out
		int x=0, y=10;
		try {
			y /= x;
		}
		//System.out.print("/ by 0");
		catch(Exception e) {
			System.out.println("Error");
		}
		
		//QUESTION 5
		int[] b = {1,2,3,4};
		System.out.println(b instanceof Object);
		
		//QUESTION 6
		int[] c = {1,2,053,4};
		int[][] d = {{1,2,4},{2,2,1},{0,43,2}};
		System.out.print(c[3]==d[0][2]);
		System.out.println(" " + (c[2]==d[2][1]));
		
		//QUESTION 7
		int e[][] = new int[3][];
		e[1] = new int[] {1,2,3};
		e[2] = new int[] {4,5};
		System.out.println(e[1][1]);
		
		//QUESTION 9
		print();
		
		//QUESTION 10
		for(int f=0; f<5; f++) {}
		System.out.println(f);
		
		//QUESTION 12
		
		
	}
	
	static void print() {
		int f = 8;
		System.out.println(f);
	}
}
