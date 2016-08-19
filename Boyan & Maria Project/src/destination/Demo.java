package destination;

import java.time.LocalDate;

import exceptions.ReservationException;
import exceptions.RoomException;
import users.OwnerAccount;
import users.User;

public class Demo {

	public static void main(String[] args) throws RoomException {
		
		Room room = new Room(50,(byte) 4, 1);
		
		try {
		
			room.addReservation(2016, 7, 8, 2016, 7, 15);
			room.addReservation(2016, 7, 15, 2016, 7, 25);
			room.addReservation(2016, 7, 23, 2016, 7, 28);
			room.addReservation(2016, 8, 8, 2016, 8, 25);
			room.addReservation(2017, 7, 8, 2017, 7, 15);
			room.addReservation(2016, 8, 5, 2016, 8, 26);
			
			System.out.println("----------------------------------------");
			
			room.printReservations();
			
			System.out.println("------------------------------------------\n");
			
			OwnerAccount maria = new OwnerAccount("mariika", "Mariika96", "mariika@abv.bg", "Maria", "Ninova");
			
			maria.addEstate("Lazuren Brqg 13", new City("Sunny Beach"), (byte) 5);
			
			maria.createRooms(maria.getEstate("Lazuren Brqg 13"), 2, 0, 5, 50);
			maria.createRooms(maria.getEstate("Lazuren Brqg 13"), 3, 0, 3, 70);
			maria.createRooms(maria.getEstate("Lazuren Brqg 13"), 5, 0, 2, 100);
			
			maria.getEstate("Lazuren Brqg 13").printRooms();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
