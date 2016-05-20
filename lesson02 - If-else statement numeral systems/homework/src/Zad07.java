package homework;

public class Zad7 {

	public static void main(String[] args) {
		
		int hour = 19;
		double money = 15.65;
		boolean isIll = false;
		
		if(hour < 8 || hour > 23){
			System.out.println("I sleep between 23:00 and 8:00 o'clock.");
		}
		else{
			if(isIll){
				System.out.println("I will not go out, because I'm ill.");
				if(money>0){
					System.out.println("I' ll by medical supplies.");
				}
				else{
					System.out.println("I'll stay at home and I'll drink tea.");
				}
			}
			else{
				if(money<10){
					System.out.println("I'll go to the cafe.");
				}
				else{
					System.out.println("I'll go to the cinema with friends.");
				}
			}
		}
		
	}

}
