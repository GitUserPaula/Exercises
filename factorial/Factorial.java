package factorial;
import java.util.Scanner;


public class Factorial {

	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter the number to calculate the factorial serie: ");
		int num = input.nextInt();
		int product = 1;
		
		for (int i = 1; i <= num; i++){
			product = product * i;
			System.out.println(product);
		}
		
		
		
		
	}
}
	

