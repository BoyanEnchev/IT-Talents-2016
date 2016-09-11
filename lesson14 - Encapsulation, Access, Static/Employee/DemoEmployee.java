package employee;

public class DemoEmployee {

	public static void main(String[] args) {

		Employee peshko = new Employee("Petar Petrov");
		
		peshko.addTask(new Task("Shpaklovane",6));
		
		System.out.println("Before work:\n" + peshko.getName() + "'s left hours: " + peshko.getWorkHours() + 
							"\n" + peshko.getName() + "'s Task's left hours: " + peshko.getCurrTask().getWorkingHours() + "\n");
		
		System.out.println("After work:");
		peshko.work();

	}

}
