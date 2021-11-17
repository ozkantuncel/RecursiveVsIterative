
package pkg21kasimbbg;


public class Main {

    
     public static void main(String[] args) {
        
        long startTime1 = System.nanoTime();
         
        Fack fack = new Fack();
       
        System.out.println(fack.Fak(5));
        
        
        long endTime1 = System.nanoTime();
        
        long startTime2 = System.nanoTime();
        
        
        System.out.println(fack.Fak2(5)); 
        
       
        
        long endTime2 = System.nanoTime();
        
        System.out.println("Recursive : " + (endTime1 - startTime1) + " nanoTime");
        System.out.println("Iterative: " + (endTime2 - startTime2) + " nanoTime");
       
    }
     
    

}

class Fack{
    public int Fak(int n){
    //Recursive
    if(n<=1){
        return 1;
    }
    return n*Fak(n-1);
    }
    //Iterative
    public int Fak2(int n){
        int sonuc = 1;
        for(int i=1;i<=n;i++){
            sonuc*=i;
        }
        return sonuc;
    }
    
    
}
