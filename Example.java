import java.lang.*; //Math class is defined in this package

class Calculator{

     double i;
	 double x = Math.sqrt(i);

}


class Example{

     public static void main(String args[]){
	 
	      Calculator a = new Calculator();
		  
		  a.i = 20;
		  System.out.println("Square root of " + a.i + " is " + a.x);
	 
	 }

}