package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signuptwo extends JFrame implements ActionListener { 
	
	JTextField adhartext,Pantext;
	JButton next;
	JRadioButton Syes, Sno, Eyes, Eno;
	String formno;
	
	JComboBox<String> religion,category,income,qualification,occupation;
	
	signuptwo(String formno) {
		
		this.formno = formno;
	 setLayout(null);
	 
	 //Random ran = new Random();
	 //random = Math.abs((ran.nextLong() % 9000L) + 1000L);		 
	 
	 JLabel personalinfo = new JLabel("page 2: Additional Detail");
	 personalinfo.setFont(new Font ("Ralewaay", Font.BOLD,22));
	 personalinfo.setBounds(290,80,400,30);
	 add(personalinfo );
	 
	 JLabel Religion = new JLabel("Religion:");
	 Religion.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Religion.setBounds(100,140,100,30);
	 add(Religion);
	 
	 String valreligion[] = {"Hindu","muslim","Sikh","Christian","other"};
	 religion  = new JComboBox<String>(valreligion);
	 religion.setBackground(Color.white);
	 religion.setBounds(300,140,400,30);
	 add(religion);
	 
	 JLabel Category = new JLabel("Category: ");
	 Category.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Category.setBounds(100,190,200,30);
	 add(Category);
	 
	 String valcategory[] = {"OBC","SC","ST","GEN"};
	 category  = new JComboBox<String>(valcategory);
	 category.setBackground(Color.white);
	 category.setBounds(300,190,400,30);
	 add(category);
	 
	 
	 JLabel Income = new JLabel("Income: ");
	 Income.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Income.setBounds(100,240,200,30);
	 add(Income);
	 
	 String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10 laks"};
	 income  = new JComboBox<String>(valincome);
	 income.setBackground(Color.white);
	 income.setBounds(300,240,400,30);
	 add(income);
	 
	 JLabel Educational = new JLabel("Educational: ");
	 Educational.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Educational.setBounds(100,290,200,30);
	 add(Educational); 
	 
	 JLabel Qualification = new JLabel("Qualification: ");
	 Qualification.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Qualification.setBounds(100,315,200,30);
	 add(Qualification);
	 
	 String valQualification[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
	 qualification  = new JComboBox<String>(valQualification);
	 qualification.setBackground(Color.white);
	 qualification.setBounds(300,315,400,30);
	 add(qualification);
	 
	 JLabel Occupation = new JLabel("Occupation: ");
	 Occupation.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Occupation.setBounds(100,390,200,30);
	 add(Occupation);
	 
	 String valoccupation[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
	 occupation  = new JComboBox<String>(valoccupation);
	 occupation.setBackground(Color.white);
	 occupation.setBounds(300,390,400,30);
	 add(occupation);
	 
//	 married = new JRadioButton("Married");
//	 married.setBounds(300,390,100,30);
//	 married.setBackground(Color.white);
//	 add(married);

//	 unmarried = new JRadioButton("Unmarried");
//	 unmarried.setBounds(450,390,100,30);
//	 unmarried.setBackground(Color.white);
//	 add(unmarried);
	 
//	 other = new JRadioButton("Other");
//	 other.setBounds(630,390,100,30);
//	 other.setBackground(Color.white);
//	 add(other);

//	 ButtonGroup maritalgroup = new ButtonGroup();
//	 maritalgroup.add(married);
//	 maritalgroup.add(unmarried);
//	 maritalgroup.add(other);
	 
	 JLabel PanNo = new JLabel("PAN Number: ");
	 PanNo.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 PanNo.setBounds(100,440,200,30);
	 add(PanNo);
	 
	 Pantext = new JTextField();
	 Pantext.setFont(new Font("Raleway", Font.BOLD,14));
	 Pantext.setBounds(300,440,400,30);
	 add(Pantext);
	 
	 JLabel adhar = new JLabel("Aadhar Number: ");
	 adhar.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 adhar.setBounds(100,490,200,30);
	 add(adhar);
	 
	 adhartext = new JTextField();
	 adhartext.setFont(new Font("Raleway", Font.BOLD,14));
	 adhartext.setBounds(300,490,400,30);
	 add(adhartext);
	 
	 JLabel Senior = new JLabel("Senior Citizens: ");
	 Senior.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 Senior.setBounds(100,540,200,30);
	 add(Senior);
	 
	 Syes = new JRadioButton("Yes");
	 Syes.setBounds(300,540,100,30);
	 Syes.setBackground(Color.white);
	 add(Syes);
	 
	 Sno = new JRadioButton("No");
	 Sno.setBounds(450,540,100,30);
	 Sno.setBackground(Color.white);
	 add(Sno);
	 
	 ButtonGroup Seniorgroup = new ButtonGroup();
	 Seniorgroup.add(Syes);
     Seniorgroup.add(Sno);
	 
	 JLabel account = new JLabel("Existing Account: ");
	 account.setFont(new Font ("Ralewaay", Font.BOLD,20));
	 account.setBounds(100,590,200,30);
	 add(account);
	 
	 Eyes = new JRadioButton("Yes");
	 Eyes.setBounds(300,590,100,30);
	 Eyes.setBackground(Color.white);
	 add(Eyes);
	 
	 Eno = new JRadioButton("No");
	 Eno.setBounds(450,590,100,30);
	 Eno.setBackground(Color.white);
	 add(Eno);
	 
	 ButtonGroup Accountgroup = new ButtonGroup();
	 Accountgroup.add(Eyes);
     Accountgroup.add(Eno);
	 
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
		//String formno = "" + random;
		String sreligion  = (String) religion.getSelectedItem();
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String squalification = (String) qualification.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;
		if (Syes.isSelected()) {
			seniorcitizen = "Yes";
		}	else if (Sno.isSelected()) {
			seniorcitizen = "No";
			}
		
		String existingaccount = null;
		if (Eyes.isSelected()) {
			existingaccount = "Yes";
		}else if (Eno.isSelected()) {
			existingaccount = "No";
		}
		
		String aadhar = adhartext.getText();
		String pan = Pantext.getText();
//		String state = statetext.getText();
//		String pin = pintext.getText();


		try {
			if(pan.equals("")){
			    JOptionPane.showMessageDialog(null, "pan is require");
			}else {
				Conn c = new Conn();
				String query = "insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+squalification+"','"+soccupation+"','"+seniorcitizen +"','"+existingaccount+"','"+aadhar+"','"+pan+"')";

				System.out.println(query);

				c.s.executeUpdate(query);

				JOptionPane.showMessageDialog(null, "Inserted Successfully");
				
				setVisible(false);
				new signupthree(formno).setVisible(true);
			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		
		}
	//"String'"+variable+"'String"; 	
public static void main(String[] args) {
	
	new signuptwo("");
}



}



