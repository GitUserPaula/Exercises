
package parte2pdf11;


public class Parte2Pdf11 {
//mostrar el producto de los 10 primeros numeros impares 
    
    public static void main(String[] args) {
        
        int n=0;
        int producto=1;
        
        for  (int i=1;i<=10;i+=2) {
           producto=producto*i;
            
            System.out.println(producto);
        }
        
    }
    
}
