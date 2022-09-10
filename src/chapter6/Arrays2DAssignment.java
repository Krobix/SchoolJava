package chapter6;

/*

 * HW-2D arrays, For this assignment you need to write and test code for

 * each of the following methods. Make sure to test code for each method as

 * you are working through these methods. This will be a graded assessment.

 * Please make sure to email yourself this code as you will be using this

 * code in order to do next set of programs.

 */

public class Arrays2DAssignment {

 

       // Use this method to keep testing every method as you write them.

       public static void main(String[] args) {

 

       }

 

       /*

        * #1 This method will initialize N in row major order with the integer

        * values in range start-end inclusive. Precondition: end is greater than

        * start

        */

       public static void initRow(int[][] n, int start, int end) {
    	   int count=start;
           for(int i=0; i<n.length; i++) {
        	   for(int j=0; j<n[i].length; j++) {
        		   n[i][j] = count++;
        		   if(count>=end) return;
        	   }
           }

       }

 

       /*

        * #2 This method will initialize N in column major order with the integer

        * values in range start-end inclusive. Precondition: end is greater than

        * start

        */

       public static void initColumn(int[][] n, int start, int end) {
    	   
    	   int count=start;
           for(int i=0; i<n[0].length; i++) {
        	   for(int j=0; j<n.length; j++) {
        		   n[j][i] = count++;
        		   if(count>=end) return;
        	   }
           }

       }

 

       /*

        * #3 Outputs N in row by column format, with all row elements on the same

        * line separated by tabs.Example 2 4 7 4 7 0

        */

       public static void output2D(int[][] n) {
    	   for(int i=0; i<n.length;i++) {
    		   for(int j=0; j<n[0].length; j++) {
    			   System.out.print(""+n[i][j]+"    ");
    		   }
    		   System.out.println();
    	   }
             

       }

 

       /*

        * #4 Returns an int array of size N.length. Each element of this array will

        * represent the sum of all the elements of corresponding row of the 2D

        * input array N.

        */

       public static int[] sumRow(int[][] n) {

              int[] rowSum = new int[n.length];
              
              for(int i=0; i<n.length; i++) {
            	  int sum=0;
            	  for(int j=0; j<n[i].length; j++) {
            		  sum += n[i][j];
            	  }
            	  rowSum[i] = sum;
              }

              return rowSum;

       }

 

       /*

        * #5 Returns an int array of size N[0].length. Each element of this array

        * will represent the sum of all the elements of corresponding column of the

        * 2D input array N.

        */

       public static int[] sumCol(int[][] n) {

              int[] colSum = new int[n[0].length];

              for(int i=0; i<n[0].length; i++) {
            	  int sum=0;
            	  for(int j=0; j<n.length; j++) {
            		  sum += n[j][i];
            	  }
            	  colSum[i] = sum;
              }

              return colSum;

       }

 

       /*

        * #6 sumRC will return sum of all of the elements of row or column as

        * determined by rc, located at the location determined by index.

        */

       public static int sumRC(int[][] n, char rc, int index) {

              int sum = 0;

              if (rc == 'c') {

            	  for(int i=0; i<n.length; i++) {
            		  sum += n[i][index];
            	  }

              } else if (rc == 'r') {

            	  for(int i=0; i<n.length; i++) {
            		  sum += n[index][i];
            	  }

              }

 

              return sum;

       }

 

       /*

        * #7 Returns total number of elements in the 2D whose value is above val.

        */

       public static int countElementsAbove(int[][] n, int val) {

              int count = 0;

              for(int i=0; i<n.length; i++) {
            	  for(int j=0; j<n[0].length; j++) {
            		  if(n[i][j]>val) count++;
            	  }
              }

              return count;

       }

 

       /*

        * #8 Converts 2D array to 1D, filling one row at a time going from left to

        * right

        */

       public static int[] convert2Dto1DRowMajor(int[][] n) {
    	   
    	   int[] o = new int[n.length*n[0].length];
    	   
    	   for(int i=0; i<n.length; i++) {
         	  for(int j=0; j<n[0].length; j++) {
         		  o[j+(i*n[0].length)] = n[i][j];
         	  }
    	   }  

              return o; // replace this statement with you own

       }

 

       /*

        * #9 Converts 2D array to 1D, filling from one column at a time going from

        * top to bottom

        */

       public static int[] convert2Dto1DColumnMajor(int[][] n) {

 

    	   int[] o = new int[n.length*n[0].length];
    	   
    	   for(int i=0; i<n[0].length; i++) {
         	  for(int j=0; j<n.length; j++) {
         		  o[i+(j*n[0].length)] = n[j][i];
         	  }
    	   }  

              return o; // replace this statement with you own


       }

 

       /*

        * #10 Converts 2D array to 1D, filling rows continuously. First going from

        * left to right, then right to left and then repeating the same pattern

        * over and over

        */

       public static int[] convert2Dto1DContinousRow(int[][] n) {
    	   	int[][] n2 = n.clone();
    	   	for(int i=1; i<n.length; i+=2) {
    	   		for(int j=n[0].length-1; j>=0; j--) {
    	   			n2[i][n[0].length-j]=0;
    	   		}
    	   	}
 

              return new int[0]; // replace this statement with you own

       }

 

       /*

        * #11 Converts 2D array to 1D, filling columns continuously. First going

        * from top to bottom of the first column, then bottom to top of second

        * column and then from top to bottom of the 3rd Column

        */

       public static int[] convert2Dto1DContinousColumn(int[][] n) {

 

              return new int[0]; // replace this statement with you own

       }

 

       /*

        * #12 This method receives an 2D int array and returns a 1D array of size

        * 2, representing the index of the minimum value found in this array.

        * minI[0]->row, minI[1] -> column.

        */

       public static int[] findMinIndex(int[][] n) {

              int[] minI = new int[2];

 

              return minI;

       }

 

       /*

        * #13 This method swaps the element stored at loc1 with the element stored

        * at loc2 in N array.

        */

       public static void swap(int[][] n, int[] loc1, int[] loc2) {

 

       }

 

}