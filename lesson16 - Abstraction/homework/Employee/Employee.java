package employee;

public class Employee {

	static int WORKING_HOURS_PER_DAY = 8;

	private String name = "";
	private Task currTask;
	private int hoursLeft;
	private AllWork allWork;

	Employee(String name) {
		setName(name);
		setWorkHours(WORKING_HOURS_PER_DAY);
	}

	Employee(String name, AllWork allWork) {
		setName(name);
		setWorkHours(WORKING_HOURS_PER_DAY);
		if (allWork != null)
			this.allWork = allWork;
	}

	public void addTask(Task newTask) {
		setCurrTask(newTask);
	}

	public void work() {

		if (this.currTask != null) {

			// if(this.currTask == null) return;

			if (this.hoursLeft > currTask.getWorkingHours()) {

				this.hoursLeft -= currTask.getWorkingHours();
				currTask.setWorkingHours(0);
				showReport();
				this.setCurrTask(null);

			} else {
				if (this.hoursLeft < currTask.getWorkingHours()) {
					currTask.setWorkingHours(currTask.getWorkingHours() - this.hoursLeft);
					this.hoursLeft = 0;
					showReport();
				} else {
					this.hoursLeft = 0;
					this.currTask.workingHours = 0;
					showReport();
					this.setCurrTask(null);
				}
			}
			System.out.println("---------------------------------------------------------");
		}
		if (this.getCurrTask() == null) {
			currTask = allWork.getNextTask();
//			if (this.getCurrTask() == null) {
//				return;
//			}
			//return;
		}
			
		
	}

	public void showReport() {
		System.out.println("name: " + this.name + " / today's  left hours: " + this.hoursLeft);
		System.out.println("task: " + this.currTask.name + " / task's left hours: " + this.currTask.getWorkingHours());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() >= 2 && name.matches("([A-Z][a-z-]+([ ])?)*")) {
			this.name = name;
		} // i da...razbiram tova otgore! :D
		else {
			System.out.println("Invalid name!");
		}
	}

	public Task getCurrTask() {
		return currTask;
	}

	public void setCurrTask(Task currTask) {

		this.currTask = currTask;

	}

	public int getWorkHours() {
		return hoursLeft;
	}

	public void setWorkHours(int workHours) {
		if (workHours > 0) {
			this.hoursLeft = workHours;
		}
	}

}
