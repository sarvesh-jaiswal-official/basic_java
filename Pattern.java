import java.applet.*;
import java.awt.*;

public class Pattern extends Applet
{
	public void paint(Graphics g)
	{
		int row, col, x, y;
		for(row=0; row<8; row++)
		{
			for(col=0; col<8; col++)
			{
				x = col*50;
				y = row*50;
				if((row%2)==(col%2))
				{
					g.setColor(Color.white);
				}
				else
				{
					g.setColor(Color.black);
					g.fillRect(x,y,50,50);
				}
			}
		}
	}
}