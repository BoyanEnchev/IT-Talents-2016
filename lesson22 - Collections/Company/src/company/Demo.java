package company;

import java.util.Arrays;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		try {
			Employee pesho = new Employee("Pesho", 333,(byte) 19);
			Employee penka = new Employee("Penka", 333,(byte) 19);
			Employee gosho = new Employee("Gosho", 333,(byte) 19);

			Company company = new Company("Vinkel OOD");

			company.addEmployee(pesho, "med");
			company.addEmployee(penka, "cink");
			company.addEmployee(gosho, "cink");
			company.addEmployee(new Employee("Ivan", 2000, (byte) 19), "cink");
			company.addEmployee(new Employee("Petkan", 2445, (byte) 24), "olovo");
			company.addEmployee(new Employee("Mirela", 450, (byte) 18), "med");
			company.addEmployee(new Employee("Dragan", 800, (byte) 32), "med");
			company.addEmployee(new Employee("Katerina", 1500, (byte) 28), "olovo");

			
			System.out.println("Employees by department: \n");
			company.listEmployee();

			System.out.println("------------------------------------");
			
		
			/*Set<Employee> set = company.getEmployees("med", Arrays.asList(pesho,penka,gosho));
			
			for(Employee e : set){
				System.out.println(e.toString());
			}
			
			company.removeOverWorkers();
			company.listEmployee();
			*/
			
			company.listEmployeeSalaries();		// Random salaries for every employee for-each month

		} catch (CompanyException e) {
			// TODO: handle exception
		}

	}

}
