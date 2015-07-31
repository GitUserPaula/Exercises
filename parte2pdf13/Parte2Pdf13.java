
package parte2pdf13;
import java.util.Scanner;

public class Parte2Pdf13 {
//pedir 10 num mostrar media de los posit,media de los negat y cantidad de ceros
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println(" Ingresa un numero");
        int n=entrada.nextInt();
        int contcer=0;
        int contpos=0;
        int contneg=0;
        int sump=0;
        int sumn=0;
        
        
        
        for (int i=1;i<=10;i++) {
            System.out.println(" Ingresa un numero");
            n=entrada.nextInt();
            
            if (n==0){
                contcer++;
            } if (n<0) {
                contneg++;
                sumn+=contneg+n;
            } if (n>0) {
                contpos++;
                sump+=contpos+n;
            }          
            
                
            }
        System.out.println(" El numero de ceros introducidos es: "+contcer);
        
         System.out.println(" La media de los negativos es:" + (float)sumn/contneg);
        
        
         System.out.println(" La media de los positivos es: " + (float) sump/contpos);
        }
        
            
        }
        
        
        
        
    
   


        
        
        
        
        
    


            
            
                
            
            
        
            
        
        
    

