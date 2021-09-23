import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="KeyEvents" width=450 height=450>
</applet>
*/

public class KeyEvents extends Applet 
implements KeyListener{

	String msg="";
	int x=10,y=20;

	public void init(){
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke){
		showStatus("key down");
	}

	public void keyReleased(KeyEvent ke){
		showStatus("key up");
	}

	public void keyTyped(KeyEvent ke){
		msg = msg+ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}

	