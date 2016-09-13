package gasStation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


import java.sql.*;


public class CashDesk implements Runnable {
	
	public static void main(String[] args) {
		
	}

	private static final int NUMBER_OF_COLUMNS = 5;
	private static ConcurrentMap<Integer, List<Payment>> archive = new ConcurrentHashMap<>();
	private static int count = 0;
	private GasStation station;

	private BlockingQueue<CarOwner> waitingOwners = new ArrayBlockingQueue<>(5);
	private int number;

	public CashDesk(GasStation gasStation) throws IOException {
		this.station = gasStation;
		this.number = count;
		CashDesk.count++;
		for (int count = 0; count < NUMBER_OF_COLUMNS; count++) {
			this.archive.put(count, new ArrayList<Payment>());
		}

		File report = new File("reports" + File.separator + "myReportAllPaymentsByCol.txt");
		if (!report.exists()) {
			report.createNewFile();
		}
	}

	@Override
	public void run() {

		while (true) {
			
			while (waitingOwners.isEmpty()) {
				try {
					synchronized (station) {
						station.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (!waitingOwners.isEmpty()) {
				synchronized (archive) {
					Random rand = new Random();
					CarOwner owner;
					try {
						owner = waitingOwners.take();
						System.out.println("CASHDESK: " + owner + " paid!");
						synchronized (station) {
							station.notifyAll();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (station) {
				station.notify();
			}
			
		}
	}

	public boolean isFree() {
		return waitingOwners.isEmpty();
	}

	public void addClient(int columnNumber, CarOwner carOwner, String fuelType, int litres)
			throws InterruptedException {
		this.waitingOwners.put(carOwner);
		LocalDateTime moment = LocalDateTime.now();
		this.archive.get(columnNumber).add(new Payment(litres, fuelType, moment));
		
		try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsystem" , "root", "b15q14__" );
			Statement mySt = myCon.createStatement();
			String query = "insert into station_loadings " + " (kolonka_number, fuel_type, fuel_quantity, loading_time)"
							+ "values ('" + columnNumber + "', '" + fuelType + "', '" + litres + "', '" + moment + "')";
			mySt.executeUpdate(query);
			myCon.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public boolean containsClient(CarOwner carOwner) {
		return this.waitingOwners.contains(carOwner);
	}

	public void printPayments() {

		this.archive.forEach((colNumber, payments) -> System.out.println(payments));

		try {
			PrintWriter pw = new PrintWriter("reports" + File.separator + "myReportAllPaymentsByCol.txt");
			for (int column = 0; column < NUMBER_OF_COLUMNS; column++) {
				pw.append("Column: " + column + "\n");
				for (Payment payment : this.archive.get(column)) {
					pw.append(payment.toString() + "\n");
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private class Payment {

		private int litres;
		private String fuelType;
		private LocalDateTime fuelTime;
		
		
		public Payment(int litres, String fuelType, LocalDateTime fuelTime) {

			this.litres = litres;
			this.fuelType = fuelType;
			this.fuelTime = fuelTime;
		}

		@Override
		public String toString() {
			return "Payment [litres=" + litres + ", fuelType=" + fuelType + ", fuelTime=" + fuelTime + "]";
		}

	}

}
