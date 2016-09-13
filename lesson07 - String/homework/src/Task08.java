import java.util.Scanner;

public class Task8 {
	
	public static boolean isPalindrome(String word){
		int start = 0, end = word.length()-1;
		
		while(start < end){
			if(word.charAt(start) != word.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("Is text palindrome: " + isPalindrome(text));
	}

}
