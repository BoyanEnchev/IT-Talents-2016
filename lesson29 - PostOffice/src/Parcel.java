package postoffice;

public class Parcel extends PostObject{
	
	private static final int DEFAULT_PARCEL_TAX = 2;
	private int x;
	private int y;
	private int z;
	private boolean isFragile;

	public Parcel(Citizen citizen, int x, int y, int z, boolean isFragile) {
		super(citizen);
		System.out.println(x + " " + y + " " + z);
		this.x = x;
		this.y = y;
		this.z = z;
		this.isFragile = isFragile;
		this.tax = setTax();
	}

	@Override
	public double setTax() {
		
		double tempTax = DEFAULT_PARCEL_TAX;
		
		if(x > 60 || y > 60 || z > 60){
			tempTax = tempTax + tempTax * 0.5;
			if(isFragile){
				
				return (tempTax + tempTax * 0.5);
			}
			else return tempTax;
		}
		
		return DEFAULT_PARCEL_TAX;
	}

}
