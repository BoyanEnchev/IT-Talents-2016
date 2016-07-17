package hospital;

import patient.Drug;
import patient.Patient;
import wardSection.Ward;

public class Nurse extends Person implements IVisitation {
	
	private int stage;
	private Ward ward;

	public Nurse(String name, int age, String number, Gender gender, int stage, Ward ward) {
		super(name, age, number, gender);
		
		if(stage > 0) 
			this.stage = stage;
		
		if(ward != null)
			this.setWard(ward);
	}
	
	@Override
	public void visitation(){
		
		for(Patient patient : this.ward.patients){
			if(patient.getMedicalPlan().getPatientNurse().equals(this)){
				int room = patient.getBedNumber()/10;
				
				System.out.format("Nurse <%s> give to patient <%s> from setion ward <%s> from room <%d> following drugs: ",
						this.name, patient.getName(), patient.getWard().toString(), room);
				
				for(Drug drug : patient.getMedicalPlan().getDrugs()){
					System.out.print("[" + drug.getName() + "] ");
				}
				System.out.println();
			}
		}
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward nurseWard) {
		this.ward = nurseWard;
	}

	

}
