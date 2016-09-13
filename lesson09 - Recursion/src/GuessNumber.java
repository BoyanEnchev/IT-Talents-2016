import java.util.Scanner;

public class GuessNumber {
	
	public static Scanner sc = new Scanner(System.in);

	public static void guess(int low, int high){
		int mid = (low + high)/2;
		System.out.println(mid + " ?");
	
		int num = sc.nextInt();
		
		if(num==1){
			System.out.println("Right choice! The number is " + mid);
			return;
		}
		if(num==0){
			guess(low, mid);
		}
		if(num==2){
			guess(mid+1, high);
		}
	}
	
	public static void main(String[] args) {
		guess(0,200);
	}

}
