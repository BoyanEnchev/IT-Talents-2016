import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number A = ");
		int start = sc.nextInt();
		System.out.print("Enter the number B = ");
		int end = sc.nextInt();
		
		int sum = 0;
		
		while(start == end || sum <= 200){
			if(start % 3 != 0){
				sum += start*start;
				System.out.print(start*start + ", ");
			}
			else{
				System.out.print("skip " + start + ", ");
			}
			++start;
		}

	}

}
