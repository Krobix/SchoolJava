package Chapter3;
import java.util.*;

public class RationalOperations {
	static int n1, d1, n2, d2;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		getInput();
		menu();
	}
	
	public static void menu(){
		int choice;
		pln("Select the operation that you would like to perform");
		pln("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
		choice = scn.nextInt();
		if(choice==1){
			addition();
		}
		else if(choice==2) {
			subtraction();
		}
		else if(choice==3) {
			multiplication();
		}
		else {
			division();
		}
	}
	
	public static void addition(){
		int nn = n1*d2+n2*d1;
		int nd = d1*d2;
		int gcf = gcf(nn, nd);
		pln("Sum is: " + nn/gcf+"/"+nd/gcf);
	}
	
	public static void multiplication() {
		pln("Product is: " + (n1*n2)+"/"+(d1*d2));
	}
	
	public static void division() {
		pln("Quotient is: " + (n1*d2)+"/"+(n2*d1));
	}
	
	public static void subtraction() {
		int maxD = Math.max(d2, d1);
		int minD = Math.min(d1,  d2);
		int gcf = gcf(d1, d2);
		int nn1=d1/gcf, nn2=d2/gcf;
		pln("Difference is:" + ((n1/nn1)-(n2/nn2))+"/"+(gcf));
		
	}
	
	public static void getInput(){
		pln("Input first rational number");
		pln("Numerator: ");
		n1 = scn.nextInt();
		pln("Denomenator: ");
		d1 = scn.nextInt();
		pln("Input second rational number");
		pln("Numerator: ");
		n2 = scn.nextInt();
		pln("Denomenator: ");
		d2 = scn.nextInt();
		pln("Rational 1: " + n1+"/"+d1);
		pln("Rational 2: " + n2+"/"+d2);
		pln("--------------------------");
	}
	
	
	
	public static void pln(String s){
		System.out.println(s);
	}
	
	public static int gcf(int a, int b){
		for(int i = Math.min(a, b); i>=1; i--){
			if(a%i==0 && b%i==0){
				return i;
			}
		}
		return 1;
	}
}
