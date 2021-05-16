// A program that uses circle class
// Call this file as Demonstration_32.java
class Circle{

     double x,y; // The coordinates of the center
	 double r; // The radius
	 
	 // Method that return circumference
	 double circumference(){
	     return 2*3.14*r;
	 }
	 
	 // Method that return area
	 double area(){
	     return (22/7)*r*r;
	 }
}


// The following class declare multiple objects of type circle
class Demonstration_32{

       public static void main(String args[]){
	       Circle c1 = new Circle();
		   Circle c2 = new Circle();
		   // Initialize the circles
		    c1.x = 3.0;
			c1.y = 4.0;
			c1.r = 5.0;
			c2.x = -4.0;
			c2.y = -8.0;
			c2.r = 10.0;
			System.out.println("Circumference Circle 1 " + c1.circumference());
			System.out.println("Area Circle 1 " + c1.area());	
            System.out.println("Circumference Circle 2 " + c2.circumference());
			System.out.println("Area Circle 2 " + c2.area());			
	   
	   }
}	   
	   