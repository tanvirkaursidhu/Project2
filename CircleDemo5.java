
class Circle{
	

     double x,y; 
	 double r; 

	 double circumference(){
	     return 2*3.14*r;
	 }
	 
	 double area(){
	     return (22/7)*r*r;
	 }
	 
	 Circle(double x, double  y, double r){
	 
	 this.x = x; // Set center x-coordinate
	 this.y = y; // Set center y-ccordinate
	 this.r = r; // Set radius
	 }
	 
}	 
	  
	
class CircleDemo5{

       public static void main(String args[]){
	      
		   Circle c1 = new Circle(-4.0, -5.0, 10.0);
		   
			
            System.out.println("Circumference " + c1.circumference());
			System.out.println("Area " + c1.area());			
	   
	   }
}
