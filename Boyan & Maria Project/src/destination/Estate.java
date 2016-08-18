package destination;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exceptions.EstateException;

public class Estate {

	private String address;
	private City city;
	// private User owner;
	private Set<String> hotelFacilities = new HashSet<String>();

	private Map<String, ArrayList<Room>> rooms = new HashMap<String, ArrayList<Room>>();
	private List<File> images;

	private double raiting;
	private byte stars;

	public Estate(String address, City city, byte stars) throws EstateException {
		if (address != null) {
			this.address = address;
		} else {
			throw new EstateException("Invalid address of the estate!");
		}
		if (city != null) {
			this.city = city;
		} else {
			throw new EstateException("Invalid city!");
		}
		if (stars > 0) {
			this.stars = stars;
		} else {
			throw new EstateException("Ivalid number of stars");
		}
	}

}
