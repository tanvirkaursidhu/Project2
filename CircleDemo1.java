// A program that uses circle class
// Call this file as CircleDemo1.java
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


// The following class declare an object of type circle
class CircleDemo1{

       public static void main(String args[]){
	       Circle c = new Circle();
		    c.x = 0.0;
			c.y = 0.0;
			c.r = 5.0;
			System.out.println("Circumference" + c.circumference());
			System.out.println("Area" + c.area());	   
	   
	   }
}	   
	   