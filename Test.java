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
