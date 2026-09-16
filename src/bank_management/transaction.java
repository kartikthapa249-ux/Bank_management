package bank_management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class transaction extends JFrame implements ActionListener{
	
	JButton posite,cash,fast,mini,pin,balance,exit;
	String pinnumber;
	
	transaction(String pinnumber){
		
		this.pinnumber = pinnumber;
	//	setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		setBounds(0,0,900,900);
		add(image);
		
		JLabel text = new JLabel("Please select your Transaction");
		text.setBounds(225,400,500,35);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setForeground(Color.white);
		image.add(text);
		
		posite = new JButton("Deposite");
		posite.setBounds(170,600,150,30);
		posite.addActionListener(this);
		image.add(posite);
		
		cash = new JButton("Cash withdrawl");
		cash.setBounds(350,600,150,30);
		cash.addActionListener(this);
		image.add(cash);
		
		fast = new JButton("Fast Cash");
		fast.setBounds(170,650,150,30);
		fast.addActionListener(this);
		image.add(fast);
		
		mini = new JButton("Mini Statement");
		mini.setBounds(350,650,150,30);
		mini.addActionListener(this);
		image.add(mini);
	
		pin = new JButton("Pin Change");
		pin.setBounds(170,700,150,30);
		pin.addActionListener(this);
		image.add(pin);
		
		balance = new JButton("Balance Enquiry");
		balance.setBounds(350,700,150,30);
		balance.addActionListener(this);
		image.add(balance);
		
		exit = new JButton("Exit");
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
			System.exit(0);
			
		}else if (ae.getSource()==posite) {
			setVisible(false);
			new posite(pinnumber).setVisible(true);
		}else if (ae.getSource() == cash) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);	
		}else if(ae.getSource() == fast) {
			setVisible(false);
			new Fast_cash(pinnumber).setVisible(true);
		}else if (ae.getSource() == pin) {
			setVisible(false);
			new Pinchange(pinnumber).setVisible(true);
		}else if (ae.getSource() ==  balance) {
			setVisible(false);
			new BalanceEquiry(pinnumber).setVisible(true);
		}else if (ae.getSource() == mini) {
			setVisible(false);
			new MiniStatement(pinnumber).setVisible(true);
		}
		
	}

	
	public static void main(String[] args) {
		
		 new transaction("");
		
	}

	
}
