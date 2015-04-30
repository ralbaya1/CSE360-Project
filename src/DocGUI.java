import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;


public class DocGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String [] PatientList;
	private Doctor Dr;
	
	public void setDoctor(Doctor d)
	{
		Dr = d;
		System.out.println(Dr.getFirstName());
		System.out.println(Dr.getPatientList().size());
		
		//setListSize();
		if (Dr != null)
			MakeList();
		else
			System.out.println("Empty");
	}
	//public void setListSize()
	//{
		//PatientList = new String[Dr.getPatientList().size()];
	//}
	
	public void MakeList()
	{
		PatientList = new String[Dr.getPatientList().size()];
		for(int i = 0; i <Dr.getPatientList().size(); i++ )
		{
			PatientList[i] = Dr.getPatientList().get(i).getFirstName()+", "+ Dr.getPatientList().get(i).getLastName();
			//System.out.println("Size of List "+ PatientList.length);
			System.out.println(PatientList[i]);
		
		}
	
	}
	
	//acessors
	public String[] getPatientList()
	{
		
		return PatientList;
	}

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocGUI frame = new DocGUI();
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
	//String [] PatientList;
	//public void setDoctor(Doctor Dr)
	//{
	//	PatientList = new String[Dr.getPatientList().size()];
	//	for(int i = 0; i <Dr.getPatientList().size(); i++ )
	//	{
	//		PatientList[i] = Dr.getPatientList().get(i).getFirstName()+", "+ Dr.getPatientList().get(i).getLastName();
	//		//System.out.println("Size of List "+ PatientList.length);
	//		System.out.println(Dr.getPatientList().get(i).getFirstName());
	//	}
	//}
	public DocGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		String patient1 = getPatientList()[0];
		String patient2 = getPatientList()[1];
		String patient3 = getPatientList()[2];
		String patient4 = getPatientList()[3];
		String patient5 = getPatientList()[4];
		//System.out.println("List of Patients: "+ patient1 + " " + patient2+ " " + patient3+ " " + patient4+ " " + patient5);
		
		String [] name = {"p1","p2","p3","p4","5"};
		
		String [] columnName = {"Name"};
		Object[][] data = new Object[3][1];
		
		for(int i = 0; i < 3 ; i++)
		{
			data[i][0] = name [i];
		}
		table = new JTable(data, columnName);
		table.setBounds(84, 52, 205, 159);
		contentPane.add(table);
	}
	
	
	
	
	
	
	public DocGUI(Doctor Dr) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] PatientList;
		
		PatientList = new String[Dr.getPatientList().size()];
		for(int i = 0; i <Dr.getPatientList().size(); i++ )
		{
			PatientList[i] = Dr.getPatientList().get(i).getFirstName()+", "+ Dr.getPatientList().get(i).getLastName();
			//System.out.println("Size of List "+ PatientList.length);
			System.out.println(PatientList[i]);
		
		}
		
		String patient1 = PatientList[0];
		String patient2 = PatientList[1];
		String patient3 = PatientList[2];
		String patient4 = PatientList[3];
		String patient5 = PatientList[4];
		
		System.out.println("List of Patients: "+ patient1 + " " + patient2+ " " + patient3+ " " + patient4+ " " + patient5);
		
		String [] name = {patient1,patient2,patient3,patient4,patient5};
		
		String [] columnName = {"Name"};
		//Object[][] data = new Object[Patient.length][1];
		
		//for(int i = 0; i < 3 ; i++)
		//{
		//	data[i][0] = name [i];
		//}
		//table = new JTable(data, columnName);
		table.setBounds(84, 52, 205, 159);
		contentPane.add(table);
		
	}


	
	
	
}
