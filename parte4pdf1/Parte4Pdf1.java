
package parte4pdf1;
import java.util.Scanner;

public class Parte4Pdf1 {
// leer 5 num y mostrarlos en el mismo orden introducido
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
               
        int a []=new int[5];
        
        for (int i=0;i<5;i++){
            
             System.out.println("ingresa 5 numeros");
             a [i]=entrada.nextInt();
             
        }
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
       
    }
    
}
