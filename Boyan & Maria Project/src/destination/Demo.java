package destination;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import exceptions.ReservationException;
import exceptions.RoomException;

public class Demo {

	public static void main(String[] args) throws RoomException {
		
		Room room = new Room(50,(byte) 4);
		/*
		System.out.println(room.dates.length);
		
		for (int month = 0; month < room.dates.length; month++) {
			for (int day = 0; day < room.dates[month].length; day++) {
				System.out.println("Mesec nomer " + (month+1) + ", day nomer: " + (day+1) + " , value = " + room.dates[month][day]);
			}
		}*/
		
		
		LocalDate d1 = LocalDate.of(2015, 10, 1);
		LocalDate d2 = LocalDate.of(2015, 10, 31);	
		
		try {
			/*room.addReservation(LocalDate.of(2016, 6, 10), LocalDate.of(2016, 6, 20));
			room.addReservation(LocalDate.of(2016, 6, 25), LocalDate.of(2016, 7, 3));
			room.addReservation(LocalDate.of(2016, 7, 10), LocalDate.of(2016, 7, 20));
			room.addReservation(LocalDate.of(2017, 7, 25), LocalDate.of(2017, 8, 5));
			room.addReservation(LocalDate.of(2016, 8, 10), LocalDate.of(2016, 8, 20));
			
			//invalid reservations:
			room.addReservation(LocalDate.of(2016, 6, 17), LocalDate.of(2016, 6, 23));
			room.addReservation(LocalDate.of(2016, 8, 7), LocalDate.of(2016, 9, 2));
			System.out.println("----------------------------");
			room.addReservation(LocalDate.of(2016, 7, 8), LocalDate.of(2016, 7, 10));
			room.addReservation(LocalDate.of(2016, 6, 20), LocalDate.of(2016, 6, 26));*/
			
			
			room.addReservation(2016, 7, 8, 2016, 7, 15);
			room.addReservation(2016, 7, 15, 2016, 7, 25);
			room.addReservation(2016, 7, 23, 2016, 7, 28);
			room.addReservation(2016, 8, 8, 2016, 8, 25);
			room.addReservation(2017, 7, 8, 2017, 7, 15);
			room.addReservation(2016, 8, 5, 2016, 8, 26);
			
			System.out.println("----------------------------------------");
			
			room.printReservations();
			
			RoomWithChildren room2 = new RoomWithChildren(50, (byte)2, (byte)1);
			room2.addReservation(2016, 9, 10, 2016, 9, 15);
			
			
		} catch (ReservationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
