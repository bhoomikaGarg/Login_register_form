

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myFrame extends JFrame{
	Container c;
	JLabel label1,label2,label3,label4,label5,success,label6;
	JTextField t1,t2;
	JComboBox date ,month,year;
	JButton submit;
	public static JTextArea message;
	JCheckBox terms;
	JTextArea address;
	JRadioButton male,female;
	
	myFrame(){
	
		setTitle("Registeration Form");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		label1=new JLabel("USERNAME :");
		label1.setBounds(20,50,100,20);
		t1=new JTextField();
		t1.setBounds(130,50,150,20);
		
		label2=new JLabel("MOBILE :");
		label2.setBounds(20,100,100,20);
		t2=new JTextField();
		t2.setBounds(130,100,150,20);
		
		label3=new JLabel("GENDER :");
		label3.setBounds(20,150,100,20);
		male=new JRadioButton("MALE");
		male.setBounds(130,150,70,20);
		female=new JRadioButton("FEMALE");
		female.setBounds(210,150,100,20);
		ButtonGroup gender=new ButtonGroup();
		gender.add(female);
		gender.add(male);
		male.setSelected(true);
		
		label4=new JLabel("DOB :");
		label4.setBounds(20,200,100,20);
		String[] total_months= {"Jan","Feb","March","April","May","June","July",
				"Aug","Sept","Oct","Nov","Dec"};
		String[] total_days= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"
				,"15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String[] total_year= {"2010","2009","2008","2007","2006","2059","2004","2003",
				"2002","2001","2000","1999","1998","1997","1996","1995","1994","1993"};
		
		month=new JComboBox(total_months);
		month.setBounds(200,200,60,20);
		date=new JComboBox(total_days);
		date.setBounds(130,200,50,20);
		year=new JComboBox(total_year);
		year.setBounds(280,200,60,20);
		

		label5=new JLabel("ADDRESS :");
		label5.setBounds(20,290,100,20);
		address=new JTextArea();
		address.setBounds(130,290,200,50);
		address.setWrapStyleWord(true);
		
		terms=new JCheckBox("I agree to accept terms and conditions of this page *");
		terms.setBounds(20,360,600,20);
		
		message=new JTextArea();
		message.setBounds(390,80,250,250);
		message.setFont(new Font("Arial",Font.BOLD,15));
		message.setWrapStyleWord(true);
		
		label6=new JLabel(" Check your following details :");
		label6.setBounds(390,30,250,40);
		
		success=new JLabel("Updation");
		success.setBounds(400,370,300,50);
		success.setVisible(false);
		success.setFont(new Font("Arial",Font.BOLD,15));

		
		
		submit=new JButton("SUBMIT");
		submit.setBounds(100,400,80,40);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(terms.isSelected()) {
					if(t1.getText().isEmpty() || t2.getText().isEmpty() ||address.getText().isEmpty()) {
						success.setVisible(true);
						success.setText("ENTER THE DETAILS");
						success.setForeground(Color.RED);
					}
					else {
						String gender="";
						if(female.isSelected()) {
							gender="female";
						}
						else {
							gender="male";
						}
						if(t2.getText().length()==10) {
							message.setText("\n"+"Username: "+t1.getText()+"\n"+
									"Mobile: "+t2.getText()+"\n"+"Address: "+address.getText()+"\n"+
									"Gender: "+gender+"\n"+"DOB: "+date.getSelectedItem()+"/"+month.getSelectedItem()+"/"+
									year.getSelectedItem());
							success.setVisible(true);
							success.setText("Registration successfull !!!");
							success.setForeground(Color.GREEN);

						}
						else {
							success.setVisible(true);
							success.setText("PHONE NUMBER IS INCORRECT ");
							success.setForeground(Color.RED);
						}
						
					}
					
				}
				else {
					success.setVisible(true);
					success.setText("Please accept the terms");
					success.setForeground(Color.BLUE);
				}
				
			}
			
		});
		
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
		c.add(terms);
		c.add(address);
		c.add(male);
		c.add(female);
		c.add(message);
		c.add(submit);
		c.add(date);
		c.add(month);
		c.add(year);
		c.add(t1);
		c.add(t2);
		c.add(success);
		c.add(label6);

		setVisible(true);
	}
}
//public class Registrationform {
//	public static void main(String args[]) {
//		new myFrame();		
//	}
//
//}
