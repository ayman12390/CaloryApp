package calory.project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {

	JLabel label = new JLabel("حساب السعرات");
	
	public Panel()
	{
		// panel.add(label1);
		
		  label.setFont(new Font("My Boil",Font.PLAIN,25));
		  label.setForeground(Color.white);
		  //label.contains(20, 200);
		  
		  this.add(label);
		  this.setSize(450, 150);
		  this.setBackground(Color.red);
	}
}
