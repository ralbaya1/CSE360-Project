/* 
 * CSE 360
 * Team11
*/

/**********************************************************
 * THIS CLASS IS TO BE RUN INITIALLY.
 *  
 *  This will be the first window the use will see. 
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
		frame.setBounds(100, 100, 596, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Caduceus Patient Symptoms Monitoring System ");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setBounds(96, 41, 411, 20);
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
		btnPatientLogin.setBounds(357, 239, 150, 39);
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
		DrIcon.setBounds(110, 72, 150, 148);
		frame.getContentPane().add(DrIcon);
		
		JLabel PIcon = new JLabel("");
		Image PatientImg = new ImageIcon(this.getClass().getResource("/Patient_icon.png")).getImage();
		PIcon.setIcon(new ImageIcon(PatientImg));
		PIcon.setBounds(374, 84, 136, 136);
		frame.getContentPane().add(PIcon);
		
		JLabel Logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/blue_Icon.png")).getImage();
		Logo.setIcon(new ImageIcon(img));
		Logo.setBounds(228, 72, 135, 156);
		frame.getContentPane().add(Logo);
		
		JLabel backgournd = new JLabel("");
		Image BackG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		backgournd.setIcon(new ImageIcon(BackG));
		backgournd.setBounds(0, 0, 580, 326);
		frame.getContentPane().add(backgournd);
		
	
	
		
	}
}
