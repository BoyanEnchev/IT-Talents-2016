import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EVEN array'size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextInt();
		}

		int[] newArr = new int[size];
		for (int index = 0, index2 = newArr.length - 1; index < newArr.length; index++) {
			if (index < newArr.length / 2) {
				newArr[index] = arr[index];
				System.out.print(newArr[index] + " ");
			} else {
				newArr[index] = arr[index2];
				index2--;
				System.out.print(newArr[index] + " ");
			}
		}
	}

}
