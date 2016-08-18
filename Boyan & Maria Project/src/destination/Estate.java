package destination;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Estate {

	private String address;
	private City city;
	//private User owner;
	private Set<String> hotelFacilities = new HashSet<String>();
	
	private Map<String, ArrayList<Room>> rooms = new HashMap<String, ArrayList<Room>>();
	private List<File> images;
	
	private double raiting;
	private byte stars;
	
	public Estate(String address, City city, byte stars){
		this.address = address;
		this.city = city;
		this.stars = stars;
	}
	
	
	
}
