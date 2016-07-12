package homework;

public class Demo {

	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		Person pesho = new Person("Pesho", 23, Gender.Male);
		Person miha = new Person("Mihaela", 19, Gender.Female);
		Person sasho = new Student("Aleksandur", 16, Gender.Male, 4.12);
		Person misho = new Student("Mihail Brezin", 22, Gender.Male, 5.86);
		Person gosho = new Employee("Georgi", 43, Gender.Male, 80);
		Person adi = new Employee("Adelina",17, Gender.Female, 64);
		
		persons[0] = pesho;
		persons[1] = miha;
		persons[2] = sasho;
		persons[3] = misho;
		persons[4] = gosho;
		persons[5] = adi;
		
		for (int index = 0; index < 6; index++) {
			persons[index].showPersonInfo();
			System.out.println();
		}
		
		System.out.println("Employees`s overtime:");
		
		for (int index = 0; index < 6; index++) {
			if(persons[index].getClass().equals(Employee.class)){
				System.out.println(persons[index].getName() + " : " + ((Employee) persons[index]).calculateOvertime(2));
			}
		}
	}

}
