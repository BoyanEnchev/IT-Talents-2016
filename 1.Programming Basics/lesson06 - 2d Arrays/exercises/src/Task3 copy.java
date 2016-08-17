import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers of day in the month: ");
		int monthLength = sc.nextInt();

		double[] temp = new double[monthLength];

		for (int index = 0; index < temp.length; index++) {
			System.out.println(index + " month: ");
			temp[index] = sc.nextDouble();
		}

		double sumTemp = 0;
		for (int index = 0; index < temp.length; index++) {
			sumTemp += temp[index];
		}
		double avgTemp = sumTemp / temp.length;
		System.out.println("The average temperature is: " + avgTemp);

		int count = 0;
		int maxCount = 0;
		for (int index = 0; index < temp.length; index++) {

			if (maxCount < count) {
				maxCount = count;
			}
			if (temp[index] < avgTemp) {
				count++;
			} else {
				count = 0;
			}
		}
		System.out.println("The longest period with low temp is in" + maxCount + " days");

		int count2 = 1, maxCount2 = 0;

		for (int index = 0; index < temp.length - 1; index++) {

			if (maxCount2 < count2) {
				maxCount2 = count2;
			}

			if (temp[index] > temp[index + 1]) {
				count2++;
			} else {
				count2 = 1;
			}
		}
		System.out.println("The coldest period is in" + maxCount2 + " days");
	}

}
