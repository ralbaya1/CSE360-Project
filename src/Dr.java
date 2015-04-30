import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;


public class Dr extends JFrame {

	private JPanel contentPane;
	private String name; 
	private Doctor dr; 
	private String [] PatientList;
	private ArrayList<String> PList;
	private JTable table;
	private int pListSize;
	
	
	
	
	public void addPlist()
	{
		PList = new ArrayList<String>();
		for(int i = 0; i<PatientList.length;i++ ){
		PList.add(dr.getPatientList().get(i).getFirstName()+
					", "+ dr.getPatientList().get(i).getLastName());
		}
	}
	public void setListSize()
	{
		PatientList = new String [ dr.getPatientList().size()] ;
	}	
	public void setDr(Doctor D)
	{
		dr = D;
		//setListSize();
		//addPlist();
		System.out.println(dr.getFirstName());
		pListSize = dr.getPatientList().size();
		//System.out.println("The number of patients "+ dr.getPatientList().size());
		//System.out.println("The Size of the list "+ PatientList.length);
		MakeList();
		
		
	}
	public int getListSize()
	{
		return pListSize;
	}
	
	public void MakeList()
	{
		for(int i = 0; i <dr.getPatientList().size(); i++ )
		{
			PatientList[i] = dr.getPatientList().get(i).getFirstName()+
					", "+ dr.getPatientList().get(i).getLastName();
			
			System.out.println(PatientList[i]);
		}
	}
	
	public String [] getList()
	{
		
		//System.out.println("=========================");
		//for(int i = 0; i <PatientList.length; i++ )
		//{
		//	System.out.println(PatientList[i]);
		//}
		return PatientList;
	}
	
	public Doctor getDoctor()
	{
		return dr;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String x)
	{
		name = x;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dr frame = new Dr();
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
	public Dr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(100, 31, 103, 30);
		
		lblNewLabel.setText("Welcome ");//+ dr.getFirstName());
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(getName());
				setName("Doctor");
				lblNewLabel.setText("Welcome "+ dr.getFirstName());
				
				String x [] = getList();
				
			}
		});
		btnNewButton.setBounds(292, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		String [] pNames = getList();
		
		String [] columnName = {"Name"};
		Object [][] data = new Object[3][1];
		for(int i = 0; i <getListSize();i++)
		{
			data[i][0] = pNames[i];
		}
		table = new JTable(data, columnName);
		table.setBounds(56, 72, 123, 135);
		contentPane.add(table);
		
		
		
		//String [] List= new String[getListSize()];
		//for(int i = 0; i <2; i++ )
		//{
		//	List[i] = dr.getPatientList().get(i).getFirstName()+
		//			", "+ dr.getPatientList().get(i).getLastName();
		//	
		//	System.out.println(PatientList[i]);
		//}
		//String str = List[0];
		//String str1 = List[1];
		/*DefaultListModel <String> model = new DefaultListModel<>();
		JList<String> list = new JList<>(model);
		for(int i = 0 ; i < PatientList.length; i ++)
		{
			model.addElement(PatientList[i]);
		}*/
		//String x [] = getList();
		//String [] pl = PList.toArray();
		//String [] pList = {"p1", "p2", "p3"};
		//String [] pList = { str ,str1};
		//JList list = new JList(pList);
		//scrollPane.setViewportView(list);
		
		
	}
}
