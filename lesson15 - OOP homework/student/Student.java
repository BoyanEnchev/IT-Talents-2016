package student;

public class Student {
	
	private String name;
	private Subject subject;
	private byte yearInCollege;
	private double grade;
	private byte age;
	private boolean isDegree;
	private double money;
	
	
	Student(){
		name = "noName";
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, Subject subject, byte yearInCollege){
		this();
		setName(name);
		this.subject = subject;
		setYearInCollege(yearInCollege);
	}
	
	Student(String name, Subject subject, byte yearInCollege, double grade, byte age, boolean isDegree, double money){
		this(name, subject, yearInCollege);
		setGrade(grade);
		this.isDegree = isDegree;
		setMoney(money);
	}
	
	public void upYear(){
		if(this.yearInCollege >= 3){
			this.yearInCollege = 4;
			this.isDegree = true;
			System.out.println("Congratulations. " + this.name + " finished the education!");
		}
		else{
			this.yearInCollege++;
		}
	}
	
	public double receiveSchoolarship(double min, double amount){
		if(this.grade > min && this.age < 30){
			this.money -= amount;
		}
		else{
			System.out.println("You cannot receive a schoolarship!");
		}
		return this.money;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	private void setName(String name) { //private, za da mojem da izpolzvame setName samo v constructor-a (better encapsulation)
		if(name != null && name.length() >= 2 && name.matches("([A-Z][a-z-]+([ ])?)*")){									
			this.name = name;								
		}														//i da...razbiram tova otgore! :D 
		else{
			System.out.println("Invalid name!");
		}
	}
	public Subject getSubject() {
		return subject;
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		if(grade >= 2 && grade <= 6.00)
			this.grade = grade;
	}
	public byte getYearInCollege() {
		return yearInCollege;
	}
	private void setYearInCollege(byte yearInCollege){
		if(yearInCollege > 0 && yearInCollege <= 4){
			this.yearInCollege = yearInCollege;
		}
	}
	public byte getAge() {
		return age;
	}
	private void setAge(byte age) {
		this.age = age;
	}
	public boolean isDegree() {
		return isDegree;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if(money > 0)
			this.money = money;
	}
}

