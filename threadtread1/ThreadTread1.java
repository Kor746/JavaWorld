/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtread1;

/**
 *
 * @author Daniel
 */
public class ThreadTread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        long sum;
        long t1,t2;
        long MAX_LENGTH = 1000000000L;
        HelperThread ht1 = new HelperThread(1, MAX_LENGTH/2);
        HelperThread ht2 = new HelperThread(MAX_LENGTH/2 + 1, MAX_LENGTH);
        
        
        
        
       
        Thread n1 = new Thread(ht1);
        Thread n2 = new Thread(ht2);
        
        t1 = System.nanoTime();
        n1.start();
        n2.start();
        
        n1.join();
        n2.join();
        
        
        sum = ht1.getTotal() + ht2.getTotal();
        t2 = System.nanoTime();
        double time = (t2 - t1) / 1000000.0;
        System.out.println("Sum: " + sum);
        System.out.println("Time elapsed: " + time + " ms" );
        
        
        
       
    }
    
    
    
}
