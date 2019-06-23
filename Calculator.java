
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator
{
	 static JLabel num1=new JLabel("Number1");
	 static JLabel num2=new JLabel("Number2");
	 static JTextField num1_tf=new JTextField();
	 static JTextField num2_tf=new JTextField();
	 static JButton add=new JButton("Add");
	 static JButton subtract=new JButton("Subtract");
	 static JButton multiply=new JButton("Multiply");
	 static JButton divide=new JButton("Divide");
     static JLabel ans =new JLabel("Answer");
	 static JTextField ans_tf=new JTextField();
	 static JLabel msg =new JLabel("msg");
	 
	public static void main(String[]args)
	{
		JFrame frame=new JFrame("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,100,700,500);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		num1.setBounds(50,50,70,25);
		num2.setBounds(50,90,70,25);
		num1_tf.setBounds(130,50,100,25);
		num2_tf.setBounds(130,90,100,25);
		add.setBounds(20,130,80,30);
		subtract.setBounds(110,130,100,30);
		multiply.setBounds(230,130,80,30);
		divide.setBounds(330,130,80,30);
		ans.setBounds(50,180,200,25);
		ans_tf.setBounds(130,180,100,25);
		msg.setBounds(50,215,300,25);
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				add_action(event);
				
			}
			
		});
		
			subtract.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				subtract_action(event);
				
			}
			
		});
		
			multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				multiply_action(event);
				
			}
			
		});
		
			divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				divide_action(event);
				
			}
			
		});
		
		
		
		
		c.add(num1);
		c.add(num2);
		c.add(num1_tf);
		c.add(num2_tf);
		c.add(add);
		c.add(subtract);
		c.add(multiply);
		c.add(divide);
		c.add(ans);
		c.add(ans_tf);
		c.add(msg);
	}
	public static void add_action(ActionEvent event)
	{
		String s1=num1_tf.getText();//user input value get assign in s1
		String s2=num2_tf.getText();
		float n1=0;
		float n2=0;
		try
		{
		n1=Float.parseFloat(s1);	//to convert string into float
		n2=Float.parseFloat(s2);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		float an=n1+n2;
		String ans_str=Float.toString(an);   //convet float to string
		ans_tf.setText(ans_str);
	
	}
		public static void subtract_action(ActionEvent event)
	{
		String s1=num1_tf.getText();//user input value get assign in s1
		String s2=num2_tf.getText();
		float n1=0;
		float n2=0;
		try
		{
		n1=Float.parseFloat(s1);	//to convert string into float
		n2=Float.parseFloat(s2);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		float an=n1-n2;
		String ans_str=Float.toString(an);   //convet float to string
		ans_tf.setText(ans_str);
	
	}
		public static void multiply_action(ActionEvent event)
	{
		String s1=num1_tf.getText();//user input value get assign in s1
		String s2=num2_tf.getText();
		float n1=0;
		float n2=0;
		try
		{
		n1=Float.parseFloat(s1);	//to convert string into float
		n2=Float.parseFloat(s2);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		float an=n1*n2;
		String ans_str=Float.toString(an);   //convet float to string
		ans_tf.setText(ans_str);
	
	}
	
	
		public static void divide_action(ActionEvent event)
	{
		String s1=num1_tf.getText();//user input value get assign in s1
		String s2=num2_tf.getText();
		float n1=0;
		float n2=0;
		try
		{
		n1=Float.parseFloat(s1);	//to convert string into float
		n2=Float.parseFloat(s2);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		float an=n1/n2;
		String ans_str=Float.toString(an);   //convet float to string
		ans_tf.setText(ans_str);
	
	}


}