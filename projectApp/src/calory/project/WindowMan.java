package calory.project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowMan extends JFrame implements ActionListener{

	
	//الفكرة تطبيق يحسب السعرات 
	//66.47 + (13.75 * weight in kg ) + (5.003 * height in cm ) - (6.755 * age in years)
	
	Panel panel = new Panel();
	
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JTextField text4 = new JTextField();
	JButton but_sum = new JButton("احسب");
	JButton but_cancel = new JButton("خروج");
	JLabel label_sum = new JLabel();
	
	public double man1 = 66.47;
	public double man2 = 13.75;
	public double man3 = 5.003;
	public double man4 = 6.755;
	
	public int weight;
	public int height;
	public int age;
	public int sum;
	
	public WindowMan()
	{
	  this.setSize(450,650);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(null);
	  this.getContentPane().setBackground(new Color(0x780373));
	  
	  but_sum.setBounds(20,410,80,40);
	  but_sum.addActionListener(this);
	  
	  but_cancel.setBounds(350,540,80,40);
	  but_cancel.addActionListener(this);
	  
	  addText();
	  
	  this.add(panel);
	  this.add(text1);
	  this.add(text2);
	  this.add(text3);
	  this.add(text4);
	  this.add(but_sum);
	  this.add(but_cancel);
	  this.setVisible(true);
	  
	}
	
	String numb= String.valueOf(weight);
    String numb1 = String.valueOf(height);
    String numb2 = String.valueOf(age);
	
	public void addText()
	{
		
        
		  text1.setBounds(20,200,180,40);
		  text1.setForeground(Color.green);
		  text1.setFont(new Font("My Boil",Font.PLAIN,15));
		  text1.setText(numb);
		  
		  text2.setBounds(20,270,180,40);
		  text2.setForeground(Color.green);
		  text2.setFont(new Font("My Boil",Font.PLAIN,15));
		  text2.setText(numb1);
		  
		  text3.setBounds(20,340,180,40);
		  text3.setForeground(Color.green);
		  text3.setFont(new Font("My Boil",Font.PLAIN,15));
		  text3.setText(numb2);
		  
		  text4.setBounds(110,410,160,40);
	      text4.setEditable(false);
	}
	//String sw = text1.getText();//sw = sum weight 
	//String sh = text2.getText();// sh = sum height
	//String sa = text3.getText(); // sa = sum age 
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == but_cancel)
		{
			int close = JOptionPane.showConfirmDialog(null,"اختيار", "هل تريد الخروج", JOptionPane.YES_NO_CANCEL_OPTION);
			
		
			if(close == 0)
			{
				System.exit(0);
			}
		}
		
			
			else if(e.getSource() == but_sum)
			{
			  
			   //label_sum.setForeground(Color.black);
			  //this.setWeight(80);
			  //this.setHeight(180);
			  //this.setAge(26);
			   String result = String.valueOf(66.47 + (13.75 * this.weight) + (5.003 * this.height ) - (6.755 * this.age));
			   
				text4.setText("" + result);
				
			}
			
	
		
	
	}
	
	
}
