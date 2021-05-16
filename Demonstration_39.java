/* Demonstration of constructor overloading */
// Edit Demonstration39.java

class Circle{
	

     double x,y; 
	 double r; 

	 double circumference(){
	     return 2*3.14*r;
	 }
	 
	 double area(){
	     return (22/7)*r*r;
	 }
	 
	 Circle(double a, double  b, double c){
	 
	 x = a; y = b; r = c;
	 }
	 
	 Circle(double c){
	 
	 x = 0; y = 0; r = c; 
	 }
	 
	 Circle(Circle c){
	 
	 x = c.x; y = c.y; r = c.r;
	 }
	 
	 Circle(){
	 
	 x = 0; y = 0; r = 1.0;
	 }
	 
}
class Demonstration_39{

       public static void main(String args[]){
	       Circle c1 = new Circle(3.0, 4.0, 5.0);
		   Circle c2 = new Circle(5.0);
		   Circle c3 = new Circle(c1);
		   Circle c4 = new Circle();
		   
			System.out.println("Circumference Circle 1 " + c1.circumference());
			System.out.println("Area Circle 1 " + c1.area());	
            System.out.println("Circumference Circle 2 " + c2.circumference());
			System.out.println("Area Circle 2 " + c2.area());	
            System.out.println("Circumference Circle 3 " + c3.circumference());
			System.out.println("Area Circle 3 " + c3.area());		
            System.out.println("Circumference Circle 4 " + c4.circumference());
			System.out.println("Area Circle 4 " + c4.area());					
	   
	   }
}
