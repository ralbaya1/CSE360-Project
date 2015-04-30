import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//Code By: Kyle Steffa
//This class searches the doctor's list of patients, then 
//creates a pop-up notification for flagged patients.

public class NotifyWin extends JFrame{

//public class TESTNotify{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					NotifyWin frame = new NotifyWin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
			
			}
			
		}
		
		});
	}
	
	public NotifyWin(){
		dispose();
	}
	public void Genwindow(Patient p){
		//variable initialization
		JPanel contentPane;
		String fName, lName;
		int PainVal, TiredVal, NauseaVal, DepressVal, AnxiousVal, DrowsyVal, AppetiteVal;
		int PainPVal, TiredPVal, NauseaPVal, DepressPVal, AnxiousPVal, DrowsyPVal, AppetitePVal;
		int PainThres, TiredThres, NauseaThres, DepressThres, AnxiousThres, DrowsyThres, AppetiteThres;

				// Get Name ************************************************
				fName = p.firstName;
				lName = p.lastName;
				
				
				//**********************************************************
				
				// Get Levels **********************************************
				
				PainVal = p.getEnterSymptomLevel()[0];
				TiredVal = p.getEnterSymptomLevel()[1];
				NauseaVal = p.getEnterSymptomLevel()[2];
				DepressVal = p.getEnterSymptomLevel()[3];
				AnxiousVal = p.getEnterSymptomLevel()[4];
				DrowsyVal = p.getEnterSymptomLevel()[5];
				AppetiteVal = p.getEnterSymptomLevel()[6];
				
				
				//**********************************************************
				
				// Get Pre-Levels ******************************************

				
				PainPVal = p.getPreviousSymptomLevel1()[0];
				TiredPVal = p.getPreviousSymptomLevel1()[1];
				NauseaPVal = p.getPreviousSymptomLevel1()[2];
				DepressPVal = p.getPreviousSymptomLevel1()[3];
				AnxiousPVal = p.getPreviousSymptomLevel1()[4];
				DrowsyPVal = p.getPreviousSymptomLevel1()[5];
				AppetitePVal = p.getPreviousSymptomLevel1()[6];
				
				//**********************************************************
				
				// Get Thresholds *****************************************
				
				PainThres = p.getSymptomsThreshold()[0];
				TiredThres = p.getSymptomsThreshold()[1];
				NauseaThres = p.getSymptomsThreshold()[2];
				DepressThres = p.getSymptomsThreshold()[3];
				AnxiousThres = p.getSymptomsThreshold()[4];
				DrowsyThres = p.getSymptomsThreshold()[5];
				AppetiteThres = p.getSymptomsThreshold()[6];
				
				//**********************************************************
				
				setType(Type.POPUP);
				setTitle("Notification");
				setBounds(100, 100, 336, 453);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				getContentPane().setLayout(null);
				

				
				//initialize Colors*****************************************
				Color PainColor = Color.BLACK;
				Color TiredColor = Color.BLACK;
				Color NauseaColor = Color.BLACK;
				Color DepressColor = Color.BLACK;
				Color AnxiousColor = Color.BLACK;
				Color DrowsyColor = Color.BLACK;
				Color AppetiteColor = Color.BLACK;
				
				
				if (PainVal >= (PainThres+2)) //if Pain exceeds threshold
				{
					PainColor = Color.ORANGE;
					if (PainVal >= (PainThres+3))
					{
						PainColor = Color.RED;
					}
				}
				if (TiredVal >= (TiredThres+2)) //if Tired exceeds threshold
				{
					TiredColor = Color.ORANGE;
					if (TiredVal >= (TiredThres+3))
					{
						TiredColor = Color.RED;
					}
				}
				if (NauseaVal >= (NauseaThres+2)) //if Nausea exceeds threshold
				{
					NauseaColor = Color.ORANGE;
					if (NauseaVal >= (NauseaThres+3))
					{
						NauseaColor = Color.RED;
					}
				}
				if (DepressVal >= (DepressThres+2)) //if Depress exceeds threshold
				{
					DepressColor = Color.ORANGE;
					if (DepressVal >= (DepressThres+3))
					{
						DepressColor = Color.RED;
					}
				}
				if (AnxiousVal >= (AnxiousThres+2)) //if Anxious exceeds threshold
				{
					AnxiousColor = Color.ORANGE;
					if (AnxiousVal >= (AnxiousThres+3))
					{
						AnxiousColor = Color.RED;
					}
				}
				if (DrowsyVal >= (DrowsyThres+2)) //if Drowsy exceeds threshold
				{
					DrowsyColor = Color.ORANGE;
					if (DrowsyVal >= (DrowsyThres+3))
					{
						DrowsyColor = Color.RED;
					}
				}
				if (AppetiteVal >= (AppetiteThres+2)) //if Appetite exceeds threshold
				{
					AppetiteColor = Color.ORANGE;
					if (AppetiteVal >= (AppetiteThres+3))
					{
						AppetiteColor = Color.RED;
					}
				}
				//**********************************************************
				

				
				
				//Top Section######################################################
				JLabel JLbLname = new JLabel(lName + ",");
				JLbLname.setHorizontalAlignment(SwingConstants.TRAILING);
				JLbLname.setFont(new Font("Tahoma", Font.PLAIN, 18));
				JLbLname.setBounds(12, 13, 141, 50);
				getContentPane().add(JLbLname);
				
				JLabel JlbFname = new JLabel(fName);
				JlbFname.setFont(new Font("Tahoma", Font.PLAIN, 18));
				JlbFname.setBounds(155, 13, 156, 50);
				getContentPane().add(JlbFname);
				
				JLabel lblSymptom = new JLabel("Symptom");
				lblSymptom.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblSymptom.setBounds(12, 69, 65, 50);
				getContentPane().add(lblSymptom);
				
				JLabel lblLevel = new JLabel("Level");
				lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
				lblLevel.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblLevel.setBounds(109, 69, 90, 50);
				getContentPane().add(lblLevel);
				
				JLabel lblPreviousLevel = new JLabel("Previous Level");
				lblPreviousLevel.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblPreviousLevel.setBounds(217, 69, 94, 50);
				getContentPane().add(lblPreviousLevel);
				
				// Pain ###############################################################
				JLabel lblPain = new JLabel("Pain");
				lblPain.setForeground(PainColor);
				lblPain.setHorizontalAlignment(SwingConstants.LEFT);
				lblPain.setBounds(22, 100, 54, 50);
				getContentPane().add(lblPain);

				JLabel lblPain_lvl = new JLabel(Integer.toString(PainVal));
				lblPain_lvl.setForeground(PainColor);
				lblPain_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblPain_lvl.setBounds(109, 100, 90, 50);
				getContentPane().add(lblPain_lvl);
				
				JLabel lblPain_prelvl = new JLabel(Integer.toString(PainPVal));
				lblPain_prelvl.setForeground(PainColor);
				lblPain_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblPain_prelvl.setBounds(216, 100, 95, 50);
				getContentPane().add(lblPain_prelvl);
				
				// Tired ##############################################################
				JLabel lblTired = new JLabel("Tiredness");
				lblTired.setForeground(TiredColor);
				lblTired.setBounds(22, 130, 65, 50);
				getContentPane().add(lblTired);
				
				JLabel lblTired_lvl = new JLabel(Integer.toString(TiredVal));
				lblTired_lvl.setForeground(TiredColor);
				lblTired_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblTired_lvl.setBounds(109, 130, 90, 50);
				getContentPane().add(lblTired_lvl);
				
				JLabel lblTired_prelvl = new JLabel(Integer.toString(TiredPVal));
				lblTired_prelvl.setForeground(TiredColor);
				lblTired_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblTired_prelvl.setBounds(217, 130, 95, 50);
				getContentPane().add(lblTired_prelvl);
				
				// Nausea #############################################################
				JLabel lblNausea = new JLabel("Nausea");
				lblNausea.setForeground(NauseaColor);
				lblNausea.setBounds(22, 160, 65, 50);
				getContentPane().add(lblNausea);

				JLabel lblNausea_lvl = new JLabel(Integer.toString(NauseaVal));
				lblNausea_lvl.setForeground(NauseaColor);
				lblNausea_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblNausea_lvl.setBounds(109, 160, 90, 50);
				getContentPane().add(lblNausea_lvl);
				
				JLabel lblNausea_prelvl = new JLabel(Integer.toString(NauseaPVal));
				lblNausea_prelvl.setForeground(NauseaColor);
				lblNausea_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblNausea_prelvl.setBounds(216, 160, 95, 50);
				getContentPane().add(lblNausea_prelvl);
				
				// Depress ############################################################
				JLabel lblDepress = new JLabel("Depressed");
				lblDepress.setForeground(DepressColor);
				lblDepress.setBounds(22, 190, 65, 50);
				getContentPane().add(lblDepress);
				
				JLabel lblDepress_lvl = new JLabel(Integer.toString(DepressVal));
				lblDepress_lvl.setForeground(DepressColor);
				lblDepress_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblDepress_lvl.setBounds(109, 190, 90, 50);
				getContentPane().add(lblDepress_lvl);
				
				JLabel lblDepress_prelvl = new JLabel(Integer.toString(DepressPVal));
				lblDepress_prelvl.setForeground(DepressColor);
				lblDepress_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblDepress_prelvl.setBounds(217, 190, 95, 50);
				getContentPane().add(lblDepress_prelvl);
				
				// Anxious ############################################################
				JLabel lblAnxious = new JLabel("Anxious");
				lblAnxious.setForeground(AnxiousColor);
				lblAnxious.setBounds(22, 220, 54, 50);
				getContentPane().add(lblAnxious);
				
				JLabel lblAnxious_lvl = new JLabel(Integer.toString(AnxiousVal));
				lblAnxious_lvl.setForeground(AnxiousColor);
				lblAnxious_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblAnxious_lvl.setBounds(109, 220, 90, 50);
				getContentPane().add(lblAnxious_lvl);
				
				JLabel lblAnxious_prelvl = new JLabel(Integer.toString(AnxiousPVal));
				lblAnxious_prelvl.setForeground(AnxiousColor);
				lblAnxious_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblAnxious_prelvl.setBounds(217, 220, 95, 50);
				getContentPane().add(lblAnxious_prelvl);
				
				// Drowsy #############################################################
				JLabel lblDrowsy = new JLabel("Drowsiness");
				lblDrowsy.setForeground(DrowsyColor);
				lblDrowsy.setBounds(22, 250, 77, 50);
				getContentPane().add(lblDrowsy);
				
				JLabel lblDrowsy_lvl = new JLabel(Integer.toString(DrowsyVal));
				lblDrowsy_lvl.setForeground(DrowsyColor);
				lblDrowsy_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrowsy_lvl.setBounds(109, 250, 90, 50);
				getContentPane().add(lblDrowsy_lvl);
				
				JLabel lblDrowsy_prelvl = new JLabel(Integer.toString(DrowsyPVal));
				lblDrowsy_prelvl.setForeground(DrowsyColor);
				lblDrowsy_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblDrowsy_prelvl.setBounds(217, 250, 95, 50);
				getContentPane().add(lblDrowsy_prelvl);
				
				// Appetite ###########################################################
				JLabel lblAppetite = new JLabel("Appetite");
				lblAppetite.setForeground(AppetiteColor);
				lblAppetite.setBounds(22, 280, 65, 50);
				getContentPane().add(lblAppetite);
				
				JLabel lblAppetite_lvl = new JLabel(Integer.toString(AppetiteVal));
				lblAppetite_lvl.setForeground(AppetiteColor);
				lblAppetite_lvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblAppetite_lvl.setBounds(109, 280, 90, 50);
				getContentPane().add(lblAppetite_lvl);
				
				JLabel lblAppetite_prelvl = new JLabel(Integer.toString(AppetitePVal));
				lblAppetite_prelvl.setForeground(AppetiteColor);
				lblAppetite_prelvl.setHorizontalAlignment(SwingConstants.CENTER);
				lblAppetite_prelvl.setBounds(217, 280, 95, 50);
				getContentPane().add(lblAppetite_prelvl);

				
				// Buttons ############################################################
				JButton btnViewPatient = new JButton("View History");
				btnViewPatient.setBounds(12, 352, 118, 25);
				btnViewPatient.addActionListener( new ActionListener()
				{
				    public void actionPerformed(ActionEvent e)
				    {
				    	dispose(); //closes the window
				        //JOptionPane.showMessageDialog(null, "This Should Be Patient History");
				    	PatientHis pHis = new PatientHis(p);
						//pHis.PatientHis(P);
				    	pHis.setVisible(true);
				    	pHis.dispose();
				    }
				});
				getContentPane().add(btnViewPatient);
				
				JButton btnClose = new JButton("Close");
				btnClose.setBounds(165, 352, 118, 25);
				btnClose.addActionListener( new ActionListener()
				{
				    public void actionPerformed(ActionEvent e)
				    {
				    	dispose(); //closes the window
				    }
				});
				getContentPane().add(btnClose);
				
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
			
		}
		
	}