// The program demonstrates how to take Input using scanner class
// Edit Demonstration_45.java
import java.util.*;

public class Demonstration_45{

       public static void main(String args[]){
	    
		  Scanner scnr = new Scanner(System.in);
		  // Calculating the maximum two numbers
		  System.out.println("Please enter two numbers to find maximum of two");
		  
		  int a = scnr.nextInt();
		  
		  int b = scnr.nextInt();
		  
		  if(a>b){
		  
		  System.out.printf("Between %d and %d, maximum is %d \n", a, b, a);
	   
	      }
		  
		  else{
		  
		  System.out.printf("Between %d and %d, maximum is %d \n", a, b, b);
		  
		  }
	   
	   
	   
	   
	   }


}