
package parte4pdf3;

import java.util.Scanner;


public class Parte4Pdf3 {
//leer 5 num, media de los pos neg y cant de ceros
    
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     System.out.println("Ingresa un numero");
     int [] a;
     a=new int [5];
     
     int contcer=0;
     int contpos=0;
     int contneg=0;
     int sumpos=;
     int sumneg=0;
     
     for (int i=0;i<5;i++){
         
         a[i]=entrada.nextInt();
         if (a[i]==0){
             contcer++;
         } if (a[i]>0){
             sumpos=contpos + a[i];
             contpos++;
         } if (a[i]<0){
             sumneg=contneg + a[i];
             contneg++;
         }     
         
         
             
         }
          System.out.println("La cantidad de ceros introducidos es: "+contcer);   
     
         
         
         System.out.println("La media de los positivos es: " +(float)sumpos/contpos);
        
         System.out.println("La media de los negativos es: "+(float)sumneg/contneg);
         }
     }
     
        
        
    
    

