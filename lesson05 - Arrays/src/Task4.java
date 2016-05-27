import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EVEN array'size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		boolean flag = true;

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextInt();
		}

		for (int index1 = 0, index2 = arr.length - 1; index1 < arr.length / 2; index1++, index2--) {
			if (arr[index1] != arr[index2]) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("The array is mirror-image.");
		} else {
			System.out.println("The array is NOT mirror-image.");
		}
	}

}
