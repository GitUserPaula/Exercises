
package parte2pdf12;
import java.util.Scanner;

public class Parte2Pdf12 {
// pedir un numero y calcular su factorial 
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println(" Ingresa un numero");
        int n=entrada.nextInt();
        int resultado=1;
        
        
       for (int i=n;i>0;i--){
           
           resultado=resultado*i;
           
           
           System.out.println(resultado);
           
       }
       
           
       }
    
        
    }
    

