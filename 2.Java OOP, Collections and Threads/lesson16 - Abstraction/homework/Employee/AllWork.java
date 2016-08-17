package employee;

public class AllWork {

	public static final int DEFFAULT_NUM_TASKS = 10;
	public static final int DEFFAULT_NUM_EMPLOYEES = 3;

	private Task[] tasks;
	private int numEmployees;
	private int numOfTasks;
	private int currentUnTask;

	public AllWork() {
		tasks = new Task[DEFFAULT_NUM_TASKS];
	}

	public void addTask(Task task) {

		if (numOfTasks < tasks.length) {
			tasks[numOfTasks] = task;
			this.numOfTasks++;
		} else {
			Task[] buffer = tasks;
			tasks = new Task[(int) (numOfTasks * 1.5)];
			for (int index = 0; index < buffer.length; index++) {
				tasks[index] = buffer[index];
			}
		}
	}

	public Task getNextTask() {

		if (currentUnTask < tasks.length) {
			return tasks[currentUnTask++];
		}
		System.out.println("All tasks are taken!");
		return null;
	}

	public boolean isAllWorkDone() {
		for (Task task : tasks) {
			if (task.getWorkingHours() > 0)
				return false;
		}
		return true;
	}

	public Task[] getTasks() {
		return tasks;
	}

	public int getNumOfTasks() {
		return numOfTasks;
	}

	public int getCurrentUnTask() {
		return currentUnTask;
	}

}
