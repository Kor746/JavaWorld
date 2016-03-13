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
public class HelperThread implements Runnable{
    
    private long start;
    private long sum;
    private long n;
  
    public HelperThread(long start, long n)
    {
       this.start = start;
       this.n = n;
       this.sum = 0;
    }
    
    
    
    public long getTotal()
    {
        return sum;
    }
    @Override
    public void run()
    {
        sum = 0;
        for(long i = start; i <= n; ++i)
        {
            sum += i;
        }
        
    }
}
