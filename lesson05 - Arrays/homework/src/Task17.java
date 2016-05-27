
public class Task17 {

	public static void main(String[] args) {

		int[] arr = { 1 };
		boolean flag = true;

		for (int i = 1; i < arr.length; i += 2) {
			if ((arr.length & 1) == 0 && arr.length != 2 && (i == arr.length - 1)) {
				if (arr[arr.length - 1] <= arr[arr.length - 2]) {
					flag = false;
				}
				break;
			} else {
				if (arr.length == 2) {
					if (arr[0] >= arr[1]) {
						flag = false;
						break;
					}

				} else {
					if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
						flag = false;
						break;
					}
				}
			}

		}
		if (flag) {
			System.out.println("YES!");
		} else {
			System.out.println("NO!");
		}
	}
}
