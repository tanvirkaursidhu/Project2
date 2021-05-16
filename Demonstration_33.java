class Circle{
	

     double x,y; 
	 double r; 

	 double circumference(){
	     return 2*3.14*r;
	 }
	 
	 double area(){
	     return (22/7)*r*r;
	 }
}
class Box{

     double depth; 
	 double width;
     double height;	 

	 double area(){
	     double a;
		 a = (depth*width + width*height + height*depth) * 2;
	     return a;
	 }
	 
	 double volume(){
	     double v;
		 v = depth * width *height;
	     return v;
	 }
}


// Declaring objects of type Circle and Box
class Demonstration_33{

       public static void main(String args[]){
	       Circle c = new Circle();
		   Box b = new Box();
		   
		    c.x = 3.0; c.y = 4.0; c.r = 5.0 ;
            b.width = 3.0; b.depth = 4.0; b.height = 5.0; 			
			System.out.println("Circumference Circle " + c.circumference());
			System.out.println("Area Circle " + c.area());	
            System.out.println("Area of Box " + b.area());
			System.out.println("Volume of Box " + b.volume());			
	   
	   }
}
// Save this file as MultiClassDemo.java	   
	   