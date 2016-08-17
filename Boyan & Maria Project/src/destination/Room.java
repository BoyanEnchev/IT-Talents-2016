package destination;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Room {

	private String type;
	private int priceForNight;
	private byte numAdults;
	private Set<String> roomFacilities;
	public boolean[][] dates = new boolean[12][];

	public Room(int priceForNight, byte numAdults) {
		setType(numAdults);
		this.priceForNight = priceForNight;
		this.numAdults = numAdults;
		this.roomFacilities = new HashSet<String>();
		generateDates();
	}

	private void generateDates() {

		for (int month = 1; month <= dates.length; month++) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dates[month - 1] = new boolean[31];
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dates[month - 1] = new boolean[30]; break;
			case 2: {
				int year = Calendar.getInstance().get(Calendar.YEAR);
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					dates[month - 1] = new boolean[29]; break;
				} else {
					dates[month - 1] = new boolean[28]; break;
				}
			}
			}
		}

	}

	private void setType(byte numAdults) {
		if(numAdults > 0){
			switch(numAdults){
			case 1: type = "Single Room"; break;
			case 2: type = "Double Room"; break;
			case 3:	type = "Thriple Room"; break;
			case 4: type = "Apart for four"; break;
			case 5:
			case 6: type= "Apart for six"; break;
			default: type= "Apart for six+"; break;
			}
		this.type = type;
		}
	}

}
