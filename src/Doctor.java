import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
	
	//fields
	private ArrayList<Patient> patientList;
	
	//default constructor
	public Doctor(){
		super();
		setPatientList(new ArrayList<Patient>());
	}
	
	//parameterized constructor
	public Doctor (String firstName,String lastName,String userName,String password,String securityQuestionAnswer){
		super(firstName,lastName,userName,password,securityQuestionAnswer);
		setPatientList(new ArrayList<Patient>());
	}
	
	public ArrayList<Patient> getPatientList() {
		return patientList;
	}
	
	public Patient getPatient(int index){
		return patientList.get(index);
		
	}
	public void setPatientList(ArrayList<Patient> patientList) {
		this.patientList = patientList;
	}
	
	
	public boolean addPatientList(Patient E){
		//Add if Patient does not exist in database already
		
		if (!patientExist(E.firstName, E.lastName))  
		{
			patientList.add(E);
			Database D1 = new Database();
			// Also add it to the database. 
			D1.addPatient(E);
			return true;
		}
		else return false;
	}
	public void removePatient(Patient E){
		
		//if (!patientExist(E.firstName, E.lastName))  
		//{
			patientList.remove(E);
			Database D1 = new Database();
			
			// Also remove it to the database. 
			D1.removePatientFromDB(E);
			
		//}
		//else return false;
	}
	
	public void printList()
	{
		for(int i = 0; i < patientList.size(); i++)
		{
			System.out.println(patientList.get(i).toString());
		}
	}
	
	public boolean patientExist(String Fname, String Lname)
	{
		boolean exist =false;
		for(int i = 0; i < patientList.size(); i++)
		{
			String fn = patientList.get(i).firstName;
			String ln = patientList.get(i).lastName;
			if(Fname.equals(fn) && Lname.equals(ln))
				exist = true;
		}
		
		return exist;
	}
	
	public Patient returnPatient(String FirstName, String LastName)
	{
		for( int i =  0; i < patientList.size();i++)
		{
			if(FirstName.equals(patientList.get(i).getFirstName()) && LastName.equals(patientList.get(i).getLastName()))
				return patientList.get(i);
				
		}
		return null;
	}
	

}
