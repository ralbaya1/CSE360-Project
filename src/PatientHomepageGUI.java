import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PatientHomepageGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private int[] symptoms = new int[7];
	private Patient P;
	
	
	public void setPatient(Patient inputPatient)
	{
		P = inputPatient;
	}
	
	
	/***************************
	 *  add to the array 
	 * 
	 ****************************/
	public void setsymptomsEntered(int index, int value)
	{
		symptoms[index] = value;
	}
	
	/********************************
	 *  return the array 
	 * 
	 ******************************/
	public void setsymptoms()
	{
		P.setSymptomLevel(symptoms);
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientHomepageGUI frame = new PatientHomepageGUI();
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
	public PatientHomepageGUI()
	{
		dispose();
	}
	public PatientHomepageGUI(Patient p) {
		P = p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SelectLogInGUI PogramGUI = new SelectLogInGUI();
				PogramGUI.setVisible(true);
			}
		});
		btnLogOut.setBounds(395, 605, 109, 25);
		getContentPane().add(btnLogOut);
		
		
		JButton btnViewHistory = new JButton("View History");
		btnViewHistory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "History");
				PatientHis pHis = new PatientHis(P);
					
					//pHis.PatientHis(P);
				pHis.setVisible(true);
				pHis.dispose();
			}
		});
		btnViewHistory.setBounds(46, 605, 115, 25);
		getContentPane().add(btnViewHistory);
		
		JLabel lblEnterSymtomsFrom = new JLabel("Enter Symtoms From 0 to 10");
		lblEnterSymtomsFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterSymtomsFrom.setBounds(128, 22, 297, 53);
		getContentPane().add(lblEnterSymtomsFrom);

		
		final JSlider slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(244, 104, 200, 39);
		getContentPane().add(slider);
		
		final JSlider slider_1 = new JSlider();
		slider_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_1.setSnapToTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMaximum(10);
		slider_1.setMajorTickSpacing(1);
		slider_1.setBounds(244, 170, 200, 39);
		getContentPane().add(slider_1);
		
		final JSlider slider_2 = new JSlider();
		slider_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_2.setSnapToTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setMaximum(10);
		slider_2.setMajorTickSpacing(1);
		slider_2.setBounds(244, 237, 200, 39);
		getContentPane().add(slider_2);
		
		final JSlider slider_3 = new JSlider();
		slider_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_3.setSnapToTicks(true);
		slider_3.setPaintLabels(true);
		slider_3.setMaximum(10);
		slider_3.setMajorTickSpacing(1);
		slider_3.setBounds(244, 305, 200, 39);
		getContentPane().add(slider_3);
		
		final JSlider slider_4 = new JSlider();
		slider_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_4.setSnapToTicks(true);
		slider_4.setPaintLabels(true);
		slider_4.setMaximum(10);
		slider_4.setMajorTickSpacing(1);
		slider_4.setBounds(244, 369, 200, 39);
		getContentPane().add(slider_4);
		
		final JSlider slider_5 = new JSlider();
		slider_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_5.setSnapToTicks(true);
		slider_5.setPaintLabels(true);
		slider_5.setMaximum(10);
		slider_5.setMajorTickSpacing(1);
		slider_5.setBounds(244, 435, 200, 39);
		getContentPane().add(slider_5);
		
		final JSlider slider_6 = new JSlider();
		slider_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_6.setSnapToTicks(true);
		slider_6.setPaintLabels(true);
		slider_6.setMaximum(10);
		slider_6.setMajorTickSpacing(1);
		slider_6.setBounds(244, 497, 200, 39);
		getContentPane().add(slider_6);
		
		JLabel lblNewLabel = new JLabel("Pain");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(84, 118, 56, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Tired");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(84, 184, 56, 25);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Nausea");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(84, 251, 77, 25);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Depression");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(84, 318, 115, 25);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Anxiety");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(84, 383, 77, 25);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Drowsy");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(84, 449, 77, 25);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Appetite");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(84, 511, 82, 25);
		getContentPane().add(label_5);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				setsymptomsEntered(0,slider.getValue());
				setsymptomsEntered(1,slider_1.getValue());
				setsymptomsEntered(2,slider_2.getValue());
				setsymptomsEntered(3,slider_3.getValue());
				setsymptomsEntered(4,slider_4.getValue());
				setsymptomsEntered(5,slider_5.getValue());
				setsymptomsEntered(6,slider_6.getValue());
				
				
				setsymptoms();
				P.thresholdCheck();
				
				
				
				JOptionPane.showMessageDialog(null, "Submited successful");
				
				dispose();
				SelectLogInGUI PogramGUI = new SelectLogInGUI();
				PogramGUI.setVisible(true);
				
				
			}
		});
		btnSubmit.setBounds(223, 605, 109, 25);
		getContentPane().add(btnSubmit);
		
		JLabel Background = new JLabel("");
		Image BackG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		Background.setIcon(new ImageIcon(BackG));
		Background.setBounds(0, 0, 579, 667);
		contentPane.add(Background);
		
		
	}
}
