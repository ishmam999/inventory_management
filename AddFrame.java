import javax.swing.*;
import java.awt.event.*;

 class AddFrame extends JFrame implements ActionListener
 {	
	JFrame frame ;//= new JFrame();
	JLabel l1= new JLabel("Add Product");
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
	
	public AddFrame(JFrame frame)
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
			if( t.getText().trim().equals("") || t1.getText().trim().equals("") || t2.getText().trim().equals("") || t3.getText().trim().equals("") ){
				
				JOptionPane.showMessageDialog(this,"SOMETHING MISSING");
			}
			else{
				Add a = new Add();
				if(a.addinfo(t.getText(),t1.getText(),t2.getText(),t3.getText())==true){
					JOptionPane.showMessageDialog(this,"Product SUCCESSFULLY Added");
					this.exitAdd();
				}
				else{
					JOptionPane.showMessageDialog(this,"PRODUCT IS IN THIS DATABASE");
				}
			}
			
		}
		
		else if(e.getSource()==b1){
			
			exitAdd();
			
		}
	}
	
	public void exitAdd()
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
			
			UserFrame p=new UserFrame(frame);
			
			
	}
 }
 