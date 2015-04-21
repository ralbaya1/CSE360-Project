
public class Patient extends User {
	
	//fields
	private final int numOfSymptomes = 7;
	private int[] symptomsThreshold;
	private int[] symptomLevel;
	private int[] previousSymptomLevel;
	private String message;
	private String patientsDoctor;
	
	//default constructor
	public Patient(){
		super();
		setSymptomsThreshold(new int[numOfSymptomes]);
		setEnterSymptomLevel(new int[numOfSymptomes]);
		setPreviousSymptomLevel(new int[numOfSymptomes]);
		this.setMessage("");
		this.setPatientsDoctor("");
		
	}
	
	//parameterized constructor
	public Patient (String firstName,String lastName,String userName,String password,String securityQuestionAnswer){
		super(firstName,lastName,userName,password,securityQuestionAnswer);
		this.setMessage("");
		this.setPatientsDoctor("");
	}

	//the following will be accessor  functions
	public int[] getSymptomsThreshold() {
		return symptomsThreshold;
	}
	
	public int[] getEnterSymptomLevel() {
		return symptomLevel;
	}
	
	public int[] getPreviousSymptomLevel() {
		return previousSymptomLevel;
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getPatientsDoctor() {
		return patientsDoctor;
	}
	
	//the following will be mutator functions
	public void setSymptomsThreshold(int[] symptomsThreshold) {
		this.symptomsThreshold = symptomsThreshold;
	}

	public void setEnterSymptomLevel(int[] enterSymptomLevel) {
		this.symptomLevel = enterSymptomLevel;
	}

	public void setPreviousSymptomLevel(int[] previousSymptomLevel) {
		this.previousSymptomLevel = previousSymptomLevel;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setPatientsDoctor(String patientsDoctor) {
		this.patientsDoctor = patientsDoctor;
	}
	
	public void setSymptom(int symptom, int index){
		symptomLevel[index] = symptom;
	}
	
	public void setThreshold(int threshold, int index){
		
		symptomsThreshold[index] = threshold;
	}
	
	public void setSymptomLevel(int symptom, int index){
		
		previousSymptomLevel[index] = symptom;
	}
}
