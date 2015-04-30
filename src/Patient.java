
public class Patient extends User {
	
	//fields
	private final int numOfSymptomes = 7;
	private int[] symptomsThreshold;
	private int[] symptomLevel;
	private int[] previousSymptomLevel1;
	private int[] previousSymptomLevel2;
	private String message;
	private String patientsDoctor;
	private int flag;
	
	//default constructor
	public Patient(){
		super();
		setSymptomsThreshold(new int[numOfSymptomes]);
		setSymptomLevel(new int[numOfSymptomes]);
		setPreviousSymptomLevel1(new int[numOfSymptomes]);
		this.setMessage("");
		this.setPatientsDoctor("");
		flag = 0;
		
	}
	
	//parameterized constructor
	public Patient (String firstName,String lastName,String userName,String password,String securityQuestionAnswer,String DocName,int symp[],int prev1[],int prev2[],int threshold[]){
		
		super(firstName,lastName,userName,password,securityQuestionAnswer);
		this.setMessage("");
		this.setPatientsDoctor(DocName);
		symptomsThreshold= threshold;
		symptomLevel = symp;
		previousSymptomLevel1=prev1;
		previousSymptomLevel2= prev2;
		flag = 0;
	}

	//the following will be accessory functions.
	public int[] getSymptomsThreshold() {
		return symptomsThreshold;
	}
	
	public int[] getEnterSymptomLevel() {
		return symptomLevel;
	}
	
	public int[] getPreviousSymptomLevel1() {
		return previousSymptomLevel1;
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getPatientsDoctor() {
		return patientsDoctor;
	}
	
	//the following will be mutator functions
	public void setSymptomsThreshold(int[] symptomsThreshold) 
	{
		this.symptomsThreshold = symptomsThreshold;
	}

	public void setSymptomLevel(int[] SymptomLevel) 
	{
		Database db = new Database();
		for(int i = 0; i < 7; i++){
			previousSymptomLevel2[i] = previousSymptomLevel1[i];
		}
		for(int i = 0; i < 7; i++){
			previousSymptomLevel1[i] = symptomLevel[i];
		}
		for(int i = 0; i < 7; i++){
			symptomLevel[i] = SymptomLevel[i];
		}
		db.updateSymptoms(this);
		db.closeDatabase();
		
	}
	public void shift()
	{
		previousSymptomLevel2 = previousSymptomLevel1;
		previousSymptomLevel1 = symptomLevel;
	}
	public void setPreviousSymptomLevel1(int[] previousSymptomLevel1) {
		this.previousSymptomLevel1 = previousSymptomLevel1;
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
		
		previousSymptomLevel1[index] = symptom;
	}

	public int[] getPreviousSymptomLevel2() {
		return previousSymptomLevel2;
	}

	public void setPreviousSymptomLevel2(int[] previousSymptomLevel2) {
		this.previousSymptomLevel2 = previousSymptomLevel2;
	}

	public void thresholdCheck(){
		
		Database db = new Database();
		int check = 0;
		for(int i = 0; i < 7; i++){
			if(symptomLevel[i] > symptomsThreshold[i]+1){
				check = 1;
			}
		}
		flag = check;
		db.setNotification(check, this);
		db.closeDatabase();
	}
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flagg) {
		//Database db1 = new Database();
		flag = flagg;
		//db1.setNotification(flagg, this);
		//db1.closeDatabase();
	}
}