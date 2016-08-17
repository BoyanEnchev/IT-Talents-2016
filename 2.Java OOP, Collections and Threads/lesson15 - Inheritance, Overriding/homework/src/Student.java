package homework;

public class Student extends Person {
	
	private double score;
	
	Student(String name, int age, Gender gender, double score){
		super(name,age,gender);
		
		this.score = score;
	}
	
	@Override
	public void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("score: " + this.score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score >= 2 && score <= 6){
			this.score = score;
		}
		else{
			System.out.println("Invalid score! The score must be in [2..6");
		}
	}
	
	
}
