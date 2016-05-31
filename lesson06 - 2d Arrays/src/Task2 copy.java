import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		String[] names = new String[3];
		double[] salary = new double[3];

		Scanner sc = new Scanner(System.in);

		for (int index = 0; index < names.length; index++) {
			System.out.println("Enter name " + index + " :");
			names[index] = sc.nextLine();
			System.out.println("Enter money " + index + " :");
			salary[index] = sc.nextDouble();
			sc.nextLine();
		}

		double max = salary[0];
		double min = salary[0];
		int maxIndex = 0;
		int minIndex = 0;
		double sum = 0;

		for (int index = 0; index < salary.length; index++) {
			if (salary[index] > max) {
				max = salary[index];
				maxIndex = index;
			}
			if (salary[index] < min) {
				min = salary[index];
				minIndex = index;
			}
			sum += salary[index];
		}

		System.out.println("The richest + " + names[maxIndex]);
		System.out.println("The poorest " + names[minIndex]);
		System.out.println("The sum is " + sum);
		System.out.println("Half aritmetic is : " + sum / salary.length);
	}

}
