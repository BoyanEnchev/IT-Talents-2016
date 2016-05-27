import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");    //if num==1 => Fibonacci :D
		int num = sc.nextInt();

		int[] arr = new int[10];
		
		for (int index = 0; index < arr.length; index++) {
			if(index == 0 || index == 1){
				arr[index] = num;
			}
			else{
				arr[index] = arr[index-1] + arr[index-2];
			}
		}
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + " ");
		}
	}

}
