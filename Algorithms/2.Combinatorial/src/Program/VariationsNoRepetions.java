package Main;

import java.util.Arrays;

public class VariationsNoRepetions {
	
	public static void Genenarate(int[] arr, int sizeOfSet, int index){
		
		boolean[] used = new boolean[sizeOfSet];
				
		if ( index >= arr.length) System.out.println(Arrays.toString(arr));
		else{
			for(int i=1; i<sizeOfSet; ++i){
				if(!used[i]){
					used[index] = true;
					arr[index] = i;
					
					Genenarate(arr, sizeOfSet, index+1);
					
					used[index] = false;
				}
			}
		}
		
	}
}
