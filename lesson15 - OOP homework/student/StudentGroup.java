package student;

public class StudentGroup {
	
	final static byte STUDENTS_MAX_COUNT = 30;

	private Subject groupSubject;
	private Student[] students;
	private byte freePlaces;
	private byte countStudents;
	
	StudentGroup(){
		students = new Student[30];
		freePlaces = STUDENTS_MAX_COUNT;;
	}
	
	StudentGroup(Subject groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	public void addStudent(Student student){
		if(student.getSubject().name().compareTo(this.groupSubject.name())==0 && this.countStudents < STUDENTS_MAX_COUNT){
			this.students[countStudents] = student;
		}
		this.countStudents++;
	}
	
	public void emptyGroup(){
		this.students = new Student[30];
		this.freePlaces = STUDENTS_MAX_COUNT;
		this.countStudents = 0;
	}
	
	public String bestStudent(){
		
		if(!isEmptyGroup()){
			String nameBestStudent = students[0].getName();
			double maxGrade = students[0].getGrade();
			
			for(int index=1; index<this.countStudents; index++){
				if(students[index].getGrade() > maxGrade){
					nameBestStudent = students[index].getName();	
					maxGrade = students[index].getGrade();
				}
			}
			return nameBestStudent;
		}
		return "The Group is Empty!";
	}
	
	public boolean isEmptyGroup(){
		if(this.countStudents == 0) return true;
		return false;
	}
	
	public void printStudentsInGroup(){
		for (int index = 0; index < this.countStudents; index++) {
			System.out.println(students[index].getName() + ": " + students[index].getSubject().name() + 
			" course: " + students[index].getYearInCollege() + "  grade: " + students[index].getGrade());
		}
	}
	
	public Student getStudentByIndex(int index){
		if(index >= 0 && index < this.countStudents){
			return students[index];
		}
		return null;
	}
	
	public Subject getGroupSubject(){
		return this.groupSubject;
	}
}












