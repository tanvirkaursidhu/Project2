/* Encapsulation: Defining a class with method */
class Point{
   int x;
   int y;
   
   void setPoint(){
   
     x = 10;
	 y = 20;
   }
}
// definition of another class. This is a main class

class Demonstration_35{
       
         public static void main(String args[]){
            
			 Point p = new Point();
			 
			 p.setPoint();
			
			 System.out.println(" x = " + p.x);
			 System.out.println(" y = " + p.y);
         }
}		 