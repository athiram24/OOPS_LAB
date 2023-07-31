package qstn6;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends Applet implements MouseListener
{
	private Color doorColor;
	public void init()
	{
	doorColor = Color.blue;
	addMouseListener(this);
		
	}
	public void paint(Graphics g)
	{
		setBackground(Color.white);
		g.setColor(Color.gray);
		g.fillRect(100, 200, 200, 200);
		int [] xpoints = {100,200,300};
		int [] ypoints = {200,100,200};
		g.setColor(Color.red);
		g.fillPolygon(xpoints, ypoints, 3);
		g.setColor(doorColor);
		g.fillRect(160, 300, 80, 100);
		
		
		
	}
	 public void mouseClicked(MouseEvent e)
	 {
		 if(e.getX()>=160 &&e.getX()<=240 && e.getY()>=300 &&e.getY()<=400)
		 {
			 doorColor = doorColor.equals(Color.blue)?Color.red:Color.blue;
			 repaint();
		 }
		
		 
	 }
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	
	
	
	
	
	
	
	
	
}