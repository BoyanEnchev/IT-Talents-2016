package postoffice;

public class Letter extends PostObject{

	public Letter(Citizen citizen) {
		super(citizen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double setTax() {
		
		return 0.5;
	}

}
