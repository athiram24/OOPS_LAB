package qstn10;
import java.awt.*;
import java.awt.event.*;
public class Main extends Frame implements KeyListener
{
	Main()
	{
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		addKeyListener(this);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int k = e.getKeyCode();
		System.out.println("Key released:"+KeyEvent.getKeyText(k));
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();
		System.out.println("key Pressed:"+KeyEvent.getKeyText(k));
		
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char k = e.getKeyChar();
		System.out.println("Key typed:"+k);
		
	}
	public static void main(String a[])
	{
		new Main();
	}
}