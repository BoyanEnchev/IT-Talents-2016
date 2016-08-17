import java.util.Scanner;

public class Task10 {
	
	public static String wordPlusFive(String word){
		
		for (int index = 0; index < word.length(); index++) {
			word = word.substring(0,index) + (char)(word.charAt(index)+5) + word.substring(index+1);
		}
		return word;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		
		System.out.println(wordPlusFive(text));
		
	}

}
