import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[32];

		int count = 31;
		int index = 0;

		if (num < 0) {
			while (count >= 0) {
				arr[index] = (num - 1 >> count) & 1;       //proverka za otricatelno chislo
				count--;
				index++;
			}
		} else {
			while (count >= 0) {
				arr[index] = (num >> count) & 1;
				count--;
				index++;
			}
		}
		
		for (int ind = 0; ind < arr.length; ind++) {
			System.out.print(arr[ind]);
		}

	}
}
