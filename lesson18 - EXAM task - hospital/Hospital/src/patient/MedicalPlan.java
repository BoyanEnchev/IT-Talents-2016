package patient;

import java.util.ArrayList;

import hospital.Nurse;

public class MedicalPlan {

	private String diagnose;
	private ArrayList<Drug> drugs = new ArrayList<Drug>();
	private Nurse patientNurse;
	private byte medicalDays;
	private byte currentDay;

	public MedicalPlan(String diagnose, Nurse nurse, byte medicalDays) {
		setDiagnose(diagnose);
		this.setPatientNurse(nurse);
		setMedicalDays(medicalDays);
	}

	public void addDrug(Drug drug) {
		if (drug != null)
			this.drugs.add(drug);
	}
	
	public ArrayList<Drug> getDrugs(){
		return this.drugs;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		if (diagnose != null)
			this.diagnose = diagnose;
	}

	public byte getMedicalDays() {
		return medicalDays;
	}

	public void setMedicalDays(byte medicalDays) {
		if (medicalDays >= 3 && medicalDays <= 5) {
			this.medicalDays = medicalDays;
		} else {
			System.out.println("Invalid medical period! It would be between 3-5 days");
			this.medicalDays = 3;
		}
	}

	public byte getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(byte currentDay) {
		this.currentDay = currentDay;
	}

	public Nurse getPatientNurse() {
		return patientNurse;
	}

	public void setPatientNurse(Nurse patientNurse) {
		this.patientNurse = patientNurse;
	}
}
