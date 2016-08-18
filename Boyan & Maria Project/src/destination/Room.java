package destination;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import exceptions.ReservationException;
import exceptions.RoomException;

public class Room {

	private static int countNumbers = 0;
	
	private int number;
	private String type;
	private int priceForNight;
	private byte numAdults;
	private Set<String> roomFacilities;
	private Set<Reservation> reservations;

	public Room(int priceForNight, byte numAdults) throws RoomException {
		this.number = ++countNumbers;
		setType(numAdults);
		if(priceForNight>0){
		this.priceForNight = priceForNight;}
		else{
			throw new RoomException("Invalid price for the room!");
		}
		if(numAdults>0){
		this.numAdults = numAdults;
		}
		else{
			throw new RoomException("Invalid number of adults");
		}
		roomFacilities = new HashSet<String>();
		reservations = new TreeSet<Reservation>(new ReservationComparator());
	}

	private void setType(byte numAdults) {
		if (numAdults > 0) {
			switch (numAdults) {
			case 1:	type = "Single Room"; break;
			case 2:	type = "Double Room"; break;
			case 3: type = "Thriple Room"; break;
			case 4: type = "Apart for four"; break;
			case 5:
			case 6: type = "Apart for six"; break;
			default: type = "Apart for six+"; break;
			}
		}
	}
	
	public void addReservation(int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay) throws ReservationException {
		Reservation newRes = new Reservation(startYear, startMonth, startDay, endYear, endMonth, endDay);
			
		if(!reservations.contains(newRes)){
			this.reservations.add(newRes);
			System.out.println("Room #" + this.number + " is reserved for period: " + startDay + " " + startMonth + " " + startYear +
								" - " + endDay + " " + endMonth + " " + endYear);
		}
		else{
			System.out.println("Sorry, the room is reserved for this period: " + startDay + " " + startMonth + " " + startYear +
					" - " + endDay + " " + endMonth + " " + endYear);
		}		
	}

	public void printReservations(){
		for(Reservation res : this.reservations){
			System.out.println(res);
		}
	}
	
	
	protected class Reservation {
		
		private LocalDate startDate;
		private LocalDate endDate;

		Reservation(LocalDate startDay, LocalDate endDay) throws ReservationException {
			if (startDay != null && endDay != null) {
				if (startDay.compareTo(endDay) > 0)
					throw new ReservationException("Invalid reservation! Check your dates again!");
				else {
					this.startDate = startDay;
					this.endDate = endDay;
				}
			}else{
				throw new ReservationException("Invalid reservation! Dates cannot be null!");
			}
		}
		Reservation(int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay) throws ReservationException {
			
			if(isDateValid(startYear,startMonth,startDay) && (isDateValid(endYear,endMonth,endDay))){
				if(LocalDate.of(startYear, startMonth, startDay).compareTo(LocalDate.of(endYear, endMonth, endDay)) < 0){
					this.startDate = LocalDate.of(startYear, startMonth, startDay);
					this.endDate = LocalDate.of(endYear, endMonth, endDay);
				}else{
					throw new ReservationException("Start date should be before end date");
				}
			}
		}
		
		private boolean isDateValid(int year, int month, int day) throws ReservationException{
			if(year < LocalDate.now().getYear() || month < 0 || month > 12 || day < 1)
				throw new ReservationException("The date is invalid! Please, try again!");
			switch(month){
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				if(day > 31){
					throw new ReservationException("The day cannot be bigger than 31 for this month!");
				}break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day > 30){
					throw new ReservationException("The day cannot be bigger than 30 for this month!");
				}break;
			case 2:
				if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && day > 29){
					throw new ReservationException(year + " is leap year! February cannot have more than 29 days.");
				}
				else
					if(day > 28){
						throw new ReservationException("Days during this year cannot be more than 28.");
					}
				break;
			}
			return true;
		}
	
		@Override
		public String toString() {
			return "Reservation [startDay=" + startDate + ", endDay=" + endDate + "]";
		}

	}
	
	public class ReservationComparator implements Comparator<Reservation>{

		@Override
		public int compare(Reservation tempRes, Reservation newRes) {
			if ((newRes.startDate.compareTo(tempRes.endDate) < 0 && tempRes.endDate.compareTo(newRes.endDate) < 0)	// 1.check if: start < other.start < end < other.end
				||(newRes.startDate.compareTo(tempRes.startDate) < 0 && tempRes.startDate.compareTo(newRes.endDate) < 0) 	// 2.check if: other.start < start < other.end < end
				||	(tempRes.startDate.compareTo(newRes.startDate) < 0 && newRes.endDate.compareTo(tempRes.endDate) < 0)){	// 3.check if: start < other.start < other.end < end){	// 4.check if: other.start < start < end < other.end
				return 0;
			}else{
				return tempRes.startDate.compareTo(newRes.startDate);
			}

		}
	}

}
