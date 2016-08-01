package patient;

import hospital.Doctor;
import hospital.Gender;
import hospital.Nurse;
import hospital.Person;
import wardSection.Orthopaedy;
import wardSection.Ward;

public class Patient extends Person {

	private Doctor patientDoctor;
	private MedicalPlan medicalPlan;
	private int bedNumber = -1;
	private Ward ward;

	public Patient(String name, int age, String number, Gender gender, Doctor patientDoctor, Ward ward) {
		super(name, age, number, gender);
		if (patientDoctor != null){
			this.patientDoctor = patientDoctor;
			patientDoctor.addPatientToDoctor(this);
		}
		if(ward != null)
			this.ward = ward;
	}

	public boolean isPatientGoHome(){
		if(this.medicalPlan.getCurrentDay() == this.medicalPlan.getMedicalDays())
			return true;
		else
			return false;
	}

	public void getInfo() {
		System.out.format("Patient %s from gender %s is accepted with diagnose %s. \nHis doctor is %s", name,
				gender.name(), medicalPlan.getDiagnose(), this.patientDoctor.getName());
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public MedicalPlan getMedicalPlan() {
		return medicalPlan;
	}

	public void setMedicalPlan(MedicalPlan medicalPlan) {
		this.medicalPlan = medicalPlan;
		this.ward.getBed(this);
	}
	public void setMedicalPlan(String diagnose, Nurse nurse, byte medicalDays){
		this.medicalPlan = new MedicalPlan(diagnose, nurse, (byte)medicalDays);
	}

	public Doctor getPatientDoctor() {
		return this.patientDoctor;
	}
}
