/****************************************************************
 *  		Forgot Window GUI
 *  Description: User will have to enter their
 *  user name and answer the security question.
 *  
 *  Need: Will need a class that connects to the 
 *  the data base and verify the answer.
 ***********************************************************/



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FGP_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField UnameField;
	private JTextField answerField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FGP_GUI frame = new FGP_GUI();
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
	public FGP_GUI() {
		setTitle("Forgot password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(162, 93, 81, 23);
		contentPane.add(lblNewLabel);
		
		JLabel questionLabel = new JLabel("What is your favorite food ?");
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		questionLabel.setBounds(72, 161, 266, 23);
		contentPane.add(questionLabel);
		
		UnameField = new JTextField();
		UnameField.setBounds(72, 127, 266, 23);
		contentPane.add(UnameField);
		UnameField.setColumns(10);
		
		
		
		JLabel lblForgotPasswrod = new JLabel("Forgot Passwrod");
		lblForgotPasswrod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblForgotPasswrod.setBounds(224, 11, 144, 23);
		contentPane.add(lblForgotPasswrod);
		
		JLabel lblNewLabel_2 = new JLabel("To view your passwod enter your username and answer ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(52, 44, 314, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("the security question.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(52, 68, 135, 14);
		contentPane.add(lblNewLabel_3);
		
		answerField = new JTextField();
		answerField.setBounds(70, 191, 268, 23);
		contentPane.add(answerField);
		answerField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(72, 241, 69, 23);
		contentPane.add(lblPassword);
		lblPassword.setVisible(false);
		
		
		
		JLabel AnswerLable = new JLabel("answer");
		AnswerLable.setFont(new Font("Tahoma", Font.BOLD, 13));
		AnswerLable.setBounds(162, 241, 175, 23);
		contentPane.add(AnswerLable);
		AnswerLable.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("Back to login");
		btnNewButton_1.addActionListener(new ActionListener() {
			/*******************************************
			 *  go back to the first page 
			 */
			public void actionPerformed(ActionEvent e) {
				dispose();
				SelectLogInGUI PogramGUI = new SelectLogInGUI();
				PogramGUI.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(407, 239, 123, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			
			/******************************************
			 *  check of if the answer is correct
			 */
			public void actionPerformed(ActionEvent arg0) {
				
				lblPassword.setVisible(true);
				AnswerLable.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(407, 189, 123, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
