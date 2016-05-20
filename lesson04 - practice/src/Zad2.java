
public class Zad2 {

	public static void main(String[] args) {

		//Task2. Write a program that prints all odd numbers between 0 and 50 and all even numbers 
		// * between 51 and 100.

		for (int i =0; i<=100; ++i){
			if((i & 1) == 1 && i<50){
				System.out.println(i + " ");
			}
			if((i & 1) == 0 && i >=50){
				System.out.println(i+ " ");
			}
		}
	}

}
