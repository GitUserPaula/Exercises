
package parte2pdf10;
import java.util.Scanner;

public class Parte2Pdf10 {
//pedir 15 num y escribir la suma total 
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int sum=0;
        
        
        for (int i=1;i<=25;i++) {
            System.out.println("Ingresa un numero");
            int n=entrada.nextInt();
            
            sum=sum+n;
            i++;
        }
        System.out.println(sum);
    }
    
}
