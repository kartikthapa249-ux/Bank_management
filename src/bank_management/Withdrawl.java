package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {
	
	JTextField text;
	JButton withdrawl, back;
	String pinnumber;
	Withdrawl(String pinnumber){
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpeg"));
		Image l2 = l1.getImage().getScaledInstance(900, 900, Image.SCALE_SMOOTH);
		ImageIcon l3 = new ImageIcon(l2);
		JLabel image =  new JLabel(l3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel s1 = new JLabel("Please Enter The Amount  You Want To Deposite");
		s1.setFont(new Font("System",Font.BOLD,14));
		s1.setForeground(Color.white);
		s1.setBounds(170,450,350,50);
		image.add(s1);
		
		text  = new JTextField();
		text.setFont(new Font("Raleway",Font.BOLD,16));
		text.setBounds(170,550,340,30);
		image.setLayout(null);
		image.add(text);
		
		withdrawl = new JButton("Withdraw");
		withdrawl.setBounds(350,680,150,30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		back = new JButton("Back");
		back.setBounds(350,730,150,30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== withdrawl) {
			String num = text.getText();
			Date date = new Date();
			if (num.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdraw");
			}else {
				try {
				Conn conn = new Conn();
				String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+num+"')";
			
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs "+num+" Withdraw Successfully");
					setVisible(false);
					new transaction(pinnumber).setVisible(true);
					
				} catch (SQLException e1) {
					System.out.println(e1);
				}
			}
			
		}else if (e.getSource()== back) {
			
			setVisible(false);
			new transaction(pinnumber).setVisible(true);
			
		}
		
	}
	
	public static void main(String[] args) {
		new Withdrawl("");
		
	}
	
}
