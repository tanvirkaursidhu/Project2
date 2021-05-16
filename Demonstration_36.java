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

class Demonstration_36{
       
         public static void main(String args[]){
            
			 Point p = new Point();
			 
			 p.setPoint(15, 20);
			
			 System.out.println(" x = " + p.x);
			 System.out.println(" y = " + p.y);
         }
}		 