package qstn5;
import java.awt.*;
import java.awt.event.*;
public class Main extends Frame 
{
	TextField[] txt;
	Label result;
	
	Main()
	{
		setTitle("Marks caculator:");
		setVisible(true);
		setSize(300,200);
		setLayout(new FlowLayout());
		txt = new TextField[5];
		for(int i=0;i<5;i++)
		{
			Label l = new Label("Subject" +(i+1)+":");
			txt[i] = new TextField(10);
			add(l);
			add(txt[i]);
		}
		Button btn = new Button("Calculate");
		result = new Label();
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int tot =0;
				for(int i=0;i<5;i++)
				{
					int marks = Integer.parseInt(txt[i].getText());
					tot = tot + marks;
							
				}
				//double percentage = tot/(500.0)*100;
				double percentage = (double) tot / 500 * 100;
				if(percentage>50)
				{
					//result.setText("passed:");
					//result.setText("\uD83D\uDE00");
					  result.setText("\u263A");
					
				}
				else
				{
					
					//result.setText("failed:");
					//result.setText("\uD83D\uDE41");
					result.setText("\u2639");
				}	
			}
	});
		
		
		
	
		add(btn);
		add(result);
	     // Handle the window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        //setVisible(true);
		}
	public static void main(String a[])
	{
		new Main();
	
	}
	

}
