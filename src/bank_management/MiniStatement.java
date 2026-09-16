package bank_management;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MiniStatement extends JFrame {
	
		  MiniStatement(String pinnumber){
			  setLayout(null);
			  
			  JLabel text = new JLabel();
			  add(text);
			  
			  JLabel bank = new JLabel("Indian Bank");
			  bank.setBounds(150,20,100,30);
			  add(bank);
			  
			  JLabel card = new JLabel();
			  card.setBounds(20,80,300,20);
			  add(card);
			  
			  try {
				Conn c = new Conn();
				ResultSet rs = c.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"'");
				
				while (rs.next()) {
					card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
					
				}  
				
			} catch (Exception e) {
				System.out.println(e);
			}
			  
			  try {
					Conn c = new Conn();
					ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
					
					while (rs.next()) {
						text.setText(text.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +  rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");		
						
					}  
					
				} catch (Exception e) {
					System.out.println(e);
				}
			  text.setBounds(20,140,500,200);
			  
			setSize(400,600);
			setLocation(20,20);
			getContentPane().setBackground(Color.white);
			setVisible(true);
		}
		
	
	public static void main(String[] args) {
		 
		 new MiniStatement("");
	}
}
