import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter size of array: ");
		size = sc.nextInt();

		double[] arr = new double[size];

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextDouble();
		}

		for (int index1 = 0; index1 < arr.length - 1; index1++) { 			// sort
			for (int index2 = index1; index2 < arr.length; index2++) {
				if (arr[index1] > arr[index2]) {
					double temp = arr[index2];
					arr[index2] = arr[index1];
					arr[index1] = temp;
				}
			}
		}
		int count1 = 0;
		int count2 = arr.length - 1;
		
		for(int i = 0; i < 3; i++){
			if(Math.abs(arr[count1]) < Math.abs(arr[count2])){
				System.out.print(arr[count2] + " ");
				count2--;
			}
			else{
				System.out.print(arr[count1] + " ");
				count1++;
			}
		}
	}

}
