package hospital;

public abstract class Person {

	protected String name;
	protected int age;
	protected String number;
	protected Gender gender;

	public Person(String name, int age, String number, Gender gender) {
		if (name != null && name.matches("[A-Za-z- ]+")) {
			this.name = name;
		}
		if (age > 0) {
			this.age = age;
		}
		setNumber(number);
		this.gender = gender;
	}

	public abstract void getInfo();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String getNumber() {
		return this.number;
	}

	void setNumber(String number) {
		if (number != null && number.length() == 10 && number.matches("[0-9]+")) {
			this.number = number;
		} else {
			System.out.println("Invalid number!");
			this.number = "invalid";
		}
	}
}
