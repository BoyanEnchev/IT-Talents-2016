package employee;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		AllWork allWork = new AllWork();
		Employee[] employees = new Employee[3];

		employees[0] = new Employee("Petar Petrov", allWork);
		employees[1] = new Employee("Georgi Penchev", allWork);
		employees[2] = new Employee("Mihail Brenkov", allWork);

		allWork.addTask(new Task("Task1", 1));
		allWork.addTask(new Task("Task2", 1));
		allWork.addTask(new Task("Task3", 1));
		allWork.addTask(new Task("Task4", 1));
		allWork.addTask(new Task("Task5", 1));
		allWork.addTask(new Task("Task6", 1));
		allWork.addTask(new Task("Task7", 1));
		allWork.addTask(new Task("Task8", 1));
		allWork.addTask(new Task("Task9", 1));
		allWork.addTask(new Task("Task10", 1));

		while (!allWork.isAllWorkDone()) {

			for (Employee employee : employees) {

				employee.work();
			}

			boolean flag = true;
			for (int index = 0; index < employees.length; index++) {
				if (!(employees[index].getWorkHours() == 0 || employees[index].getCurrTask() == null)) {
					flag = false;
				}
			}

			if (flag) {
				for (Employee employee : employees) {
					employee.setWorkHours(8);
				}
				System.out.println("NEW DAY");
			}
		}
	}

}
