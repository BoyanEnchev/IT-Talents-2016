package Main;

import java.util.Arrays;

public class CombinationWithRepetion {
	
	public static void Generate(int[] arr, int sizeOfSet, int index, int start){
		
		if(index >= arr.length) System.out.println(Arrays.toString(arr));
		else{
			for(int i=start; i<=sizeOfSet; ++i){
				arr[index] = i;
				Generate(arr, sizeOfSet, index+1, i);
			}
		}
	}

}
