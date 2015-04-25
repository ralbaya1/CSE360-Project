/**********************************************************
 *  				Using this GUI 
 *******************************************************/
import java.awt.BorderLayout;
import java.awt.EventQueue;


import java.sql.*;
import java.awt.Image;







import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI_Login extends JFrame {

	private JPanel contentPane;
	protected String UserType;
	private JTextField UserNFiled;
	private JPasswordField passwordField;
	
	//Connection connection  = null; // <== global connection
	int count = 0; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login frame = new GUI_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Login()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserNFiled = new JTextField();
		UserNFiled.setBounds(354, 102, 207, 34);
		contentPane.add(UserNFiled);
		UserNFiled.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(354, 164, 207, 34);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Enter username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(231, 100, 113, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(231, 162, 113, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				
				
				
				Database db  = new Database();
				//boolean ValidUserName = db.
				
				boolean ValidUserName = false;
				boolean ValidPassword= false;
				boolean ValidLogIn= false;
				
				
				if(getUserType().equals("PatientData") )
				{
					 ValidUserName = db.patientUserNamecheck(UserNFiled.getText());
					 ValidPassword = db.patientPasswordCheck(passwordField.getText());
					 ValidLogIn = db.patientCheck(UserNFiled.getText(), passwordField.getText());
					
					
					
				}
				else 
				{
					 ValidUserName = db.docUsernameCheck(UserNFiled.getText());
					 ValidPassword = db.docPasswordCheck(passwordField.getText());
					 ValidLogIn = db.docCheck(UserNFiled.getText(), passwordField.getText());
				
				}
			
//				Login Lin = new Login();
//				
//				System.out.println("In the Log in GUI ");
//				System.out.println("The user tpe is "+ getUserType());
//				Lin.setUserType(getUserType());
//				
//				Lin.CheckLogin( UserNFiled.getText() , passwordField.getText());
//				
			if(ValidLogIn)
				{
					// *** show valid message ***
					//JOptionPane.showMessageDialog(null, "Correct Password");
					
					if( getUserType().equals("PatientData") )
					{
						// close window
						dispose();	
						// create an Patent object
						Patient p = db.getPatient(UserNFiled.getText(), passwordField.getText());
									
						PatientHomepageGUI PatientGUI = new PatientHomepageGUI();
						// add the patient object to the Patient GUI				
						PatientGUI.setVisible(true);
					}
					else
					{  // close window 
						dispose();
						// create an Doctor object
						
						DoctorGUI DrGUI = new DoctorGUI();
						
						// add the doctor object to the doctorGUI
						DrGUI.setVisible(true);
					}
					
					
				}
			
				else if ( ValidUserName  && !ValidPassword )
				{
					// Lin.getValidUserName()
					JOptionPane.showMessageDialog(null, "wrong password");
					count++;
				}
				
				else if (!ValidUserName  && ValidPassword )
				{
					JOptionPane.showMessageDialog(null, "worng username");
					count++;
				}
				else if (!ValidUserName  && ValidPassword )
				{
					JOptionPane.showMessageDialog(null, "Wrong Username and Password");
					count++;
				}
				
				
				if(count >2)
				{
					dispose();								 // <=== close window
					FGP_GUI forgotPass = new FGP_GUI();		 // <===  create an instance of forgot GUI
					forgotPass.setVisible(true);			 // <===  Make the window Visible
					
				}
			
				
				
				
				
			}
		});
		
		
		
		
		
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(448, 225, 113, 25);
		contentPane.add(btnSubmit);
		
		JLabel Icon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/blue_Icon.png")).getImage();
		Icon.setIcon(new ImageIcon(img));
		Icon.setBounds(50, 67, 158, 157);
		contentPane.add(Icon);
	}
	/*************************************
	 *
	 **************************************/
	public void setUserType(String Dr_OR_Patient)
	{
		UserType= Dr_OR_Patient;
	}
	
	public String getUserType()
	{
		return  UserType;
	}
}
