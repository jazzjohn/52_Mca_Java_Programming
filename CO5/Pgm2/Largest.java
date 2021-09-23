import java.awt.*;
import java.applet.*;

/*
<applet code="Largest" width=450 height=450>
<param name=num1 value=10>
<param name=num2 value=5>
<param name=num3 value=15>
</applet>
*/

public class Largest extends Applet{
	
	int largest=0,num1,num2,num3;
	public void init(){
		num1=Integer.parseInt(getParameter("num1"));
		num2=Integer.parseInt(getParameter("num2"));
		num3=Integer.parseInt(getParameter("num3"));
	}
	public void start(){
		if(num1>num2 && num1>num3){
			largest=num1;
		}
		else if(num2>num1 && num2>num3){
			largest=num2;
		}else{
			largest=num3;
		}
	}
	public void paint(Graphics g){
			g.drawString("Largest number:"+largest,200,200);
		}
}