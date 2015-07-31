
package recursivdad;


public class Recursivdad {

    
    public static void main(String[] args) {
        
        
        
        int i=1;
        
        for (int n=1;i<10;i++) {
            System.out.println(factorial(i));
            
            
        }
        
        
        
    }
    
        
    public static int factorial (int n) {
        int resultado;
       
        if (n<=1){
            return 1;            
        }
        else {
            return resultado=n*factorial (n-1);
        }
      
    }
}

    



        
        
    




    
    
        
    




    
        
        
    



    
    
        
        
        
    


