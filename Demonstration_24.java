import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Demonstration_24 extends Applet{
          
			
			public void init(){
			// Here we change the default grey color background of an
			// applet to yellow background.
			
			setBackground(Color.RED);
			resize(400, 400);
			}
			
			public void paint(Graphics g){
				
				g.drawString("Applet background example", 0, 50);
			}

}