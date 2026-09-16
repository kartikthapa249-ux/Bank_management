package bank_management;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login,Signup,Clear;
	JTextField cardtext;
	JPasswordField  pintext;
	
	Login(){
		
		setTitle("Automate Teller Machine");
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font ("OSWARD",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font ("Raleway",Font.BOLD,28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);
		
		cardtext = new JTextField();
		cardtext.setBounds(300, 150, 230, 30);
		add(cardtext);
		
		
		JLabel pin = new JLabel("Pin:");
		pin.setFont(new Font ("Raleway",Font.BOLD,28));
		pin.setBounds(120, 220, 150, 30);
		add(pin);
		
		pintext = new JPasswordField();
		pintext.setBounds(300, 220, 230, 30);
		add(pintext);
		
	    login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
	    Clear = new JButton("Clear");
		Clear.setBounds(430, 300, 100, 30);
		Clear.setBackground(Color.black);
		Clear.setForeground(Color.white);
		Clear.addActionListener(this);
		add(Clear);
		
		Signup = new JButton("SIGN UP");
		Signup.setBounds(300, 350, 230, 30);
		Signup.setBackground(Color.black);
		Signup.setForeground(Color.white);
		Signup.addActionListener(this);
		add(Signup);
		
		getContentPane().setBackground(Color.white);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	    if (e.getSource() == Clear) {

	        cardtext.setText("");
	        pintext.setText("");

	    } else if (e.getSource() == login) {
	    	
	    Conn conn = new Conn();
	    String card = cardtext.getText();
	    String pinnumber = pintext.getText();
	    String query = "select * from login where cardnumber = '"+card+"' and pinnumber = '"+pinnumber+"'";
	    try {
			ResultSet rs = conn.s.executeQuery(query);
			if (rs.next()) {
				setVisible(false);
				new transaction(pinnumber).setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect  Card Number or Pin");
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}

	    } else if (e.getSource() == Signup) {

	        try {

	            setVisible(false);
	            new Signupone().setVisible(true);

	        } catch(Exception ex) {

	           System.out.println(ex);
	        }
	    }
	}
		
	
public static void main(String[] args) {
	new Login();
}


}
