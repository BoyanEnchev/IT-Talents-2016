import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter size of array: ");
		size = sc.nextInt();

		int[] arr = new int[size];

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextInt();
		}

		int[] newArr = new int[size];
		newArr[0] = arr[0];
		newArr[size - 1] = arr[size - 1];

		for (int index = 1; index < newArr.length - 1; index++) {
			newArr[index] = arr[index - 1] + arr[index + 1];
		}

		for (int index = 0; index < newArr.length; index++) {
			System.out.println(newArr[index] + " ");
		}

	}

}