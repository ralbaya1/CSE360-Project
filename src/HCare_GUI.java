/**********************************************************
 *  	This will be the first window the use will see. 
 *  The user will the log in ( doctor or patient ) . 
 *******************************************************/


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HCare_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HCare_GUI window = new HCare_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HCare_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("title");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setBounds(228, 41, 54, 20);
		frame.getContentPane().add(lblTitle);
		
		
		/********************************************
		 * 			Button for Patient 
		 *****************************************/
		JButton btnPatientLogin = new JButton("Patient Login");
		btnPatientLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// close window 
				frame.dispose();
				GUI_Login LogN = new GUI_Login();  //GUI_Longin LogN = new GUI_Longin();
				LogN.setUserType("PatientData");
				LogN.setVisible(true);
				
				
				
				
			}
		});
		
		
		
		btnPatientLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPatientLogin.setBounds(283, 239, 150, 39);
		frame.getContentPane().add(btnPatientLogin);
		
		
		/******************************************************
		 * 		Button for Doctor 
		 ****************************************************/
		
		JButton btnDoctorLogin = new JButton("Doctor Login");
		btnDoctorLogin.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent e) {
				
				// close window 
				// create  log in 
				frame.dispose();
				GUI_Login LogN = new GUI_Login();  //GUI_Longin LogN = new GUI_Longin();
				LogN.setUserType("Doctor");
				LogN.setVisible(true);
				
			}
		});
		
		
		btnDoctorLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDoctorLogin.setBounds(84, 239, 150, 39);
		frame.getContentPane().add(btnDoctorLogin);
		
		
		//===========================================================
		JLabel DrIcon = new JLabel("");
		Image Drimg = new ImageIcon(this.getClass().getResource("/Doctor_icon.png")).getImage();
		DrIcon.setIcon(new ImageIcon(Drimg));
		DrIcon.setBounds(84, 81, 150, 148);
		frame.getContentPane().add(DrIcon);
		
		JLabel PIcon = new JLabel("");
		Image PatientImg = new ImageIcon(this.getClass().getResource("/Patient_icon.png")).getImage();
		PIcon.setIcon(new ImageIcon(PatientImg));
		PIcon.setBounds(283, 92, 136, 136);
		frame.getContentPane().add(PIcon);
		
	
	
		
	}
}
