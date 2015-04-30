import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.sql.*;

public class PatientHis extends JFrame{

	private JFrame frame = new JFrame();
	
	private Patient P1;
	JPanel Pan =new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientHis window = new PatientHis();
					window.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*public void displayWindow(){
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PatientHis window = new PatientHis();
						window.setVisible(false);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}*/
	/**
	 * Create the application.
	 */
	public PatientHis(Patient P) {
		P1 = P;
		initialize();
		
	}
	public PatientHis()
	{
		dispose();
	}
	
	public DefaultCategoryDataset dataSetInit(int currentSympt[], int prevSympt1[], int prevSympt2[])
	{
		DefaultCategoryDataset dataset= new DefaultCategoryDataset();
			dataset.setValue(currentSympt[0], "day1", "Pain");
			dataset.setValue(prevSympt1[0], "day2", "Pain");
			dataset.setValue(prevSympt2[0], "day3", "Pain");
			dataset.setValue(currentSympt[1], "day1", "Tiredness");
			dataset.setValue(prevSympt1[1], "day2", "Tiredness");
			dataset.setValue(prevSympt2[1], "day3", "Tiredness");
			dataset.setValue(currentSympt[2], "day1", "Nausea");
			dataset.setValue(prevSympt1[2], "day2", "Nausea");
			dataset.setValue(prevSympt2[2], "day3", "Nausea");
			dataset.setValue(currentSympt[3], "day1", "Depression");
			dataset.setValue(prevSympt1[3], "day2", "Depression");
			dataset.setValue(prevSympt2[3], "day3", "Depression");
			dataset.setValue(currentSympt[4],"day1","Anxiety");	
			dataset.setValue(prevSympt1[4],"day2","Anxiety");
			dataset.setValue(prevSympt2[4],"day3","Anxiety");		
			dataset.setValue(currentSympt[5],"day1","Drowsy");	
			dataset.setValue(prevSympt1[5],"day2","Drowsy");
			dataset.setValue(prevSympt2[5],"day3","Drowsy");	
			dataset.setValue(currentSympt[6],"day1","Appetite");	
			dataset.setValue(prevSympt1[6],"day2","Appetite");
			dataset.setValue(prevSympt2[6],"day3","Appetite");
			
		return dataset;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		frame.setSize(725, 482);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		
		DefaultCategoryDataset dataset= new DefaultCategoryDataset();
		//JOptionPane.showMessageDialog(null, "BUTTON CLICKED!!!");
		//LableMessage.setText("BUTTON CLICKED!!!");
		
		//Pain, Drowsiness, Nausea, Anxiety, and Depression
		/*dataset.setValue(2, "day1","Pain");
		dataset.setValue(5, "day2","Pain");
		dataset.setValue(4, "day3","Pain");
		dataset.setValue(6, "day1", "Drowsiness");
		dataset.setValue(10, "day2", "Drowsiness");
		dataset.setValue(8, "day3", "Drowsiness");
		dataset.setValue(1, "day1", "Nausea");
		dataset.setValue(7, "day2", "Nausea");
		dataset.setValue(5, "day3", "Nausea");
		dataset.setValue(3,"day1","Anxiety");	
		dataset.setValue(8,"day2","Anxiety");
		dataset.setValue(9,"day3","Anxiety");
		dataset.setValue(8, "day1", "Depression");
		dataset.setValue(7, "day2", "Depression");
		dataset.setValue(9, "day3", "Depression");*/
		int test[] = new int[7];
		for (int i=0;i<7; i++)
		{
			test[i]=5;
		}
		DefaultCategoryDataset dataset2= new DefaultCategoryDataset();
		dataset2 = dataSetInit(P1.getEnterSymptomLevel(),P1.getPreviousSymptomLevel1(),P1.getPreviousSymptomLevel2());
		//dataset2 = dataSetInit(test,test,test);
		//P1.getEnter
		//DefaultCategoryDataset dataset2= new DefaultCategoryDataset();

		//JFreeChart chart= ChartFactory.createBarChart(P1.firstName+" "+P1.lastName,"Symptoms", "Levels", dataset2, PlotOrientation.VERTICAL,false,true,false);

		JFreeChart chart= ChartFactory.createBarChart3D("Symptom Report","Symptoms", "Levels", dataset2, PlotOrientation.VERTICAL,true,true,true);
		//JFreeChart chart2= ChartFactory.createBarChart("Symptom Report","Symptoms", "Levels", dataset2, PlotOrientation.VERTICAL,false,true,false);
		chart.setBackgroundPaint(Color.lightGray);
		//JFreeChart chart2= ChartFactory.createBarChart("Grade Report","Student Name", "Marks", dataset2, PlotOrientation.VERTICAL,false,true,false);
		
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(700,350));
		Pan.add(chartPanel);
		
		frame.getContentPane().add(Pan);
		CategoryPlot p=chart.getCategoryPlot();
		p.setRangeGridlinePaint(Color.red);
		p.setBackgroundPaint(Color.WHITE);
		frame.setVisible(true);
//		ChartFrame frame= new ChartFrame("Bar Graph Test",chart,false);
//		
//		frame.setVisible(true);
//		frame.setSize(700,350);
//		frame.setResizable(false);
		//frame2 =new JFrame()
	}

}
