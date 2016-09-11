package employee;

public class Employee {

	private String name = "";
	private Task currTask;
	private byte workHours;
	
	Employee(String name){
		setName(name);
		setWorkHours((byte) 8);
	}
	
	public void addTask(Task newTask){
		setCurrTask(newTask);
	}
	
	public void work(){
		if(this.currTask != null){
			
			if(workHours > currTask.getWorkingHours()){
				this.workHours -= currTask.getWorkingHours();
				currTask.setWorkingHours(0);
			}else{
				if(workHours < currTask.getWorkingHours()){
					this.workHours = 0;
					currTask.setWorkingHours(currTask.getWorkingHours() - this.workHours);
				}else{
					this.workHours = 0;
					this.currTask.workingHours = 0;
				}
			}
			showReport();
		}else{
			System.out.println("Employee has'n current task!");
		}
	}
	
	public void showReport(){
		System.out.println("name: " + this.name + " / today's  left hours: " + this.workHours);
		System.out.println("task: " + this.currTask.name + " / task's left hours: " + this.currTask.getWorkingHours());
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.length() >= 2 && name.matches("([A-Z][a-z-]+([ ])?)*")){									
			this.name = name;								
		}														//i da...razbiram tova otgore! :D 
		else{
			System.out.println("Invalid name!");
		}
	}
	public Task getCurrTask() {
		return currTask;
	}
	public void setCurrTask(Task currTask) {
		if(currTask != null){
			this.currTask = currTask;
		}
	}
	public byte getWorkHours() {
		return workHours;
	}
	public void setWorkHours(byte workHours) {
		if(workHours >0){
			this.workHours = workHours;
		}
	}
	
}
