import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int first = sc.nextInt();
		System.out.print("Enter num = ");
		int second = sc.nextInt();
		
		if(first < 50 || first > 5555 || second < 50 || second > 5555){
			System.out.println("Invalid input!");
		}
		else{
			if(first > second){
				while((first % 50) != 0){		//Optimizirame, za da napravim 50 puti
					first--;					//po-malko iteracii vuv for-cikula.	
				}
				
				for(int i=first; i>second; i-=50){
					System.out.println(i);
				}
			}
			
			else{
				while((second % 50) == 0){
					second--;
				}
				
				for(int i=second; i>first; i-=50){
					System.out.println(i);
				}
			}
		}
	}

}
