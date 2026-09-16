package bank_management;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class Signupone extends JFrame implements ActionListener{
	
	long random;
	JTextField nametext,fnametext,emailtext,addresstext,citytext,statetext,pintext;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser DateChooser;
	
	     Signupone() {
		 setLayout(null);
		 Random ran = new Random();
		 random = Math.abs((ran.nextLong() % 9000L) + 1000L);		 
		 
		 JLabel formno = new JLabel("APPLICATION FORM NO." + random );
		 formno.setFont(new Font ("Ralewaay", Font.BOLD,38));
		 formno.setBounds(140,20,600,40);
		 add(formno);
		 
		 JLabel personalinfo = new JLabel("page 1: personal Info");
		 personalinfo.setFont(new Font ("Ralewaay", Font.BOLD,22));
		 personalinfo.setBounds(290,80,400,30);
		 add(personalinfo );
		 
		 JLabel name = new JLabel("Name:");
		 name.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 name.setBounds(100,140,100,30);
		 add(name);
		 
		 nametext = new JTextField();
		 nametext.setFont(new Font("Raleway", Font.BOLD,14));
		 nametext.setBounds(300,140,400,30);
		 add(nametext);
		 
		 JLabel fname = new JLabel("Father's Name: ");
		 fname.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 fname.setBounds(100,190,200,30);
		 add(fname );
		 
		 fnametext = new JTextField();
		 fnametext.setFont(new Font("Raleway", Font.BOLD,14));
		 fnametext.setBounds(300,190,400,30);
		 add(fnametext);
		 
		 JLabel dob = new JLabel("Date of Birth: ");
		 dob.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 dob.setBounds(100,240,200,30);
		 add(dob);
		 
		 DateChooser = new JDateChooser();
		 DateChooser.setBounds(300,240,400,30);
		 DateChooser.setForeground(Color.red);
		 add(DateChooser);
		 
		 JLabel gen = new JLabel("Gender: ");
		 gen.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 gen.setBounds(100,290,200,30);
		 add(gen);
		 
		 male = new JRadioButton("Male");
		 male.setBounds(300,290,60,30);
		 male.setBackground(Color.white);
		 add(male);
		 
		 female = new JRadioButton("Female");
		 female.setBounds(450,290,80,30);
		 female.setBackground(Color.white);
		 add(female);
		 
		 ButtonGroup gengroup = new ButtonGroup();
		 gengroup.add(male);
		 gengroup.add(female);

		 
		 
		 JLabel email = new JLabel("Email Address: ");
		 email.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 email.setBounds(100,340,200,30);
		 add(email);
		 
		 emailtext = new JTextField();
		 emailtext.setFont(new Font("Raleway", Font.BOLD,14));
		 emailtext.setBounds(300,340,400,30);
		 add(emailtext);
		 
		 JLabel marital = new JLabel("Marital Status: ");
		 marital.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 marital.setBounds(100,390,200,30);
		 add(marital);
		 
		 married = new JRadioButton("Married");
		 married.setBounds(300,390,100,30);
		 married.setBackground(Color.white);
		 add(married);
		 
		 unmarried = new JRadioButton("Unmarried");
		 unmarried.setBounds(450,390,100,30);
		 unmarried.setBackground(Color.white);
		 add(unmarried);
		 
		 other = new JRadioButton("Other");
		 other.setBounds(630,390,100,30);
		 other.setBackground(Color.white);
		 add(other);
		 
		 ButtonGroup maritalgroup = new ButtonGroup();
		 maritalgroup.add(married);
		 maritalgroup.add(unmarried);
		 maritalgroup.add(other);
		 
		 JLabel address = new JLabel("Address: ");
		 address.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 address.setBounds(100,440,200,30);
		 add(address);
		 
		 addresstext = new JTextField();
		 addresstext.setFont(new Font("Raleway", Font.BOLD,14));
		 addresstext.setBounds(300,440,400,30);
		 add(addresstext);
		 
		 JLabel city = new JLabel("City: ");
		 city.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 city.setBounds(100,490,200,30);
		 add(city);
		 
         citytext = new JTextField();
		 citytext.setFont(new Font("Raleway", Font.BOLD,14));
		 citytext.setBounds(300,490,400,30);
		 add(citytext);
		 
		 JLabel state = new JLabel("State: ");
		 state.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 state.setBounds(100,540,200,30);
		 add(state);
		 
		 statetext = new JTextField();
		 statetext.setFont(new Font("Raleway", Font.BOLD,14));
		 statetext.setBounds(300,540,400,30);
		 add(statetext);
		 
		 JLabel pin = new JLabel("Pincode: ");
		 pin.setFont(new Font ("Ralewaay", Font.BOLD,20));
		 pin.setBounds(100,590,200,30);
		 add(pin);
		 
		 pintext = new JTextField();
		 pintext.setFont(new Font("Raleway", Font.BOLD,14));
		 pintext.setBounds(300,590,400,30);
		 add(pintext);
		 
		 next = new JButton("Next");
		 next.setBackground(Color.black);
		 next.setForeground(Color.white);
		 next.setFont( new Font("Raleway",Font.BOLD,14));
		 next.setBounds(620,660,80,30);
		 next.addActionListener(this);
		 add(next);
		 
		getContentPane().setBackground(Color.WHITE);
		 
		setSize(850,800);
		setLocation(350, 10);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		System.out.println("Constructor Loaded");
	}
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
		 System.out.println("Button Clicked");
			String formno = "" + random;
			String name = nametext.getText();
			String fname = fnametext.getText();
			String dob = ((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
			String gen = null;
			if (male.isSelected()) {
				gen = "Male";
			}	else if (female.isSelected()) {
					gen = "Female";
				}
			
			String email = emailtext.getText();
			
			String marital = null;
			if (married.isSelected()) {
				marital = "Married";
			}else if (unmarried.isSelected()) {
				marital = "Unmarried";
			}else if (other.isSelected()) {
				marital = "Other";
			}
			
			String address = addresstext.getText();
			String city = citytext.getText();
			String state = statetext.getText();
			String pin = pintext.getText();


			try {
				if(name.equals("")){
				    JOptionPane.showMessageDialog(null, "Name is require");
				}else {
					Conn c = new Conn();
					String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";

					System.out.println(query);

					c.s.executeUpdate(query);

					JOptionPane.showMessageDialog(null, "Inserted Successfully");
					setVisible(false);
					new signuptwo(formno).setVisible(true);
				}
			} catch (Exception ae) {
				ae.printStackTrace();
			}
			
			}
		//"String'"+variable+"'String"; 	
	public static void main(String[] args) {
		
		new Signupone();
	}

	

}
