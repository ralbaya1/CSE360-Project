import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JList;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.Font;

import javax.swing.SwingConstants;


public class DoctorHomePage extends JFrame {

	private JPanel contentPane;
	private Doctor dr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorHomePage frame = new DoctorHomePage();
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
	public DoctorHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//String name = dr.getFirstName();
		
		JLabel DrNameLable = new JLabel("Welcome Dr. "+dr.getFirstName() + " " + dr.getLastName());//dr.getFirstName() + " " + dr.getLastName());
		DrNameLable.setHorizontalAlignment(SwingConstants.LEFT);
		DrNameLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		DrNameLable.setBounds(45, 11, 337, 33);
		contentPane.add(DrNameLable);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegistrationGUI reg = new RegistrationGUI();
				reg.setDoctor(dr);
				reg.setVisible(true);
			}
		});
		btnAddPatient.setBounds(250, 133, 150, 33);
		contentPane.add(btnAddPatient);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 70, 156, 167);
		contentPane.add(scrollPane);
		//store patient names in 
		
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setForeground(Color.BLACK);
		list.setBackground(Color.WHITE);
		String patientName;
		/*if(list.getSelectedValue() != null)
		{
			patientName = list.getSelectedValue().toString();
		}
		else
		{
			patientName = "";
		}*/
				
				

		JButton btnNewButton_2 = new JButton("View History");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				int index = list.getSelectedIndex();
				
			
				
				//PatientHistoryWindow page = new PatientHistoryWindow(dr.returnPatient(dr.getPatientList().get(index).getFirstName(), dr.getPatientList().get(index).getLastName() ));
				//page.displayWindow();
				
			}
		});
		btnNewButton_2.setBounds(250, 197, 150, 33);
		contentPane.add(btnNewButton_2);
		
		//remove Patient
		JButton btnNewButton = new JButton("Remove Patient");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				int index = list.getSelectedIndex();
				
				//patientList[index] = "removed";
				System.out.println(dr.getPatientList().get(index).getFirstName());
				dr.removePatient(dr.getPatientList().get(index));			
				
				revalidate();
				repaint();
				JOptionPane.showMessageDialog(null, "Successfully removed");
			}
		});
		btnNewButton.setBounds(250, 73, 150, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblPatientsList = new JLabel("Patients List");
		lblPatientsList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatientsList.setBounds(67, 44, 109, 23);
		contentPane.add(lblPatientsList);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SelectLogInGUI PogramGUI = new SelectLogInGUI();
				PogramGUI.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(66, 248, 120, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel BackGround = new JLabel("");
		Image BackG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		BackGround.setIcon(new ImageIcon(BackG));
		BackGround.setBounds(0, 0, 433, 312);
		contentPane.add(BackGround);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(196, 22, 46, 14);
		contentPane.add(lblNewLabel);
	}
	
	/**************************************************************/
	//parmaterized constructor
	public DoctorHomePage(Doctor Dr) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//String name = dr.getFirstName();
		
		
		
		JLabel DrNameLable = new JLabel("Welcome Dr. "+Dr.getFirstName() + " " + Dr.getLastName());//dr.getFirstName() + " " + dr.getLastName());
		DrNameLable.setHorizontalAlignment(SwingConstants.LEFT);
		DrNameLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		DrNameLable.setBounds(45, 11, 337, 33);
		contentPane.add(DrNameLable);
		
		DrNameLable.setText("Welcom Dr. "+Dr.getFirstName() + " " + Dr.getLastName());
		
		contentPane.add(DrNameLable);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegistrationGUI reg = new RegistrationGUI();
				reg.setDoctor(Dr);
				reg.setVisible(true);
			}
		});
		btnAddPatient.setBounds(250, 133, 150, 33);
		contentPane.add(btnAddPatient);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 70, 156, 167);
		contentPane.add(scrollPane);
		
		String [] PatientList;
		
		PatientList = new String[Dr.getPatientList().size()];
		for(int i = 0; i <Dr.getPatientList().size(); i++ )
		{
			PatientList[i] = Dr.getPatientList().get(i).getFirstName()+", "+ Dr.getPatientList().get(i).getLastName();
			//System.out.println("Size of List "+ PatientList.length);
			System.out.println(PatientList[i]);
		
		}
		
		JList list = new JList(PatientList);
		scrollPane.setViewportView(list);
		list.setForeground(Color.BLACK);
		list.setBackground(Color.WHITE);
		String patientName;
		/*if(list.getSelectedValue() != null)
		{
			patientName = list.getSelectedValue().toString();
		}
		else
		{
			patientName = "";
		}*/
				
				

		JButton btnNewButton_2 = new JButton("View History");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = list.getSelectedIndex();
				if(index>=0)
				{
				
				
				System.out.println(PatientList[index]);
				Patient myPatient = Dr.getPatient(index);
				PatientHis pHis = new PatientHis(myPatient);
				//pHis.PatientHis(P);
		    	pHis.setVisible(true);
		    	pHis.dispose();
				
				//PatientHistoryWindow page = new PatientHistoryWindow(dr.returnPatient(dr.getPatientList().get(index).getFirstName(), dr.getPatientList().get(index).getLastName() ));
				//page.displayWindow();
				}
				
			}
		});
		btnNewButton_2.setBounds(250, 197, 150, 33);
		contentPane.add(btnNewButton_2);
		
	/*	
		
		
		
		
	
		*/
		//remove Patient
		JButton btnNewButton = new JButton("Remove Patient");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				int index = list.getSelectedIndex();
				if(index>=0)
				{
				
				System.out.println(index);
				//patientList[index] = "removed";
				//Dr.removePatient(Dr.returnPatient(Dr.getPatientList().get(index).getFirstName(), Dr.getPatientList().get(index).getLastName() ));			
				//System.out.println(dr.getPatientList().get(index).getFirstName());
				
				Patient myPatient = Dr.getPatient(index);
				System.out.println(myPatient.getFirstName());
				Dr.removePatient(myPatient);
				Dr.printList();
				
				
				
				//list.revalidate();
				//list.repaint();
				JOptionPane.showMessageDialog(null, "Successfully removed");
				
				dispose();
				DoctorHomePage DrGUI = new DoctorHomePage(Dr);
				DrGUI.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(250, 73, 150, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblPatientsList = new JLabel("Patients List");
		lblPatientsList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatientsList.setBounds(67, 44, 109, 23);
		contentPane.add(lblPatientsList);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SelectLogInGUI PogramGUI = new SelectLogInGUI();
				PogramGUI.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(45, 260, 120, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel BackGround = new JLabel("");
		Image BackG = new ImageIcon(this.getClass().getResource("/LWhite.png")).getImage();
		BackGround.setIcon(new ImageIcon(BackG));
		BackGround.setBounds(0, 0, 419, 312);
		contentPane.add(BackGround);
	}
}
