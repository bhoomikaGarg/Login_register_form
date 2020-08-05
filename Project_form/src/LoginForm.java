
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyOwnFrame extends JFrame{
	Container c;
	JButton btn,nextPage;
	public static JTextField name;
	public static JPasswordField pass;
	JLabel username,password;
	public static JLabel message;
	
	MyOwnFrame(){
		setTitle("LoginForm");
		setBounds(100,100,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.white);
		
		c=getContentPane();
		c.setLayout(null);
		
		btn=new JButton("LOGIN");
		
		nextPage=new JButton("REGISTER NOW");
		nextPage.setBounds(200,120,150,50);
		nextPage.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nextPage.setFont(new Font("Arial",Font.BOLD,13));
		
		message=new JLabel("MESSAGE");
		message.setVisible(false);
		message.setBounds(80, 200, 260, 30);
		
		
		pass=new JPasswordField();
		name=new JTextField();
		username=new JLabel("Username");
		password=new JLabel("Password");
		username.setBounds(50, 50, 100, 20);
		password.setBounds(50, 80, 100, 20);
		pass.setBounds(150, 80, 100, 20);
		name.setBounds(150, 50, 100, 20);
		btn.setBounds(40, 120, 100, 50);
		btn.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(btn);
		c.add(username);
		c.add(password);
		c.add(pass);
		c.add(name);
		c.add(nextPage);
		c.add(message);
		
		
		btn.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 if(pass.getText().isEmpty()||name.getText().isEmpty()) {
					message.setText("Enter the details");
					message.setForeground(Color.BLUE);
					message.setVisible(true);
				 }
				else {
					if(pass.getText().length()<8) {
						message.setText("Password should be of atleast 8 characters!");
						message.setForeground(Color.red);
						message.setVisible(true);
					}
					else {
					System.out.println("Username: "+name.getText());
					System.out.println("Password: "+pass.getText());
					message.setText("Logged in as "+name.getText());
					message.setForeground(Color.green);
					message.setVisible(true);
				}
				}
				
			}
			
		});		
		
		nextPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new myFrame();
			}
			
		});
		setVisible(true);

	}

}
 class LoginForm {
	public static void main(String args[]) {
		new MyOwnFrame();
	}

}
