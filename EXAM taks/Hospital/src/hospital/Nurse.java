package hospital;

import wardSection.Ward;

public class Nurse extends Person {
	
	private int stage;
	private Ward ward;

	public Nurse(String name, int age, String number, Gender gender, int stage, Ward ward) {
		super(name, age, number, gender);
		
		if(stage > 0) 
			this.stage = stage;
		
		if(ward != null)
			this.setWard(ward);
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward nurseWard) {
		this.ward = nurseWard;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}

}
