package homework;

public class Person {

	private String name;
	private int age;
	private Gender gender;
	
	Person(String name, int age, Gender gender){
		setName(name);
		if(age > 0 && age < 100){
		this.age = age;
		}
		this.gender = gender;
	}

	public void showPersonInfo(){
		System.out.println("name: " + name + "\nage: " + age + "\ngender: " + gender);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && name.matches("[A-Za-z- ]+")){
			this.name = name;
		}else{
			System.out.println("Invalid input name");
			this.name = "no name";
		}
	}

	public int getAge() {
		return age;
	}

}
