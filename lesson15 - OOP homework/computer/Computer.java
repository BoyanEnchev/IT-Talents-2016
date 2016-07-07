package computer;

class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	OperationSystem opSystem;

	Computer() {
		isNotebook = false;
		opSystem = OperationSystem.Windows;
	}

	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, OperationSystem opSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.opSystem = opSystem;
	}

	public void changeOperationSystem(OperationSystem opSystem) {
		this.opSystem = opSystem;
	}

	public void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}

	int comparePrice(Computer otherPC) {

		if (this.price < otherPC.price) {
			return 1;
		} else {
			if (this.price > otherPC.price) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
