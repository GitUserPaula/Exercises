
package parte6pdf5;
import java.util.Scanner;

public class Parte6Pdf5 {
//pida dos numeros imprima los numeros entre ellos
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int n1=entrada.nextInt();
        System.out.println("Igresa otro numero");
        int n2=entrada.nextInt();
        int i=0;
        
        contador (n1,n2);
        
        
        
        
        
    }
    static void contador (int n1, int n2){
        int max=0;
        int men=0;
        if (n1>n2){
           n1=max; 
           n2=men;
        } else {
            n1=men;
            n2=max;
        }
        for (int i=men;i<=max;i++){
            System.out.println(i+"");
            
        }
        
        
    }
}
