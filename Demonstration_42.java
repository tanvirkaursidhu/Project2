// A Java program to demonstrate working of printf()
// Edit Demonstration_42.java

class Demonstration_42{

       public static void main(String args[]){

        int x = 100;
        System.out.printf("Printing simple integer: x = %d\n", x);
		
		// this will print it upto 2 decimal places
		System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);
		
		float n = 5.2f;
		// automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to specific width: n = %.4f\n" , n);
		System.out.printf("Formatted to specific width: n = %2.1f\n" , n);
		
		// here number is formatted from right margin and occupies
		// width of 20 characters
		n = 2324435.3f;
		System.out.printf("Formatted to right margin : n = %20.4f\n", n);
		System.out.printf("Formatted to right margin : n = %6.2f\n", n);
	
      }

}