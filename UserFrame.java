import javax.swing.*;
import java.awt.event.*;

class UserFrame extends JFrame implements ActionListener{
	JFrame frame;
	JLabel l1= new JLabel("Product Management");
	JLabel l2= new JLabel("Product List");
	
	JButton b1= new JButton("Add");
	JButton b2= new JButton("Delete");
	JButton b3= new JButton("Update");
	JButton b4= new JButton("Refresh");
	
	JTextField t1= new JTextField();
	
	public UserFrame(JFrame frames){
		this.frame=frames;
		frame.setSize(700,500);
		
		frame.add(l1);
		l1.setBounds(170,50,150,50);
		frame.add(l2);
		l2.setBounds(50,100,80,30);
		
		frame.add(t1);
		t1.setBounds(50,130,350,150);
		
		frame.add(b1);
		b1.setBounds(420,150,100,40);
		frame.add(b2);
		b2.setBounds(530,150,100,40);
		frame.add(b3);
		b3.setBounds(420,200,100,40);
		frame.add(b4);
		b4.setBounds(530,200,100,40);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			//adds a product;
			AddFrame a=new AddFrame(frame);

			this.setaddframeInvisible();
			
		}
		else if(e.getSource()==b2){
			//deletes a product
			DeleteFrame d=new DeleteFrame(frame);

			this.setaddframeInvisible();
		}
		else if(e.getSource()==b3){
			//updates product
			UpdateFrame u=new UpdateFrame(frame);

			this.setaddframeInvisible();
		}
		else if(e.getSource()==b4){
			//refresh
			data DB=new data();
			t1.setText(DB.details()) ;
			
			//this.setaddframeInvisible();
		}
	}
	
	void setaddframeInvisible(){

		l1.setVisible(false);
		l2.setVisible(false);
		
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
	 
		t1.setVisible(false);
	}
}