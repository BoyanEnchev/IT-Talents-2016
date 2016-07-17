package patient;

public class Drug {

	private String name;
	
	Drug(String name){
		if(name != null){
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
}
