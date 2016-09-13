package postoffice;

public abstract class PostObject {

	private String firstname;
	private String lastname;
	private String address;
	protected double tax;
	
	public PostObject(Citizen citizen){
		this.firstname = citizen.getFirstname();
		this.lastname = citizen.getLastname();
		this.address = citizen.getAddress();
		this.tax = setTax();
	}
	
	
	public double getTax() {
		return tax;
	}
	public abstract double setTax();
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return getClass().getName() + " [" + firstname + " " + lastname + ", address=" + address + ", tax=" + tax + "]";
	}
	
	
	
}
