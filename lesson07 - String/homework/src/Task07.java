import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		String[] words = text.split(" ");
		int count = 0;
		
		for (int index = 0; index < words.length; index++) {
			if(words[index].length() > count){
				count = words[index].length();
			}
		}
		
		System.out.println(words.length + " words. The longest word is with "+ count + " chars.");
	}

}
