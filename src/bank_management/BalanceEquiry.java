package bank_management;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEquiry extends JFrame implements ActionListener {
	 
	JButton back;
	String pinnumber;
	
	BalanceEquiry(String pinnumber){
		this.pinnumber = pinnumber;
		setLayout(null);
		
		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpeg"));
		Image l2 = l1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon l3 =  new ImageIcon(l2);
		JLabel image = new JLabel(l3);
		image.setBounds(0,0,900,800);
		add(image);
		
		back = new JButton("Back");
		back.setBounds(355,730,150,30);
		back.addActionListener(this);
		image.add(back);
		
		Conn c = new Conn();
		int balance = 0 ;
		try {
			
			ResultSet rs = c.s.executeQuery("Select * from bank where pin ='"+pinnumber+"'  ");
			
			while (rs.next()) {
				if (rs.getString("type").equals("Deposite")) {
					balance += Integer.parseInt(rs.getString("amount"));
				}else {
					balance  -= Integer.parseInt(rs.getString("amount"));
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
				
		JLabel text = new JLabel("Your Current Account Balance is Rs " +balance);
		text.setForeground(Color.white);
		text.setBounds(220,400,400,30);
		image.add(text);
		
		setSize(900,850);
		setLocation(300,0);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new transaction(pinnumber).setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new BalanceEquiry("");
		
	}



	

}
