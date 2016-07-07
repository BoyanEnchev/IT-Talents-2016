package student;

public class College {

	public static void main(String[] args) {

		
		Student pesho = new Student("Petar", Subject.ComputerScience,(byte) 3, 5.20,(byte)21,false,1000);
		Student misho = new Student("Mihail", Subject.ComputerScience,(byte)2,3.45,(byte)22,false,300);
		Student ani = new Student("Ana-Mariq",Subject.ComputerScience,(byte)1,5.80,(byte)19,false,0);
	
		StudentGroup group1 = new StudentGroup(Subject.ComputerScience);
		group1.addStudent(pesho);
		group1.addStudent(misho);
		group1.addStudent(ani);
		
		group1.printStudentsInGroup();
		
		System.out.println("\nThe student with number 2 is: " + group1.getStudentByIndex(1).getName() + "\n");  
		
		System.out.println("Petar graduated " + pesho.getYearInCollege() + " year successfully.");
		pesho.upYear();
		
		System.out.println("\nBest student in group1: " + group1.getGroupSubject().name() + " is: " + group1.bestStudent());
		
	}

}
