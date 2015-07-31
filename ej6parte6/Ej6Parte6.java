
package ej6parte6;
import java.util.Scanner;
public class Ej6Parte6 {
//metodo que muestra en panta el doble del valor que se le pase
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Ingresa un numero");
        int n= input.nextInt();
        
        System.out.println("El doble de tu numero es:" +doble (n));
        
        
    }
    public static int doble(int n){
        int num=1;
        
        if (num >0){
            
            num=n*2;
        }
        return num;
        
    }
}
