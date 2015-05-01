import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegistrationGUI extends JFrame {

	private JPanel contentPane;
	private JTextField FirstNameFiled;
	private JTextField LastNameFiled;
	private JTextField UserNameFiled;
	private JTextField PasswordFiled;
	private JTextField AgeFiled;
	private JTextField SquestionFiled;
	
	
	protected int[] Symptom = new int[7];
	private int[] PrvSym = new int[7];
	private Doctor Dr;
	
	
	public void setPrvSym()
	{
		for( int i = 0; i <PrvSym.length;i++ )
			PrvSym[i] = 0;
	}
	public int [] getPrvSym()
	{
		for( int i = 0; i <PrvSym.length;i++ )
			PrvSym[i] = 0;
		return PrvSym;
	}
	
	public void setDoctor( Doctor D ) 
	{
		Dr = D;
	}
	
	public void setSymptomTEntered(int index, int value)
	{
		Symptom[index] = value;
	}
	
	/********************************
	 *  return the array 
	 * 
	 ******************************/
	public int[] getSymptom()
	{
		
		return Symptom;
	}
	public void PrintThreshold()
	{
		int Scan[] = getSymptom();
	}

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
		setBounds(100, 100, 900, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegistration.setBounds(352, 13, 140, 46);
		contentPane.add(lblRegistration);
		
		JLabel lblFirstName = new JLabel("First Name : ");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(50, 74, 77, 21);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(50, 117, 77, 21);
		contentPane.add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(50, 158, 77, 21);
		contentPane.add(lblUsername);
		
		JLabel lblPasswrod = new JLabel("Passwrod :");
		lblPasswrod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPasswrod.setBounds(50, 199, 77, 21);
		contentPane.add(lblPasswrod);
		
		JLabel lblAskQustion = new JLabel("What is your favorite food ? ");
		lblAskQustion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAskQustion.setBounds(50, 280, 273, 21);
		contentPane.add(lblAskQustion);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(50, 241, 46, 14);
		contentPane.add(lblAge);
		
		FirstNameFiled = new JTextField();
		FirstNameFiled.setBounds(137, 75, 227, 21);
		contentPane.add(FirstNameFiled);
		FirstNameFiled.setColumns(10);
		
		LastNameFiled = new JTextField();
		LastNameFiled.setBounds(137, 118, 227, 20);
		contentPane.add(LastNameFiled);
		LastNameFiled.setColumns(10);
		
		UserNameFiled = new JTextField();
		UserNameFiled.setBounds(137, 159, 226, 20);
		contentPane.add(UserNameFiled);
		UserNameFiled.setColumns(10);
		
		PasswordFiled = new JTextField();
		PasswordFiled.setBounds(138, 200, 226, 20);
		contentPane.add(PasswordFiled);
		PasswordFiled.setColumns(10);
		
		AgeFiled = new JTextField();
		AgeFiled.setBounds(137, 239, 86, 20);
		contentPane.add(AgeFiled);
		AgeFiled.setColumns(10);
		
		SquestionFiled = new JTextField();
		SquestionFiled.setBounds(137, 316, 156, 20);
		contentPane.add(SquestionFiled);
		SquestionFiled.setColumns(10);
		
		JLabel Icon = new JLabel("");
		Image TextIcon = new ImageIcon(this.getClass().getResource("/text_icon.png")).getImage();
		Icon.setIcon(new ImageIcon(TextIcon));
		Icon.setBounds(137, 353, 140, 144);
		contentPane.add(Icon);
		
				
		JLabel lblSetThreshold = new JLabel("Set Threshold");
		lblSetThreshold.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSetThreshold.setBounds(616, 18, 114, 42);
		contentPane.add(lblSetThreshold);
		
		JLabel lblPain = new JLabel("Pain");
		lblPain.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPain.setBounds(471, 83, 81, 21);
		contentPane.add(lblPain);
		
		JSlider S1 = new JSlider();
		S1.setSnapToTicks(true);
		S1.setPaintLabels(true);
		S1.setMajorTickSpacing(1);
		S1.setMaximum(10);
		S1.setBounds(562, 64, 246, 42);
		contentPane.add(S1);
		
		JLabel lblNewLabel = new JLabel("Tired");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(475, 143, 77, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdsfa = new JLabel("Nausea");
		lblAdsfa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdsfa.setBounds(475, 207, 77, 21);
		contentPane.add(lblAdsfa);
		
		JLabel lblNewLabel_1 = new JLabel("Depression");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(475, 267, 77, 21);
		contentPane.add(lblNewLabel_1);
		
		JSlider S2 = new JSlider();
		S2.setPaintLabels(true);
		S2.setSnapToTicks(true);
		S2.setMajorTickSpacing(1);
		S2.setMaximum(10);
		S2.setBounds(562, 126, 246, 38);
		contentPane.add(S2);
		
		JSlider S3 = new JSlider();
		S3.setSnapToTicks(true);
		S3.setPaintLabels(true);
		S3.setMaximum(10);
		S3.setMajorTickSpacing(1);
		S3.setBounds(562, 188, 246, 42);
		contentPane.add(S3);
		
		JSlider S4 = new JSlider();
		S4.setSnapToTicks(true);
		S4.setPaintLabels(true);
		S4.setMaximum(10);
		S4.setMajorTickSpacing(1);
		S4.setBounds(562, 250, 246, 38);
		contentPane.add(S4);
		
		JSlider S5 = new JSlider();
		S5.setSnapToTicks(true);
		S5.setPaintLabels(true);
		S5.setMaximum(10);
		S5.setMajorTickSpacing(1);
		S5.setBounds(562, 317, 246, 42);
		contentPane.add(S5);
		
		JSlider S6 = new JSlider();
		S6.setSnapToTicks(true);
		S6.setPaintLabels(true);
		S6.setMaximum(10);
		S6.setMajorTickSpacing(1);
		S6.setBounds(562, 379, 246, 38);
		contentPane.add(S6);
		
		JSlider S7 = new JSlider();
		S7.setSnapToTicks(true);
		S7.setPaintLabels(true);
		S7.setMaximum(10);
		S7.setMajorTickSpacing(1);
		S7.setBounds(562, 445, 246, 38);
		contentPane.add(S7);
		
		JLabel lblDs = new JLabel("Anxiety");
		lblDs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDs.setBounds(471, 330, 81, 21);
		contentPane.add(lblDs);
		
		JLabel lblNewLabel_2 = new JLabel("Drowsy");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(471, 387, 81, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Appetite");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(471, 445, 81, 21);
		contentPane.add(lblNewLabel_3);
	
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setSymptomTEntered(0,S1.getValue());
				setSymptomTEntered(1,S2.getValue());
				setSymptomTEntered(2,S3.getValue());
				setSymptomTEntered(3,S4.getValue());
				setSymptomTEntered(4,S5.getValue());
				setSymptomTEntered(5,S6.getValue());
				setSymptomTEntered(6,S7.getValue());
					
				
				
				PrintThreshold();
				
				Patient P = new Patient(
						FirstNameFiled.getText(),
						LastNameFiled.getText(),
						UserNameFiled.getText(),
						PasswordFiled.getText(),   //String password,
						SquestionFiled.getText(),  //String securityQuestionAnswer,
						Dr.getLastName(),		   //String DocName,
						getPrvSym(),			   //int symp[],
						getPrvSym(),			   //int prev1[],
						getPrvSym(),               //int prev2[],
						getSymptom()			   //int threshold[]
								);
				
				if(Dr.addPatientList(P))
				{
					JOptionPane.showMessageDialog(null, "Successfully Created");
					dispose();
					DoctorHomePage DrGUI = new DoctorHomePage(Dr);
					DrGUI.setVisible(true);
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Patient Cannot be Added");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(137, 508, 114, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image BG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(BG));
		lblNewLabel_4.setBounds(0, 0, 884, 560);
		contentPane.add(lblNewLabel_4);

		
	}
}
