package qstn1;

		import java.applet.Applet;
		import java.awt.Color;
		import java.awt.Graphics;

		public class Main extends Applet
		{
		    @Override
		    
		    public void paint(Graphics g) {
		        // Set the background color of the applet
		        setBackground(Color.white);

		        // Draw a circle
		        int circleX = 50;
		        int circleY = 50;
		        int circleWidth = 100;
		        int circleHeight = 100;
		        g.setColor(Color.blue);
		        g.drawOval(circleX, circleY, circleWidth, circleHeight);

		        // Draw a rectangle
		        int rectX = 200;
		        int rectY = 50;
		        int rectWidth = 100;
		        int rectHeight = 150;
		        g.setColor(Color.red);
		        g.drawRect(rectX, rectY, rectWidth, rectHeight);

		        // Draw a line
		        int lineX1 = 400;
		        int lineY1 = 50;
		        int lineX2 = 500;
		        int lineY2 = 200;
		        g.setColor(Color.green);
		        g.drawLine(lineX1, lineY1, lineX2, lineY2);
		    }
		

		
		
		
		
		
		
		
	}
	
	
	
	
	
	


