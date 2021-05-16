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
	 
	 x = a; // Set center x-coordinate
	 y = b; // Set center y-ccordinate
	 r = c; // Set radius
	 }
}
class Demonstration_38{

       public static void main(String args[]){
	       Circle c1 = new Circle(3.0, 4.0, 5.0);
		   Circle c2 = new Circle(-4.0, -5.0, 10.0);
		   
			System.out.println("Circumference Circle 1 " + c1.circumference());
			System.out.println("Area Circle 1 " + c1.area());	
            System.out.println("Circumference Circle 2 " + c2.circumference());
			System.out.println("Area Circle 2 " + c2.area());			
	   
	   }
}
