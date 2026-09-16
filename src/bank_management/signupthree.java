package bank_management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class signupthree extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit , cancel;
	String formno;
	
	signupthree(String formno) {
	this.formno = formno;
		setLayout(null);
		
		JLabel l1 =  new JLabel("page  3: Account Detail");
		l1.setFont(new Font ("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type =  new JLabel("Account Type");
		type.setFont(new Font ("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway", Font.BOLD,18));
		r1.setBounds(100, 180, 200, 30);
		r1.setBackground(Color.white);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposite Account");
		r2.setFont(new Font("Raleway",Font.BOLD,18));
		r2.setBounds(350,180,300,30);
		r2.setBackground(Color.white);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway", Font.BOLD,18));
		r3.setBounds(100, 220, 200, 30);
		r3.setBackground(Color.white);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposite Account");
		r4.setFont(new Font("Raleway", Font.BOLD,18));
		r4.setBounds(350, 220, 300, 30);
		r4.setBackground(Color.white);
		add(r4);
		
		ButtonGroup Groupcount = new ButtonGroup();
		Groupcount.add(r1);
		Groupcount.add(r2);
		Groupcount.add(r3);
		Groupcount.add(r4);
		
		JLabel card =  new JLabel("Card Number");
		card.setFont(new Font ("Raleway",Font.BOLD,22));
		card.setBounds(100,300,200,30);
		add(card);
		
		JLabel number =  new JLabel("XXXX-XXXX-XXXX-1648");
		number.setFont(new Font ("Raleway",Font.BOLD,22));
		number.setBounds(330,300,300,30);
		add(number);
		
		JLabel Info =  new JLabel("Your 16 Digit card Number");
		Info.setFont(new Font ("Raleway",Font.BOLD,12));
		Info.setBounds(100,330,300,15);
		add(Info);
		
		JLabel pin =  new JLabel("PIN:");
		pin.setFont(new Font ("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,200,30);
		add(pin);
		
		JLabel pnumber =  new JLabel("XXXX");
		pnumber.setFont(new Font ("Raleway",Font.BOLD,22));
		pnumber.setBounds(330,370,200,30);
		add(pnumber);
		
		JLabel Info2 =  new JLabel("Your 4 Digit Password");
		Info2.setFont(new Font ("Raleway",Font.BOLD,12));
		Info2.setBounds(100,400,300,15);
		add(Info2);
		
		
		JLabel service = new JLabel("Service Required:");
		service.setFont(new Font("Raleway",Font.BOLD,22));
		service.setBounds(100,460,300,30);
		add(service);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100,500,200,30);
		add(c1);
		
		c2 = new JCheckBox("Mobile Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(100,550,200,30);
		add(c2);
		c3 = new JCheckBox("Cheque Book");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,600,200,30);
		add(c3);
		c4 = new JCheckBox("Internet Banking");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(400,500,200,30);
		add(c4);
		c5 = new JCheckBox("EMAIL & SMS Alerts");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(400,550,200,30);
		add(c5);
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(400,600,200,30);
		add(c6);
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway",Font.BOLD,14));
		c7.setBounds(100,650,800,30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Raleway", Font.BOLD, 14 ));
		submit.setBounds(250, 690,100,30);
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setFont(new Font("Raleway", Font.BOLD, 14 ));
		cancel.setBounds(400, 690,100,30);
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350, 10);
		setVisible(true);
		setBackground(Color.white);
		System.out.println("constructor load");
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("yaha tak ho gaya");
		if(ae.getSource() == submit) {
			String accounttype = null;
			if (r1.isSelected()) {
				accounttype = "Saving Account";
			}else if(r2.isSelected()) {
				accounttype = "Fixed Deposite Account";
			}else if(r3.isSelected()) {
				accounttype = "Current Account";
			}else if(r4.isSelected()) {
				accounttype = "Recurring Deposite Account";
			}
			
			
			
			Random random = new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040604900000000L);
			
			String pinnumber  = "" + Math.abs((random.nextLong() % 9000L) + 100L);
		
			String servicerequre = null;
			if (c1.isSelected()) {
				servicerequre = servicerequre + " ATM Card";
			}else if (c2.isSelected()) {
				servicerequre = servicerequre + " Mobile Banking";
			}else if (c3.isSelected()) {
				servicerequre = servicerequre + " Cheque Book";
			}else if (c4.isSelected()) {
				servicerequre = servicerequre + " Internet Banking";
			}else if (c5.isSelected()) {
				servicerequre = servicerequre + " EMAIL & SMS Alerts";
			}else if (c6.isSelected()) {
				servicerequre = servicerequre + " E-Statement";
			}
			
			try {
				if (accounttype.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is Require");
				}else if (servicerequre.equals("")) {
					JOptionPane.showMessageDialog(null, "Service type is require");
				}else {
					Conn conn = new Conn();
					String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+servicerequre+"')";
					String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					System.out.println("query inject");
					
					JOptionPane.showMessageDialog(null, "Card Number" + cardnumber + "\n Pin:"+ pinnumber);
					
					setVisible(false);
					new transaction(pinnumber).setVisible(true);
				}
			} catch (Exception e2) {
				System.out.println(e2);
				
			}
			
		}else if (ae.getSource() ==  cancel) {
			
			setVisible(false);
			
		}
		
	}

	public static void main(String[] args) {
		new signupthree("");
	}

	
}
