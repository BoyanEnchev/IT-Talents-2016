package homework;

public class Employee extends Person {

	private double daySalary;
	
	Employee(String name, int age, Gender gender, double daySalary) {
		super(name, age, gender);
		
		this.daySalary = daySalary;
	}
	
	@Override
	public void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("day salary: " + this.daySalary);
	}
	
	public double calculateOvertime(double hours){
		if(this.getAge() < 18){
			System.out.println("The employee " + this.getName() + " is under 18 years old!");
			return 0;
		}
		else{
			return ((this.daySalary / 8) * 1.5) * hours;
		}
	}
}
