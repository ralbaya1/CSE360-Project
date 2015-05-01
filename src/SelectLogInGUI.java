/**************************************************
 * 		This will be the second 
 * 		GUI that will go back to the log in 
 * 
 *******************************************/

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SelectLogInGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectLogInGUI frame = new SelectLogInGUI();
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
	public SelectLogInGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton PatientButton = new JButton("Patient Login");
		PatientButton.addActionListener(new ActionListener() {
			
			// *************   Button for Patient  ***************
			public void actionPerformed(ActionEvent e) {
				// close window 
				dispose();
				GUI_Login LogN = new GUI_Login();  
				LogN.setUserType("PatientData");
				LogN.setVisible(true);
				
				
			}
		});
		PatientButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PatientButton.setBounds(405, 208, 127, 30);
		contentPane.add(PatientButton);
		
		
		
		//=======================================================
		//*******************************************************
		
		
		JButton DoctorButton = new JButton("Doctor Login");
		DoctorButton.addActionListener(new ActionListener() {
			
			//==============  Button for Doctor ================
			public void actionPerformed(ActionEvent arg0) {
				// close window 
				// create  log in 
				dispose();
				GUI_Login LogN = new GUI_Login();  
				LogN.setUserType("Doctor");
				LogN.setVisible(true);
			}
		});
		DoctorButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DoctorButton.setBounds(71, 208, 127, 30);
		contentPane.add(DoctorButton);
		
		JLabel lblNewLabel_1 = new JLabel("Caduceus Patient Symptoms Monitoring System ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(89, 11, 431, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		Image Drimg = new ImageIcon(this.getClass().getResource("/Doctor_icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(Drimg));
		lblNewLabel.setBounds(71, 72, 118, 125);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image PatientImg = new ImageIcon(this.getClass().getResource("/Patient_icon.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(PatientImg));
		lblNewLabel_2.setBounds(405, 72, 127, 125);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Close Program");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(223, 266, 136, 30);
		contentPane.add(btnNewButton);
		
		JLabel IconB = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/blue_Icon.png")).getImage();
		IconB.setIcon(new ImageIcon(img));
		IconB.setBounds(223, 75, 148, 133);
		contentPane.add(IconB);
		
		JLabel Backgournd = new JLabel("");
		Image BackG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		Backgournd.setIcon(new ImageIcon(BackG));
		Backgournd.setBounds(0, 0, 626, 333);
		contentPane.add(Backgournd);
		
	}
}
