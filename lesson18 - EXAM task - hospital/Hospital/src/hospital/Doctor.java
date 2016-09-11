package hospital;

import java.awt.List;
import java.util.ArrayList;

import patient.Patient;

public class Doctor extends Person  implements IVisitation {

	private String specialization;
	private boolean isFree;
	private ArrayList<Patient> patients;

	public Doctor(String name, int age, String number, Gender gender) {
		super(name, age, number, gender);
		this.specialization = "Unknown";
		this.isFree = true; 
		patients = new ArrayList<Patient>();
	}

	public Doctor(String name, int age, String number, Gender gender, String specialization, boolean isFree) {
		this(specialization, age, specialization, gender);
		this.specialization = specialization;
		setFree(isFree);
	}
	
	@Override
	public void visitation(){
		
		for(Patient patient : this.patients){
			System.out.format("Doctor <%s> visit patient <%s> in room <%d>, from ward: <%s>\n",
								name, patient.getName(), patient.getBedNumber()/10, patient.getWard().toString());
		}
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub

	}
	
	public void addPatientToDoctor(Patient patient){
		this.patients.add(patient);
	}
	
	public ArrayList<Patient> getAllPatients(){
		return this.patients;
	}
	
	public Patient getPatientByIndex(int index){
		return (Patient) this.patients.get(index);
	}
	
	public void removePatientFromDoctor(Patient patient){
		if(patients.contains(patient)){
			this.patients.add(patient);
		}
		else{
			System.out.println("This patient doesn't exist in " + this.name + " list.");
		}
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

}
