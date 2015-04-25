import java.awt.EventQueue;
import java.sql.*;
import java.awt.Image;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI window = new Login_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection  = null; // <== global connection
	int count = 0; 
	private JTextField UserNametextField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	/**
	 * Create the application.
	 */
	public Login_GUI() {
		initialize();
		
		
		//***************************************
		//===============================
		//connection= sqliteConnection.dbConnector(); // <== connection to the database
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//**************************
		//int count = 1; 
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel UserNameLable = new JLabel("Username");
		UserNameLable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UserNameLable.setBounds(240, 105, 100, 25);
		frame.getContentPane().add(UserNameLable);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PasswordLabel.setBounds(240, 147, 100, 25);
		frame.getContentPane().add(PasswordLabel);
		
		UserNametextField = new JTextField();
		UserNametextField.setBounds(350, 102, 180, 31);
		frame.getContentPane().add(UserNametextField);
		UserNametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(350, 144, 180, 31);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Login Lin = new Login();
				
				//String x = passwordField.getText();
				//System.out.println(x);
				
				Lin.CheckLogin( UserNametextField.getText() , passwordField.getText());
				
				if(Lin.ValidLogIn())
				{
					// *** show valid message ***
					JOptionPane.showMessageDialog(null, "Correct Password");
					// --- close window -----------
					// ---- go to new window -----
					
				}
				else if ( Lin.getValidUserName()  && !Lin.getValidPassword() )
				{
					// Lin.getValidUserName()
					JOptionPane.showMessageDialog(null, "wrong password");
					count++;
				}
				
				else if (!Lin.getValidUserName()  && Lin.getValidPassword() )
				{
					JOptionPane.showMessageDialog(null, "worng username");
					count++;
				}
				else if (!Lin.getValidUserName()  && !Lin.getValidPassword() )
				{
					JOptionPane.showMessageDialog(null, "Wrong Username and Password");
					count++;
				}
				
				
				if(count >3)
				{
					// close window
					JOptionPane.showMessageDialog(null, "Show forgot window");
					// go to forgot windnow
				}
				
				
				/*try
				{
					String query = "select * from User_Info where UserName=? and Password=?  ";
					PreparedStatement pst= connection.prepareStatement(query);

					pst.setString(1,UserNametextField.getText());
					pst.setString(2, passwordField.getText());
					

					ResultSet rs = pst.executeQuery();  // <== get the values from the database one by one 
					int count = 0;
					while(rs.next())
					{
						count++;
					}
					
					if(count == 1)
						JOptionPane.showMessageDialog(null,"Username and password is correct");					
					
					else if( count > 1 )
						JOptionPane.showMessageDialog(null,"Duplicate Username and password");
					
					else 
						JOptionPane.showMessageDialog(null,"Username and password is not correct Try Again..");					
					
					
					//----- close the connection -----
					rs.close();
					pst.close();
					
					
			
				
				}*/
				/*catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}*/
				
			}
		}
			);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(417, 209, 113, 25);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/blue_Icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(73, 41, 199, 191);
		frame.getContentPane().add(lblNewLabel);
	}
}
