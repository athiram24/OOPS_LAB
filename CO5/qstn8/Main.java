package qstn11;
import java.awt.*;
import java.awt.event.*;
public class Main extends Frame implements MouseListener, MouseMotionListener, WindowListener
{
	
	Main()
	{
		setSize(600,400);
		setLayout(null);
		setVisible(true);
	
		addMouseListener(this);
		addWindowListener(this);
		addMouseMotionListener(this);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
		System.out.println("Window Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
			System.out.println("Window Closing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
	
		System.out.println("Window CLosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("window Iconified:");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	
		System.out.println("window Deiconified:");
		
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("window Activated:");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("window Deactivated:");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Mouse dragged:"+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		System.out.println("Mouse moved at: "+e.getX()+","+e.getY());
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
		System.out.println("Mouse Clicked at: "+e.getX()+","+e.getY());
		
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		
		System.out.println("Mouse pressed at: "+e.getX()+","+e.getY());
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		
		System.out.println("Mouse released at: "+e.getX()+","+e.getY());
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	
		System.out.println("Mouse entered at: "+e.getX()+","+e.getY());
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println("Mouse exited at: "+e.getX()+","+e.getY());
		
		
		
	}
	public static void main(String a[])
	{
		new Main();
		
	}
	
}