import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		
		String[] names = text.split(",");
		int count1 = 0, count2 = 0;
		for (int index = 0; index < names[0].length(); index++) {
			if(names[0].charAt(index) != ' '){
				count1+= names[0].charAt(index);
			}
		}
		
		for (int index = 0; index < names[1].length(); index++) {
			if(names[1].charAt(index) != ' '){
				count2+= names[1].charAt(index);
			}
		}
	
		if(count1 > count2){
			System.out.println(names[0]);
		}
		else{
			if(count1 < count2){
				System.out.println(names[1]);
			}
			else{
				System.out.println("They are equals!");
			}
		}
	}

}
