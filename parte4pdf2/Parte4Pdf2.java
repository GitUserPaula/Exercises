
package parte4pdf2;
import java.util.Scanner;

public class Parte4Pdf2 {
// leer 5 num y mostrarlos al inverso
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int [] b= new int [5];
        
        for (int i=0;i<5;i++){
            System.out.println("Ingresa un numero");
            b[i]=entrada.nextInt();
        }
        for (int i=4;i>=0;i--){
            System.out.println (b[i]);
            
        }
    }
    
}
