// The following program snippet shows how to read and write to console
// Edit Demonstration_46.java

import java.util.*;

class Demonstration_46{

         public static void main(String args[]){

          System.out.println(" Enter the radius: ");
		  
		  Scanner scnr = new Scanner(System.in);
		  
		  double radius = scnr.nextDouble();
		  
		  double area = 3.14159 * radius * radius;
		  
		  System.out.println(" Area is: " + area);
    
         }



}