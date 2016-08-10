package company;

import java.time.Month;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import comparators.AgeComparator;
import comparators.NameComparator;
import comparators.SalaryComparator;

public class Company {

	private String name;

	// department name -> set of employees that work in this department
	private Map<String, HashSet<Employee>> employees;
	// employees salaries for-each month
	private Map<Employee, LinkedHashMap<Month, Integer>> employeesSalaries;

	public Company(String name) throws CompanyException {
		if (name != null && name.length() != 0) {

			this.employees = new HashMap<String, HashSet<Employee>>();
			this.employeesSalaries = new HashMap<Employee, LinkedHashMap<Month, Integer>>();

		} else {
			throw new CompanyException("Nevalidno suzdavane na obekta company!");
		}
	}

	public void addEmployee(Employee employee, String departament) throws CompanyException {
		if (employee != null && departament != null) {
			if (!this.employees.containsKey(departament)) {
				this.employees.put(departament, new HashSet<Employee>());
			}

			HashSet<Employee> temp = this.employees.get(departament);
			temp.add(employee);
			this.employeesSalaries.put(employee, getRandomMonthSalaries());

		} else {
			throw new CompanyException("Nevalidno dobavqne ! Probvai pak!");
		}
	}

	private LinkedHashMap<Month, Integer> getRandomMonthSalaries() {

		LinkedHashMap<Month, Integer> tempMap = new LinkedHashMap<Month, Integer>();
		Random r = new Random();

		for (int index = 1; index <= 12; index++) {
			tempMap.put(Month.of(index), r.nextInt(2000) + 500);
		}
		return tempMap;
	}

	public void listEmployeeSalaries() {
		for (Employee e : this.employeesSalaries.keySet()) {
			Map<Month, Integer> tempMap = this.employeesSalaries.get(e);

			System.out.println(e.toString());
			tempMap.forEach((month, salary) -> System.out.println(month + " : " + salary + " lv"));
			System.out.println("----------------------------------------------------------");
		}
	}

	public void listEmployee() {
		for (Entry<String, HashSet<Employee>> entry : this.employees.entrySet()) {
			String departament = entry.getKey();
			Set<Employee> employeesInThisDepartament = entry.getValue();

			System.out.println("Department: " + departament);

			for (Employee employee : employeesInThisDepartament) {
				System.out.println(employee.toString());
			}

		}
	}

	public SortedSet<Employee> getEmployees(SortCriteria sortByWhat) {
		SortedSet<Employee> result = new TreeSet<Employee>(getComparator(sortByWhat));

		for (Entry<String, HashSet<Employee>> entry : this.employees.entrySet()) {

			result.addAll(entry.getValue());
		}

		return result;
	}

	public SortedSet<Employee> getEmployees(String departament, Collection<Employee> listOfEmployees)
			throws CompanyException {

		if (departament != null && this.employees.containsKey(departament)) {
			Set<Employee> employeeInThisDep = this.employees.get(departament);

			SortedSet<Employee> result = new TreeSet<Employee>(new NameComparator());

			for (Employee e : listOfEmployees) {
				if (employeeInThisDep.contains(e)) {
					result.add(e);
				}
			}
			return result;
		} else {
			throw new CompanyException("Kuv e toq departament ili collection we ?");
		}

	}

	public void removeOverWorkers() {

		for (String department : employees.keySet()) {
			Set<Employee> employeesInThisDep = employees.get(department);

			for (String department2 : employees.keySet()) {
				if (!(department.equals(department2))) {
					Set<Employee> employeesInThisDep2 = employees.get(department2);
					employeesInThisDep2.removeAll(employeesInThisDep);
				}
			}
		}
	}

	private Comparator<? super Employee> getComparator(SortCriteria sortByWhat) {
		switch (sortByWhat) {
		case AGE:
			return new AgeComparator();
		case SALARY:
			return new SalaryComparator();
		case NAME:
			return new NameComparator();
		default:
			return new NameComparator();
		}

	}

	public String getName() {
		return name;
	}

}
