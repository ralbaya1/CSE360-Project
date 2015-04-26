import java.awt.Image;
import java.sql.*;
import java.util.*;


public class main {

	
	public static void main(String[] args) {
	
		Database D1 = new Database(); 
		
		int sypt[] = new int[7];
		int psypt1[] = new int[7];
		int psypt2[] = new int[7];
		int thresh[] = new int[7];
		String dname ="Doc2";
		for (int i =0; i<7; i++)
		{
			sypt[i]= i;
			psypt1[i]=i+1;
			psypt2[i]=i+2;
			thresh[i]=i+5;
		}
		
		ArrayList<String[]> names = new ArrayList<String[]>();
		D1.addPatient("asdf", "jkl", 1, "JD", "pass", "City Born", "Minn", sypt, psypt1,psypt2, thresh,dname);
		names=D1.getPatientsNameList(); 
		//for (int j = 0; j <2; j++)
		D1.removePatientFromDB("Akaramba", "Peter");
		//Patient 
		//{
		ArrayList<Patient> names11 = new ArrayList<Patient>();
		names11=D1.getPatientList("Doc1");
		//D1.addPatient(names11.get(5));
		//D1.addPatient();
		String names1[];
			for (int k=0; k<names11.size();k++)
			{
				//names1 = names.get(k);
				Patient test= new Patient();
				test = names11.get(k);
				System.out.print("\nFrist Name: "+test.getFirstName()+"   Last Name: "+test.getLastName()+"\t");
				int thre[] = test.getSymptomsThreshold();
				//System.out.println(test.getSecurityQuestionAnswer());
				for (int i = 0; i<thre.length; i++)
					System.out.print("Symptom"+i+": "+thre[i]+"\t");
				System.out.println();
			}
			

	}

}
