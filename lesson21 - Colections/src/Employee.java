import java.util.Random;

public class Employee {

	private String name;
	private int salary;
	private byte age;
	private int idNumber;
	private static int id;

	public Employee(String name, int salary, byte age) {

		if (name != null) {
			this.name = name;
		}
		if (salary > 0) {
			this.salary = salary;
		}
		if (age > 0) {
			this.age = age;
		}

		this.idNumber = ++Employee.id;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", idNumber=" + idNumber + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public byte getAge() {
		return age;
	}

	public int getIdNumber() {
		return idNumber;
	}

}
