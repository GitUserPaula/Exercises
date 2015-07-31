
package fibonacci2;
import java.util.Scanner;

public class Fibonacci2 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in); 
        int num1=0;
        int num2=1;
        int temp;
        
       
        
        for (int i = 0; i < 10; i++  ){
           System.out.println(num1);
           temp = num1;
           num1 =num1 + num2;
           num2 = temp;
           
        }
        
        
        
        
    }
    
}
