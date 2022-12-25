package calory.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Improve extends JFrame implements ActionListener {
	
	// فكرة البرنامج حساب السعرات بالواجهات 
	//66.47 + (13.75 * weight in kg ) + (5.003 * height in cm ) - (6.755 * age in years)
	
	JTextField text_field1 = new JTextField(); // مربع النص حق ادخال الوزن 
	JTextField text_field2 = new JTextField(); // مربع النص حق ادخال الطول
	JTextField text_field3 = new JTextField(); // مربع النص حق ادخال العمر
	JTextField text_field4 = new JTextField(); //  مربع النص حق عرض الناتج

	JPanel panel = new JPanel(); // اللوحة الموجودة في الواجهة
	
	JLabel label = new JLabel("حساب السعرات");
	JLabel label1 = new JLabel("ادخل الوزن");
	JLabel label2 = new JLabel("ادخل الطول");
	JLabel label3 = new JLabel("ادخل العمر");
	
	JButton button = new JButton("حساب");
	JButton button_out = new JButton("خروج");
	
	public Improve()
	{
		  this.setSize(450,650);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setLayout(null);
		  this.setResizable(false);
		  this.getContentPane().setBackground(new Color(0x780373));
		  
		  button.setBounds(30,410,90,40);
		  button.addActionListener(this);
		  
		  button_out.setBounds(250,470,90,40);
		  
		  label.setBounds(40,50,100,30);
		  label.setFont(new Font("My Boil",Font.PLAIN,25));
		  label.setForeground(Color.white);
		  
		  panel.setSize(450,150);
		  panel.add(label);
		  panel.setBackground(Color.red);
		  
		  label1.setBounds(250,200,100,40);
		  label1.setForeground(Color.white);
		  
		  label2.setBounds(250,270,200,40);
		  label2.setForeground(Color.white);
		  
		  label3.setBounds(250,340,100,40);
		  label3.setForeground(Color.white);
		  
		  text_field1.setBounds(30,200,200,40);
		  text_field2.setBounds(30,270,200,40);
		  text_field3.setBounds(30,340,200,40);
		  text_field4.setBounds(130,410,200,40);
		  text_field4.setForeground(Color.green);
		  
		  this.add(panel);
		  this.add(label1);
		  this.add(label2);
		  this.add(label3);
		  this.add(text_field1);
		  this.add(text_field2);
		  this.add(text_field3);
		  this.add(text_field4);
		 
		  this.add(button);
		  this.add(button_out);
		  this.setVisible(true);
		  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) 
		{
			
		try 
		{
            double weight_1 = Double.valueOf(text_field1.getText());
            //weight_1 الرقم الذي يدخله المستخدم في مربع النص سوف يخزن في المتغير
            
            double height_2 = Double.valueOf(text_field2.getText());
            // 
            double age_3 = Double.valueOf(text_field3.getText());
            
            text_field4.setText("" + (66.47 + (13.75 * weight_1) + (5.003 * height_2 ) - (6.755 * age_3) ));
		}
		catch(Exception ex) 
		{
			
		}
		}
		
		else if(e.getSource() == button_out) 
		{
			int close = JOptionPane.showConfirmDialog(null,"اختيار", "هل تريد الخروج", JOptionPane.YES_NO_CANCEL_OPTION);
			
			
			if(close == 0)
			{
				System.exit(0);
			}
		}
	}

}
