package gasStation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GasStation {

	public static final String[] fuelTypes = {"petrol", "diesel" , "gas"};
	private static final int NUM_OF_CASHDESKS = 2;
	private static final int NUM_OF_COLUMNS = 5;
	private List<CashDesk> cashdesks = new ArrayList<CashDesk>();
	private List<Column> columns = new ArrayList<Column>();

	public GasStation() {
		generateColumns();
	}


	public boolean isEmpty() {
		for (Column column : columns) {
			if (column.isEmpty())
				continue;
			else
				return false;
		}
		return true;
	}

	public Column getColumnToFuel() {
		for (Column column : columns) {
			if (!column.isEmpty())
				return column;
		}
		return new Column();
	}
	

	public boolean containsOwner(CarOwner carOwner) {
		for(CashDesk cashdesk : cashdesks){
			if(cashdesk.containsClient(carOwner))
				return true;
		}
		return false;
	}

	public Column getRandomColumn() {
		Random rand = new Random();
		return columns.get(rand.nextInt(columns.size()));
	}


	public CashDesk getRandomCashDesk() {
		Random rand = new Random();
		return cashdesks.get(rand.nextInt(cashdesks.size()));
	}

	
	private void generateColumns() {
		for (int count = 0; count < NUM_OF_COLUMNS; count++) {
			columns.add(new Column());
		}
	}

	public void generateCashDesks(CashDesk cash1, CashDesk cash2) {
		this.cashdesks.add(cash1);
		this.cashdesks.add(cash2);
	}


	public void addClientToCashDesk(int columnNumber, CarOwner carOwner, String fuelType, int litres) throws InterruptedException {
		

		CashDesk cashdesk = cashdesks.get(new Random().nextInt(cashdesks.size()));
		cashdesk.addClient(columnNumber, carOwner, fuelType, litres);
		
	}



}
