package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fast_cash extends JFrame implements ActionListener{

	JButton posite,cash,fast,mini,pin,balance,exit;
	String pinnumber;
	
	Fast_cash(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setLayout(null);
		setBounds(0,0,900,900);
		add(image);
		
		JLabel text = new JLabel("Please select the Amount");
		text.setBounds(225,400,500,35);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setForeground(Color.white);
		image.add(text);
		
		posite = new JButton("Rs 100");
		posite.setBounds(170,600,150,30);
		posite.addActionListener(this);
		image.add(posite);
		
		cash = new JButton("Rs 500");
		cash.setBounds(350,600,150,30);
		cash.addActionListener(this);
		image.add(cash);
		
		fast = new JButton("Rs 1000");
		fast.setBounds(170,650,150,30);
		fast.addActionListener(this);
		image.add(fast);
		
		mini = new JButton("Rs 2000");
		mini.setBounds(350,650,150,30);
		mini.addActionListener(this);
		image.add(mini);
	
		pin = new JButton("Rs 5000");
		pin.setBounds(170,700,150,30);
		pin.addActionListener(this);
		image.add(pin);
		
		balance = new JButton("Rs 10000");
		balance.setBounds(350,700,150,30);
		balance.addActionListener(this);
		image.add(balance);
		
		exit = new JButton("Back");
		exit.setBounds(350,750,150,30);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900,900);
		setLocation(300,0);
		//setUndecorated(true);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == exit) {
			setVisible(false);
			new transaction(pinnumber).setVisible(true);
			
		}else {
		
		String amount = ((JButton)ae.getSource()).getText().substring(3);
		Conn con = new Conn();
		try {
			
			ResultSet rs = con.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
			
			int balance = 0;
			while (rs.next()) {
				if (rs.getString("type").equals("Deposite")) {
					balance += Integer.parseInt(rs.getString("amount"));	
				}else {
					balance -= Integer.parseInt(rs.getString("amount"));	
				}
			}
				
				if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bank Values('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs "+amount+" Withdraw" );
				setVisible(false);
				new transaction(pinnumber).setVisible(true);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
		
	}

	public static void main(String[] args) {
		
		 new Fast_cash("");
		
	}

	
}
