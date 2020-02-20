import java.applet.*;
import java.awt.*;

public class AppletDemo1 extends Applet
{
	public void init()
	{
		Font f = new Font("Times New Roman",Font.BOLD|Font.ITALIC,30);
		setFont(f);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet",50,100);
	}
}