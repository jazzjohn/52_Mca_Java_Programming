import java.awt.*;
import java.applet.*;

/*
<applet code="drawShapes" width=300 height=250>
</applet>
*/

public class drawShapes extends Applet{
	public void paint(Graphics g){
		g.fillOval(115,30,80,80);
		g.drawLine(50,125,250,125);
		g.fillRect(125,145,70,75);
	}
}