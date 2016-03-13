/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author Daniel
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        primeSieve(10000);
    }
    
    public static void primeSieve(int upperBound)
    {
        int upperBoundRoot = (int) Math.sqrt(upperBound);
        boolean[] isComposite = new boolean[upperBound + 1]; 
        
        for(int i = 2; i <= upperBoundRoot; i++)
        {
            
            if(!isComposite[i])
            {
                
                System.out.println("Prime number: " + i);
                
                
            
                for(int m = i*i; m <= upperBound; m+=i)
                {
                
                    
                    isComposite[m] = true;
                    
                }
                
            
            }
        }
        for(int k = upperBoundRoot; k <= upperBound; k++)
        {
            if(!isComposite[k])
            {
                if(k > 1){
                    System.out.println("Prime number: " + k);
                }
                else {
                    System.out.println("Not a prime: " + k);
                }
            }
            
        }
    }
    
}
