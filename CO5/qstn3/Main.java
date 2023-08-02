package qstn8;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends Frame implements ActionListener {
	Label l1,l2,l3,l4,l5,l6;
	Button b;
	TextField t1,t2,t3,t4,t5;
	
	Main()
	{
		setVisible(true);
		setLayout(null);
		setSize(1000,600);
		l1 = new Label("Mark1:");
		l1.setBounds(20, 100, 100, 30);
		l2 = new Label("Mark2:");
		l2.setBounds(20, 150, 100, 30);
		l3 = new Label("Mark3:");
		l3.setBounds(20, 200, 100, 30);
		l4 = new Label("Mark4:");
		l4.setBounds(20, 250, 100, 30);
		l5 = new Label("Mark5:");
		l5.setBounds(20, 300, 100, 30);
		
		
		l6 = new Label("---");
		l6.setBounds(20, 350, 100, 30);
		
		t1 = new TextField();
		t1.setBounds(130,100,100,30);
		t2 = new TextField();
		t2.setBounds(130,150,100,30);
		t3 = new TextField();
		t3.setBounds(130,200,100,30);
		t4 = new TextField();
		t4.setBounds(130,250,100,30);
		t5 = new TextField();
		t5.setBounds(130,300,100,30);
		b = new Button("FIND MARK");
		b.setBounds(80,400,100,50);
		b.addActionListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//int p;
		
		String s1 = t1.getText();
		String s2 = t2.getText();
		String s3 = t3.getText();
		String s4 = t4.getText();
		String s5 = t5.getText();
		if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty())
		{
			l6.setText("Enter marks");
		}else {
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = Integer.parseInt(s3);
		int d = Integer.parseInt(s4);
		int f = Integer.parseInt(s5);
		double p = ((a+b+c+d+f)/500.00)*100;
		int F = (int)p;
		 
		 
		 if(p<50)
		 {
			 l6.setText(String.valueOf(F));
			 repaint();
			 
		 }
		 else
			 
			 l6.setText(String.valueOf(F));
		 	 repaint();
		
		
		}
		
		
	}
	public void paint (Graphics g)
	{
		
		int s = Integer.parseInt(l6.getText());
	 
		if(s>50)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(80, 480, 50, 50);
			g.setColor(Color.BLACK);
			g.fillOval(88,490,5,5);
			g.fillOval(115,490,5,5);
			g.setColor(Color.red);
			g.fillArc(90, 500, 25,15,0,-180);
		
		}
		else{
			g.setColor(Color.YELLOW);
			
			g.fillOval(80, 480, 50, 50);
			g.setColor(Color.black);
			g.fillOval(88,490,5,5);
			g.fillOval(115,490,5,5);
			g.setColor(Color.red);
			g.fillArc(90,500,25,25,0,180);
			
			
		
			
			
		}
		
		
	}
	
	
	public static void main(String a[])
	{
		new Main();
	}

}
