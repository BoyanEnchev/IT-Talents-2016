
public class Zad12 {

	public static void main(String[] args) {
		
		for(int num = 123; num <= 999; ++num){
			if((num/100 != (num / 10 % 10) && (num/100 != num % 10) && (num % 10 != (num / 10 % 10)))){
				System.out.println(num);
			}
		}
	}

}
