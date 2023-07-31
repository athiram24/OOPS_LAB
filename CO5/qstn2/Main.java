package qstn4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame implements ActionListener
{
	//private Color Blue;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b;
	Main()
	{
	
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(1000,600);
		l1 = new Label("Number1");
		//l1.setBounds(10,50,150,20);
		t1 = new TextField(10);
		l2 = new Label("Number2:");
		//l2.setBounds(10,80,150,20);
		t2 = new TextField(10);
		
		l3 = new Label("Number3:");
		//l3.setBounds(10,110,150,20);
		t3 = new TextField(10);
		//t1.setBounds(180,50,100,20);
		
		//t2.setBounds(180,80,100,20);
		
		//t3.setBounds(180,110,100,20);
		
		b = new Button("CLICK ME");
		b.addActionListener(this); 
		
			
		
		//b.setBackground(Blue);
		//b.setBounds(200,180,100,50);
		
		l4 = new Label("-------------------------------");
		
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		add(l4);
			
	}
	

	
	public static void main(String a[])
	{
		new Main();
		
	}



	@Override
	
		public void actionPerformed(ActionEvent e)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			String s3 = t3.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = Integer.parseInt(s3);
			int max = Math.max((Math.max(a, b)),c);
			
			l4.setText("Maximum:"+max);
			
		}
		
		
	}
	

	

