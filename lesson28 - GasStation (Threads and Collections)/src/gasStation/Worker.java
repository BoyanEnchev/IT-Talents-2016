package gasStation;

import java.util.Random;

import exceptions.WorkerException;

public class Worker implements Runnable {

	private GasStation station;

	public Worker(GasStation station) throws WorkerException {
		if (station != null)
			this.station = station;
		else
			throw new WorkerException("Invalid Gas Station!");
	}

	@Override
	public void run() {

		while (true) {
			while (station.isEmpty()) {
				try {
					System.out.println("WORKER: Nqma nikoi, chakam kolite!");
					synchronized (station) {
						station.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (!station.isEmpty()) {
				Column column = station.getColumnToFuel();

				while (!column.isEmpty()) {
					System.out.println("WORKER : Zarejdam kolkonka nomer: " + column.getNumber());
					try {
						CarOwner carOwner = column.refuelCar();
						Thread.currentThread().sleep(1000);

						synchronized (station) {
							while (this.station.containsOwner(carOwner)) {
								station.wait();
							}
							if (!this.station.containsOwner(carOwner)) {
								synchronized (station) {
									String fuelType = GasStation.fuelTypes[new Random().nextInt(GasStation.fuelTypes.length)];
									station.addClientToCashDesk(column.getNumber(), carOwner, fuelType, (new Random().nextInt(30)+10));
									carOwner.setReady(true);
									
									station.notify();
								}
							}
						}
						synchronized (carOwner) {
							carOwner.notify();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				synchronized (station) {
					station.notify();
				}
			}
		}

	}

}
