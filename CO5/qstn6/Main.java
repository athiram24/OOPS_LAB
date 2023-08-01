package qstn9;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Main extends Applet implements  ItemListener  
{
	int n;
	Choice ch;
	public Main()
	{
		ch = new Choice();
		ch.addItem("Select the choice:");
		ch.addItem("Rectangle");
		ch.addItem("Triangle");
		ch.addItem("Circle");
		ch.addItemListener(this);
		add(ch);	
	}
	public void paint(Graphics g)
	{
		if(n==1)
		{
			g.setColor(Color.red);
			g.fillRect(100, 200,100, 50);
		}
		
		else if(n==2)
		{
			g.setColor(Color.yellow);
			int[]x = {100,200,300};
			int[]y = {200,100,200};
			g.fillPolygon(x,y,3);
		}
		else if(n==3)
		{
			g.setColor(Color.orange);
			g.fillOval(100, 200, 100, 100);
			
		}
		else
		{
			
		}
		
	}
	

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		n = ch.getSelectedIndex();
		repaint();
		
	}	
}