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
			company.addEmployee(new Employee("Ivan", 2000, (byte) 19), "cink");
			company.addEmployee(penka, "med");
			company.addEmployee(gosho, "cink");
			company.addEmployee(pesho, "cink");
			company.addEmployee(pesho, "olovo");

			company.listEmployee();

			System.out.println("------------------------------------");

			/*Set<Employee> set = company.getEmployees("med", Arrays.asList(pesho,penka,gosho));
			
			for(Employee e : set){
				System.out.println(e.toString());
			}*/
			
			company.removeOverWorkers();
			company.listEmployee();

		} catch (CompanyException e) {
			// TODO: handle exception
		}

	}

}
