import javax.swing.*;
import java.awt.event.*;

 class RegisterFrame extends JFrame implements ActionListener
 {	
	JFrame frame ;//= new JFrame();
	JLabel l1= new JLabel("CREATE ACCOUNT");
	JLabel l2= new JLabel("USER ID");
	JLabel l3= new JLabel("USER NAME");
	JLabel l4= new JLabel("PASSWORD");

	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	
	JButton b = new JButton("SUBMIT");
	JButton b1 = new JButton("BACK");
	
	public RegisterFrame(JFrame frame)
	{
		this.frame = frame;
		
		frame.add(l1);
		l1.setBounds(150,20,200,20);
		frame.add(l2);
		l2.setBounds(50,70,80,20);
		frame.add(l3);
		l3.setBounds(50,100,80,20);
		frame.add(l4);
		l4.setBounds(50,130,80,20);
		
		
		frame.add(t);
		t.setBounds(210,70,170,20);
		frame.add(t1);
		t1.setBounds(210,100,170,20);
		frame.add(t2);
		t2.setBounds(210,130,170,20);
		
		frame.add(b);
		b.setBounds(300,260,80,30);
		frame.add(b1);
		b1.setBounds(300,300,80,30);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b){
			
			Register r = new Register();
				if(r.verifyregisterinfo(t.getText(),t1.getText(),t2.getText())==true){
					JOptionPane.showMessageDialog(this,"ACCOUNT CREATED");
					this.setRegFrameInvisible();
				}
							
			}
		
		else if(e.getSource()==b1){
			setRegFrameInvisible();
		}
	}
	
	public void setRegFrameInvisible()
	{
			l1.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			
			t.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			
			b.setVisible(false);
			b1.setVisible(false);
			
			LoginFrame l=new LoginFrame(frame);
			
			
	}

}
 
