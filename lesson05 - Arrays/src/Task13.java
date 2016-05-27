import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter size of array: ");
		size = sc.nextInt();

		double[] arr = new double[size];
		double[] newArr = new double[size];
		int count = 0;

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextDouble();

			if (arr[index] >= -2.99) {
				if (arr[index] <= 2.99) {
					newArr[count] = arr[index];
					++count;
				}
			}
		}
		for (int index = 0; index < count; index++) {
			System.out.print(newArr[index] + " ");
		}
	}

}
