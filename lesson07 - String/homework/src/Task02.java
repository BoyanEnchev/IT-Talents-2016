import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String text1 = sc.nextLine();
		String text2 = sc.nextLine();
		
		String temp1 = text1.substring(0, 5);
		String temp2 = text2.substring(0, 5);
		
		text1 = text1.replace(temp1, temp2);
		text2 = text2.replace(temp2, temp1);
		
		if(text1.length() > text2.length()){
			System.out.println("text1 is bigger than text2. Length: " + text1.length());
			System.out.println("text1: " + text1 + "/n text2: " + text2);
		}
		else{
			if(text1.length() < text2.length()){
				System.out.println("text2 is bigger than text1. Length: " + text2.length());
				System.out.println("text1: " + text1 + "/n text2: " + text2);
			}
			else{
				System.out.println("They are equals. Length: " + text1.length());
				System.out.println("text1: " + text1 + "/n text2: " + text2);
			}
		}
	}

}
