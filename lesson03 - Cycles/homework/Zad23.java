
public class Zad23 {

	public static void main(String[] args) {
		
		int a=1;
		
		while(a <= 9){
			int b = a;
			while(b <= 9){
				System.out.print(a + "*" + b + "  ");
				b++;
			}
			a++;
			System.out.println();
		}

	}

}
