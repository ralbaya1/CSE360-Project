import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;


public class RegistrationGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationGUI frame = new RegistrationGUI();
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
	public RegistrationGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setBounds(204, 29, 96, 21);
		contentPane.add(lblRegistration);
		
		JLabel lblFristName = new JLabel("Frist Name : ");
		lblFristName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFristName.setBounds(50, 98, 77, 21);
		contentPane.add(lblFristName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(50, 143, 77, 21);
		contentPane.add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(49, 185, 77, 21);
		contentPane.add(lblUsername);
		
		JLabel lblPasswrod = new JLabel("Passwrod :");
		lblPasswrod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPasswrod.setBounds(50, 224, 77, 21);
		contentPane.add(lblPasswrod);
		
		JLabel lblAskQustion = new JLabel("ask Qustion................");
		lblAskQustion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAskQustion.setBounds(50, 313, 273, 21);
		contentPane.add(lblAskQustion);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(50, 264, 46, 14);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(136, 99, 227, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 144, 227, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 186, 226, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 225, 226, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(136, 262, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(345, 314, 156, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel Icon = new JLabel("");
		Image TextIcon = new ImageIcon(this.getClass().getResource("/text_icon.png")).getImage();
		Icon.setIcon(new ImageIcon(TextIcon));
		Icon.setBounds(419, 102, 140, 144);
		contentPane.add(Icon);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(429, 261, 103, 23);
		contentPane.add(btnNewButton);
	}
}
