package deliverers;

public class BigDeliverer extends Deliverer{

	public BigDeliverer(String name) throws DelivererException {
		super(name);
		// TODO Auto-generated constructor stub
	}



	private static final float CONCESSION = (float) 0.15;
	


	public static float getConcession() {
		return CONCESSION;
	}

}
