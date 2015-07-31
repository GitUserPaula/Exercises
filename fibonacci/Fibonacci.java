package fibonacci;

public class Fibonacci {

public static void main (String args []){
	
	int x = 1;
	int  prev = 0;
	int temp;
	
	for (int i = 0; i<10;i++) {
		System.out.println (x);
		temp = x;
		x = x + prev;
		prev = temp;
		
		}
		
	}
	
	
	
	
}
	
	

