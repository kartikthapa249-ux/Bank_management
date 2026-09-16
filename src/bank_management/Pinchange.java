package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Pinchange extends JFrame implements ActionListener {
	
	JPasswordField pin,repin;
	JButton change,back;
	String pinnumber;
	
	Pinchange(String pinnumber){
		this.pinnumber = pinnumber;
		setLayout(null);
		
		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpeg"));
		Image l2 = l1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		JLabel image = new JLabel(l3);
		image.setBounds(0,0,900,800);
		//image.setLayout(null);
		add(image);
		
		JLabel text = new JLabel("CHANGE YOUR PIN");
		text.setFont(new Font("System",Font.BOLD,16));
		text.setForeground(Color.white);
		text.setBounds(250,370,150,30);
		image.add(text);
		
		JLabel pintext = new JLabel("New PIN");
		pintext.setFont(new Font("System",Font.BOLD,16));
		pintext.setForeground(Color.white);
		pintext.setBounds(170,420,150,30);
		image.add(pintext);
		
		JLabel repintext = new JLabel("Re-Enter New PIN");
		repintext.setFont(new Font("System",Font.BOLD,16));
		repintext.setForeground(Color.white);
		repintext.setBounds(170,470,150,30);
		image.add(repintext);
		
		pin = new JPasswordField();
		pin.setFont(new Font("Raleway",Font.BOLD,25));
		pin.setBounds(330,420,180,25);
		image.add(pin);
		
		repin = new JPasswordField ();
		repin.setFont(new Font("Raleway",Font.BOLD,25));
		repin.setBounds(330,470,180,25);
		image.add(repin);
		
		change = new JButton("CHANGE");
		change.setBounds(355,680,150,30);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("BACK");
		back.setBounds(355,730,150,30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,850);
		setLocation(300,0);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == change) {
		try {
			
			String npin = pin.getText();
			String rpin = repin.getText();
			
		if (!npin.equals(rpin)) {
			JOptionPane.showMessageDialog(null, "Entered PIN does not match");
			return;
		}	
		if (npin.equals("")) {
			if (!npin.equals(rpin)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
				return;
			}	
			if (npin.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter New PIN");
				return;
			}
		}
			if (rpin.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Re-enter New PIN");
				return;
			}
			Conn c = new Conn();
			
			String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
			String query2 = "update login set pinnumber = '"+rpin+"' where pinnumber ='"+pinnumber+"'";
			String query3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber ='"+pinnumber+"'";

			c.s.executeUpdate(query1);
			c.s.executeUpdate(query2);
			c.s.executeUpdate(query3);
			
			
			
			JOptionPane.showMessageDialog(null, "PIN change successfully");
			
			setVisible(false);
			new transaction(rpin).setVisible(true);

		} catch (Exception e) {
			System.out.println(e);
		}
				}else {
					setVisible(false);
					new transaction(pinnumber).setVisible(true);
					
				}
	}
	
public static void main(String[] args) {
	new Pinchange("");
}




}
