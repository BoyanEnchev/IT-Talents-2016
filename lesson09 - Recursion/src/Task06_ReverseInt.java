
public class Task06_ReverseInt {

	public static int reverseInt(int number){
		if(number < 10){
			return number;
		}
		else{
			return ((number % 10) * (int)Math.pow(10, (int)Math.log10(number)) + reverseInt(number/10));
		}
	}
	
	public static void main(String[] args) {
			System.out.println(reverseInt(3456));
	}
}
