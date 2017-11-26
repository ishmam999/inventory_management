import javax.swing.*;
import java.awt.event.*;

 class UpdateFrame extends JFrame implements ActionListener
 {	
	JFrame frame ;//= new JFrame();
	JLabel l1= new JLabel("Update product");
	JLabel l2= new JLabel("ID");
	JLabel l3= new JLabel("Product Name");
	JLabel l4= new JLabel("UnitPrice");
	JLabel l5= new JLabel("Quantity");
	//JLabel l11= new JLabel("/");
	//JLabel l12= new JLabel("/");
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	
	JButton b = new JButton("SUBMIT");
	JButton b1 = new JButton("BACK");
	
	public UpdateFrame(JFrame frame)
	{
		this.frame = frame;
		
		frame.add(l1);
		l1.setBounds(150,20,200,20);
		frame.add(l2);
		l2.setBounds(50,70,80,20);
		frame.add(l3);
		l3.setBounds(50,100,120,20);
		frame.add(l4);
		l4.setBounds(50,130,80,20);
		frame.add(l5);
		l5.setBounds(50,160,150,20);
		
		
		frame.add(t);
		t.setBounds(210,70,170,20);
		frame.add(t1);
		t1.setBounds(210,100,170,20);
		frame.add(t2);
		t2.setBounds(210,130,170,20);
		frame.add(t3);
		t3.setBounds(210,160,170,20);
		
		
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
				Update u = new Update();
				if(u.updateinfo(t.getText(),t1.getText(),t2.getText(),t3.getText())==true){
					JOptionPane.showMessageDialog(this,"Product SUCCESSFULLY Updated");
					this.exitUpdate();
				}
				else{
					JOptionPane.showMessageDialog(this,"ERROR");
				}
			
		}
		
		else if(e.getSource()==b1){
			
			exitUpdate();
			
		}
	}
	
	public void exitUpdate()
	{
		//invisible Register
			l1.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			l5.setVisible(false);
			
			t.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			
			b.setVisible(false);
			b1.setVisible(false);
			
			//visible login
			
			UserFrame u=new UserFrame(frame);
			
			
	}
 }
