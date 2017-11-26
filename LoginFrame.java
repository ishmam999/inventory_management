import javax.swing.*;
import java.awt.event.*;

 class LoginFrame extends JFrame implements ActionListener
 {  
	 JFrame frame;// = new JFrame(); 
	 JLabel l1= new JLabel("WELCOME");
	 JLabel l2= new JLabel("USER ID");
	 JLabel l3= new JLabel("PASSWORD");
	 JLabel l4= new JLabel("FOR NEW ACCOUNT");
	 
	JButton b= new JButton("LOGIN");
	JButton b1= new JButton("Sign Up");
	 
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	
	
	public LoginFrame(JFrame frames)
	{	this.frame = frames;
		
		frame.add(l1);
		l1.setBounds(250,25,150,100);
		frame.add(l2);
		l2.setBounds(75,100,80,30);
		frame.add(l3);
		l3.setBounds(75,150,80,30);
		
		frame.add(t);
		t.setBounds(250,100,170,30);
		frame.add(t1);
		t1.setBounds(250,150,170,30);
		
		frame.add(b);
		b.setBounds(250,200,170,30);
		frame.add(b1);
		b1.setBounds(250,425,170,30);
		
		
		frame.add(l4);
		l4.setBounds(75,415,150,50);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{	
				Login l = new Login();
				
				if(l.verifylogininfo(t.getText(),t1.getText())==true){
					this.setLogFrameInvisible();
					UserFrame u= new UserFrame(frame);
				}
				else 
					JOptionPane.showMessageDialog(this,"Error");	
		}	
		
		if(e.getSource()==b1)
		{
			RegisterFrame r=new RegisterFrame(frame);
			
			this.setLogFrameInvisible();
		}
		
		
	}
	void setLogFrameInvisible(){

		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		
		b.setVisible(false);
		b1.setVisible(false);
	 
		t.setVisible(false);
		t1.setVisible(false);
	}
	
	 
 }