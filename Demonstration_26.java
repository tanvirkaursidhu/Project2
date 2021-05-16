import java.applet.Applet;
import java.awt.Graphics;

public class Demonstration_26 extends Applet{
          
		     
			 int x = 0;
			 int y = 0;
			 String msg = "";
			 
			 
			 public void init(){
			 
			 x = Integer.parseInt(getParameter("xPosition"));
			 y = Integer.parseInt(getParameter("yPosition"));
			 msg = getParameter("msg");
			 }
			 
			 public void paint(Graphics g){
	
				g.drawString(msg, x, y);
			
			 }

}