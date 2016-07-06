package computer;

class Computer {

	int year;
	double money;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	OperationSystem opSystem;

	Computer(int year, double money, boolean isNotebook, int hardDiskMemory, int freeMemory, OperationSystem opSystem) {
		this.year = year;
		this.money = money;
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
}
