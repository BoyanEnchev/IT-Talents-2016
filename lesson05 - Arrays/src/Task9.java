import java.util.Scanner;

public class Task9 {

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

		for (int index1 = 0, index2 = arr.length - 1; index1 < arr.length / 2; index1++, index2--) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}

		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + " ");
		}
	}

}
