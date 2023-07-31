package qstn7;
import java.awt.event.*;
import java.awt.*;

public class Main extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	TextField t1,t2,t3;
	Main()
	{
		setVisible(true);
		setLayout(null);
		setTitle("calculator");
		setLocation(700,500);
		setSize(400,400);
		
		
		
		l1 = new Label("First number:");
		l1.setBounds(10, 50, 100, 30);
		t1 = new TextField();
		t1.setBounds(120,50,100,30);
		
		
		l2 = new Label("Second number:");
		l2.setBounds(10,100,100,30);
		t2 = new TextField();
		t2.setBounds(120,100,100,30);
		
		l3 = new Label("Result:");
		l3.setBounds(10,250,100,30);
		t3 = new TextField();
		t3.setBounds(120,250,100,30);
		
		
		
		b1 = new Button("+");
		b1.setBounds(30,150,50,50);
		b1.addActionListener(this);
		
		b2 = new Button("-");
		b2.setBounds(90,150,50,50);
		b2.addActionListener(this);

		b3 = new Button("*");
		b3.setBounds(150,150,50,50);
		b3.addActionListener(this);

		b4 = new Button("/");
		b4.setBounds(210,150,50,50);
		b4.addActionListener(this);

		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		add(t3);
	this.addWindowListener(new WindowAdapter () {
		public void windowclosing(WindowEvent we)
		{
			System.exit(0);
		}
		
	});
	
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		if(e.getSource()== b1)
		{
			t3.setText(String.valueOf(n1+n2));
		}
		else if(e.getSource()== b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		else if(e.getSource()== b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
		else
		{
			if(n2==0)
			{
				throw new ArithmeticException();
			}
			else
			t3.setText(String.valueOf(n1/n2));
		}
		
	}
	
	public static void main(String a[])
	{
		new Main();
	}
	
}


