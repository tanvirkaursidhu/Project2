import java.applet.*;
import java.awt.*;

public class Demonstration_23 extends Applet{

          /* To resize an applet window use,
		  *  void resize(int x, int y).
		  */

          public void init(){
		  
		    resize(500, 500);
		  }
		  
          public void paint(Graphics g){
		    g.drawString("Hello World", 50, 50);
			}
}