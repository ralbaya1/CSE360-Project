import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	
	protected int[] Synonyms = new int[7];
	protected Patient P;
	
	
	public void setPatient(Patient inputPatient)
	{
		P = inputPatient;
	}
	
	
	/***************************
	 *  add to the array 
	 * 
	 ****************************/
	public void setSynonymsEntered(int index, int value)
	{
		//System.out.println("The index is "+ index + " the value is "+ value);
		Synonyms[index] = value;
	}
	
	/********************************
	 *  return the array 
	 * 
	 ******************************/
	public int[] getSynonyms()
	{
		return Synonyms;
	}
	
	public void PrintSyn()
	{
		int Scan[] = getSynonyms();
		
		for( int i = 0; i < Scan.length; i++)
			System.out.println( "Synonyms " +i + " entered is: "+ Scan[i]);
		
		System.out.println("===================================");
		System.out.println();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//Doctor doc1 = new Doctor("Dr","Mundo","king","one","tacos");
	
		
		//Patient patient1 = new Patient("saul","figueroa","two","three","pozole");
		//Patient patient2 = new Patient("cesar","gaytan","two","three","pozole");
		//Patient patient3 = new Patient("kyle","steffa","two","three","pozole");
		
		//System.out.println(patient1);
		//doc1.addPatientList(patient1);
		//doc1.addPatientList(patient2);
		//doc1.addPatientList(patient3);
		//doc1.printList();
		//doc1.removePatient(patient2);
		System.out.println("\n");
		//doc1.printList();
		
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
	public PatientHomepageGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 705);
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
				//JOptionPane.showMessageDialog(null, "Return to Log in screen");
			}
		});
		btnLogOut.setBounds(526, 620, 109, 25);
		getContentPane().add(btnLogOut);
		
		
		JButton btnViewHistory = new JButton("View History");
		btnViewHistory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "History");
			}
		});
		btnViewHistory.setBounds(69, 620, 115, 25);
		getContentPane().add(btnViewHistory);
		
		JLabel lblEnterSymtomsFrom = new JLabel("Enter Symtoms From 0 to 10");
		lblEnterSymtomsFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterSymtomsFrom.setBounds(200, 11, 297, 53);
		getContentPane().add(lblEnterSymtomsFrom);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("Enter Comments...");
		textField.setBounds(244, 562, 200, 83);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(244, 104, 200, 39);
		getContentPane().add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_1.setSnapToTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMaximum(10);
		slider_1.setMajorTickSpacing(1);
		slider_1.setBounds(244, 170, 200, 39);
		getContentPane().add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_2.setSnapToTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setMaximum(10);
		slider_2.setMajorTickSpacing(1);
		slider_2.setBounds(244, 237, 200, 39);
		getContentPane().add(slider_2);
		
		JSlider slider_3 = new JSlider();
		slider_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_3.setSnapToTicks(true);
		slider_3.setPaintLabels(true);
		slider_3.setMaximum(10);
		slider_3.setMajorTickSpacing(1);
		slider_3.setBounds(244, 305, 200, 39);
		getContentPane().add(slider_3);
		
		JSlider slider_4 = new JSlider();
		slider_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_4.setSnapToTicks(true);
		slider_4.setPaintLabels(true);
		slider_4.setMaximum(10);
		slider_4.setMajorTickSpacing(1);
		slider_4.setBounds(244, 369, 200, 39);
		getContentPane().add(slider_4);
		
		JSlider slider_5 = new JSlider();
		slider_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		slider_5.setSnapToTicks(true);
		slider_5.setPaintLabels(true);
		slider_5.setMaximum(10);
		slider_5.setMajorTickSpacing(1);
		slider_5.setBounds(244, 435, 200, 39);
		getContentPane().add(slider_5);
		
		JSlider slider_6 = new JSlider();
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
				
				
				setSynonymsEntered(0,slider.getValue());
				setSynonymsEntered(1,slider_1.getValue());
				setSynonymsEntered(2,slider_2.getValue());
				setSynonymsEntered(3,slider_3.getValue());
				setSynonymsEntered(4,slider_4.getValue());
				setSynonymsEntered(5,slider_5.getValue());
				setSynonymsEntered(6,slider_6.getValue());
				
				System.out.println("   The patient entered the following sysnontoms : ");
				PrintSyn();
				
				//JOptionPane.showMessageDialog(null, "Thank you for submiting ");
			}
		});
		btnSubmit.setBounds(526, 562, 109, 25);
		getContentPane().add(btnSubmit);
		
		
	}
}
