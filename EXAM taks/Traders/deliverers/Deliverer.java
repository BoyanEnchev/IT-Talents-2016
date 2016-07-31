package deliverers;

public abstract class Deliverer {
	
	private String name;
	private String address;
	private byte workTime;
	
	Deliverer(String name) throws DelivererException{
		if(name != null && name != ""){
			this.name = name;
		}
		else{
			throw new DelivererException("Kvo e tva ime na Deliverer !?");
		}
	}

	public String getName() {
		return name;
	}



}
