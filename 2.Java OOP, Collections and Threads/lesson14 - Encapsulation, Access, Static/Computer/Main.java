package computer;

public class Main {

	public static void main(String[] args) {

		Computer mac = new Computer(2014, 1500, false, 8000, 4000, OperationSystem.Mac);
		Computer dell = new Computer(2016, 2800, true, 16000, 10800, OperationSystem.Windows);

		System.out.println("Before useMemory() the memory is: " + mac.freeMemory);
		mac.useMemory(100);
		System.out.println("After useMemory() the memory is: " + mac.freeMemory);

		dell.changeOperationSystem(OperationSystem.Linux);
		System.out.println("dell`s new operation system: " + dell.opSystem);
		
		
		
		if(mac.comparePrice(dell)==-1){
			System.out.println("The mac is more expensive than dell!");
		}else{
			if(mac.comparePrice(dell) == 1){
				System.out.println("The dell is more expensive than mac!");
			}else{
				System.out.println("The have equal price!");
			}
		}
	}
}
