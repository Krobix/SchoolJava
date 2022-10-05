package Chapter7;

public class Quiz1 {
	static int f=10;
	
	static class Person{
		public static int pid=0;
		int age;
		String name;
		
		Person(String s, int i){
			pid++;
			name=s;
			age=i;
		}
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
		
		//QUESTION 11
		Person p1 = new Person("John", 22);
		Person p2 = change(p1);
		System.out.println(p2.pid + " " + p2.name + " " + p2.age);
		System.out.println(p1.pid + " " + p1.name + " " + p1.age);
		
		//QUESTION 12
		int f=10;
		int g = change(f);
		System.out.println(f+g);
		
		//QUESTION 13
		String s = "Java";
		s.concat(" SE 6");
		s.replace('6', '7');
		System.out.println(s);
		
		//QUESTION 14
		String t = "Java";
		t.concat(" SE 6");
		t.toLowerCase();
		System.out.println(t);
		
		//QUESTION 15
		//I started writing this code but then realized there was no point as it would always error out
		//Because they would try to use a variable not in the current slope
		
	}
	
	static void print() {
		int f = 8;
		System.out.println(f);
	}
	
	static public void print2(int a) {
		
	}
	
	private static Person change(Object o) {
		Person p2 = (Person) o;
		p2.age = 25;
		return p2;
	}
	
	static int change(int x) {
		x=12;
		return 12;
	}
}
