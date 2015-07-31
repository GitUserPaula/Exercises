
package parte4pdf4;

import java.util.Scanner;


public class Parte4Pdf4 {
//leer 10 num orden:primero, ultimo, segundo, el penultimo, tercero
    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.println("Ingresa un numero");
       int a[];
       a=new int [10];
       
       for (int i=0;i<10;i++){
           
           a[i]=entrada.nextInt();      
           
           
           
       }
       for (int i=0;i<=4;i++){
           System.out.println(" El resultado es: " +a[i]);
           System.out.println("El orden es: "     +a[9-i]);
       }
       
       
       
       
       
    }
    
}
