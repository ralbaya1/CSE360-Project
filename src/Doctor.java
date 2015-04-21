import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
	
	//fields
	private List<Patient> patientList;
	
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
	
	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
	
	public void addPatientList(Patient E){
		patientList.add(E);
	}
	public void removePatient(Patient E){
		patientList.remove(E);
	}
	public void printList(){
		for(int i = 0; i < patientList.size(); i++){
			System.out.println(patientList.get(i).toString());
		}
	}
	
	
	

}
