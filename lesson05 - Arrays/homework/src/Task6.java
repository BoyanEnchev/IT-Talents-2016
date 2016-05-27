import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size1, size2;
		System.out.print("Enter size of first array: ");
		size1 = sc.nextInt();
		System.out.print("Enter size of second array: ");
		size2 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		for (int index = 0; index < arr1.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr1[index] = sc.nextInt();
		}
		for (int index = 0; index < arr2.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr2[index] = sc.nextInt();
		}
		
		if(size1 != size2){
			System.out.println("The arrays are not equal, because their sizes are different.");
		}
		else{
			boolean flag = true;
			for (int index = 0; index < arr2.length; index++) {
				if(arr1[index] != arr2[index]){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("The arrays have equal size and elements.");
			}
			else{
				System.out.println("The arrays have equal size, but different elements.");
			}
		}
	}

}
