/* Encapsulation: Defining a class with method */
class Point{
   int x;
   int y;
   
   void setPoint(int a, int b){
   
     x = a;
	 y = b;
   }
}
// definition of another class. This is a main class

class Demonstration_37{
       
         public static void main(String args[]){
            
			 Point p1 = new Point();
			 Point p2 = new Point();
			 
			 p1.setPoint(15, 20);
			 p2.setPoint(0, 0);
			
			 System.out.println(" x = " + p1.x);
			 System.out.println(" y = " + p1.y);
			 System.out.println(" x = " + p2.x);
			 System.out.println(" y = " + p2.y);
         }
}		 