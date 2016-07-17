package hospital;

public class Doctor extends Person  implements IVisitation {

	private String specialization;
	private boolean isFree;

	public Doctor(String name, int age, String number, Gender gender) {
		super(name, age, number, gender);
		this.specialization = "Unknown";
		this.isFree = true;
	}

	public Doctor(String name, int age, String number, Gender gender, String specialization, boolean isFree) {
		this(specialization, age, specialization, gender);
		this.specialization = specialization;
		setFree(isFree);
	}
	
	@Override
	public void visitation(){
		
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub

	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

}
