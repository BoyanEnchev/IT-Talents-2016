package destination;

public class Demo {

	public static void main(String[] args) {
		
		Room room = new Room(50,(byte) 4);
		
		System.out.println(room.dates.length);
		
		for (int month = 0; month < room.dates.length; month++) {
			for (int day = 0; day < room.dates[month].length; day++) {
				System.out.println("Mesec nomer " + (month+1) + ", day nomer: " + (day+1) + " , value = " + room.dates[month][day]);
			}
		}

	}

}
