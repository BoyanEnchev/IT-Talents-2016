package employee;

public class Task {

	String name;
	int workingHours;
	boolean isTaken;

	Task() {
		this.name = "no name";
		isTaken = false;
	}

	Task(String name, int workingHours) {
		this();
		setName(name);
		setWorkingHours(workingHours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() >= 2) {
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
}
